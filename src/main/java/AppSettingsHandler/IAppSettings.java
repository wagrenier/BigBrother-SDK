package AppSettingsHandler;

import com.google.inject.ImplementedBy;

/** The interface App settings. */
@ImplementedBy(AppSettings.class)
public interface IAppSettings {
  /**
   * Gets file name.
   *
   * @return the file name
   */
  public String getFileName();

  /**
   * Gets value.
   *
   * @param key the key
   * @return the value
   */
  public Object getValue(String key);
}
