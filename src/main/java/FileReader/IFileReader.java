package FileReader;

import com.google.inject.ImplementedBy;
import java.util.Map;

/** The interface File reader. */
@ImplementedBy(JsonReader.class)
public interface IFileReader {
  /**
   * Find file string.
   *
   * @param fileName the file name
   * @return the string
   */
  String findFile(String fileName);

  /**
   * Gets current working path.
   *
   * @return the current working path
   */
  String getCurrentWorkingPath();

  /**
   * Gets type extension.
   *
   * @return the type extension
   */
  String getTypeExtension();

  /**
   * Gets value.
   *
   * @param objectStream the object stream
   * @param key the key
   * @return the value
   */
  Object getValue(Map objectStream, Object key);

  /**
   * Open file map.
   *
   * @param Path the path
   * @return the map
   */
  Map openFile(String Path);
}
