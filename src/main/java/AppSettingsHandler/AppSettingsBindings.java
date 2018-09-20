package AppSettingsHandler;

import com.google.inject.AbstractModule;

public class AppSettingsBindings extends AbstractModule {

  @Override
  protected void configure(){
    bind(IAppSettings.class).to(AppSettings.class);
  }
}
