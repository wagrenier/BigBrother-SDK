package AppSettingsHandler;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestingForAppSettingsInjection {

  public static void main(String[] args){
    Injector injector = Guice.createInjector(new AppSettingsBindings());

    ClassThatDependsOnAppSettings abc = injector.getInstance(ClassThatDependsOnAppSettings.class);
    System.out.println(abc.getAValue("fileName"));
    System.out.println(abc.getAValue("intTest"));
  }

}
