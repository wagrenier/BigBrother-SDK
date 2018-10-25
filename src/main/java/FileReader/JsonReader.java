package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.nio.file.Path;
import java.util.stream.Stream;

public class JsonReader implements IFileReader {
  FileReader fileReader = null;

  JSONParser jsonParser;

  public JsonReader(){
    this.jsonParser = new JSONParser();
  }

  @Override
  public String findFile(String fileName) {
    try {
      Stream<Path> stream =
          Files.find(Paths.get(this.getCurrentWorkingPath()), 100,
              (path, basicFileAttributes) -> {
                File file = path.toFile();
                return !file.isDirectory() && file.getName().contains(fileName
                    + this.getTypeExtension());
              });
      return stream.findFirst().get().toString();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

  @Override
  public String getCurrentWorkingPath() {
    return System.getProperty("user.dir");
  }

  @Override
  public String getTypeExtension() {
    return ".json";
  }

  @Override
  public Object getValue(Map objectStream, Object key) {
    if(key == null){
      return null;
    }

    return objectStream.get(key);
  }

  @Override
  public JSONObject openFile(String Path) {
    try {
      fileReader = new FileReader(Path);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return null;
    }

    try {
      return (JSONObject) jsonParser.parse(fileReader);
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }
  }
}
