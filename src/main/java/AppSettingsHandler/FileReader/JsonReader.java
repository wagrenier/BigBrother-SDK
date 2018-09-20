package AppSettingsHandler.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.nio.file.Path;
import java.util.stream.Stream;

public class JsonReader implements IFileReader {
  FileReader fileReader = null;

  JSONParser jsonParser = new JSONParser();

  @Override
  public String findFile(String fileName) {
    try {
      Stream<Path> stream =
          Files.find(Paths.get(this.getCurrentWorkingPath()), 100,
              (path, basicFileAttributes) -> {
                File file = path.toFile();
                return !file.isDirectory() && file.getName().contains(fileName);
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
  public JSONObject openFile(String Path) {
    try {
      fileReader = new FileReader(Path);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    JSONObject jsonFile = null;

    try {
      jsonFile = (JSONObject) jsonParser.parse(fileReader);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }

    return jsonFile;
  }
}
