package AppSettingsHandler;

import com.google.inject.Guice;
import com.google.inject.Injector;

/** The type App settings factory. */
public class AppSettingsFactory {
  private static Injector injector;

  static {
    injector = Guice.createInjector(new AppSettingsBindings());
  }

  private AppSettingsFactory() {}

  /**
   * Get injector injector.
   *
   * @return the injector
   */
  public static Injector getInjector() {
    return injector;
  }
}
