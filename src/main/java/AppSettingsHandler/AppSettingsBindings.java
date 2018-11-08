package AppSettingsHandler;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/** The type App settings bindings. */
public class AppSettingsBindings extends AbstractModule {

  @Override
  protected void configure() {
    bind(IAppSettings.class).to(AppSettings.class).in(Singleton.class);
  }
}
