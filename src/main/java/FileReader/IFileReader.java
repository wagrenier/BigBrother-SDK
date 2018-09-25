package FileReader;

import com.google.inject.ImplementedBy;
import java.util.Map;

@ImplementedBy(JsonReader.class)
public interface IFileReader {
  String findFile(String fileName);
  String getCurrentWorkingPath();
  String getTypeExtension();
  Object getValue(Map objectStream, Object key);
  Map openFile(String Path);
}
