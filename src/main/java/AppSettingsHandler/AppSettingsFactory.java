package AppSettingsHandler;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class AppSettingsFactory {
  private static Injector injector;

  private AppSettingsFactory(){

  }

  static {
    injector = Guice.createInjector(new AppSettingsBindings());
  }

  public static Injector getInjector(){
    return injector;
  }
}
