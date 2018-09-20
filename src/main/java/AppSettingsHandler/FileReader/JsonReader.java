package AppSettingsHandler.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader implements IFileReader {
  FileReader fileReader = null;

  JSONParser jsonParser = new JSONParser();

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
