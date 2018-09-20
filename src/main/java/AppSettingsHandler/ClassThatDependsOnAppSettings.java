package AppSettingsHandler;

import com.google.inject.Inject;

public class ClassThatDependsOnAppSettings {
  private AppSettings appSettings;

  @Inject
  public ClassThatDependsOnAppSettings(AppSettings appSettings){
    this.appSettings = appSettings;
  }

  public Object getAValue(String key){
    return appSettings.getValue(key);
  }

}
