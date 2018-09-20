package AppSettingsHandler;

import org.json.simple.JSONObject;

public class AppSettings implements IAppSettings {
  JSONObject appSetting;

  // Add that fileReader is injected here
  public AppSettings(){

  }

  @Override
  public String getFileName() {
    return "AppSettings.json";
  }

  @Override
  public Object getValue(String key) {
    System.out.println(key);
    return null;
  }
}
