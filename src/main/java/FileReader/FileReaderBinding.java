package FileReader;

import com.google.inject.AbstractModule;

public class FileReaderBinding extends AbstractModule {
  @Override
  protected void configure(){
    bind(IFileReader.class).to(JsonReader.class);
  }
}
