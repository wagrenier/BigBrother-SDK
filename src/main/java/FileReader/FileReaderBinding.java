package FileReader;

import com.google.inject.AbstractModule;

/** The type File reader binding. */
public class FileReaderBinding extends AbstractModule {
  @Override
  protected void configure() {
    bind(IFileReader.class).to(JsonReader.class);
  }
}
