package AppSettingsHandler;

import com.google.inject.ImplementedBy;

@ImplementedBy(AppSettings.class)
public interface IAppSettings {
  public String getFileName();

  public Object getValue(String key);
}
