package AppSettingsHandler;

import AppSettingsHandler.FileReader.JsonReader;
import com.google.inject.Inject;
import org.json.simple.JSONObject;

public class AppSettings implements IAppSettings {
  private JSONObject appSetting;
  private JsonReader jsonReader;
  private String fullPath;

  @Inject
  public AppSettings(JsonReader jsonReader){
    this.jsonReader = jsonReader;
    this.fullPath = jsonReader.findFile(getFileName());
  }

  @Override
  public String getFileName() {
    return "AppSettings.json";
  }

  @Override
  public Object getValue(String key) {
    if(appSetting == null){
      appSetting = jsonReader.openFile(fullPath);
    }

    return appSetting.get(key);
  }
}
