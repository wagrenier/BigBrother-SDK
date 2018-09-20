package AppSettingsHandler.FileReader;

import java.util.Map;

public interface IFileReader {
  public String findFile(String fileName);
  public String getCurrentWorkingPath();
  public Map openFile(String Path);
}
