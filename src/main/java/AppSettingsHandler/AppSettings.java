package AppSettingsHandler;

import FileReader.IFileReader;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;

/** The type App settings. */
@Singleton
public class AppSettings implements IAppSettings {
  private Map appSetting;
  private IFileReader fileReader;
  private String fullPath;

  /**
   * Instantiates a new App settings.
   *
   * @param fileReader the file reader
   */
  @Inject
  public AppSettings(IFileReader fileReader) {
    this.fileReader = fileReader;
  }

  @Override
  public String getFileName() {
    return "AppSettings";
  }

  @Override
  public Object getValue(String key) {
    if (appSetting == null) {
      this.fullPath = fileReader.findFile(getFileName());
      appSetting = fileReader.openFile(fullPath);
    }

    return fileReader.getValue(appSetting, key);
  }
}
