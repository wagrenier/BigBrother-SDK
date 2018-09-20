package AppSettingsHandler;

public interface IAppSettings {
  public String getFileName();

  public Object getValue(String key);
}
