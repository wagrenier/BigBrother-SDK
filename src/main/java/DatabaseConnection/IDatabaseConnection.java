package DatabaseConnection;

import java.util.List;
import org.javalite.activejdbc.Model;

public interface IDatabaseConnection {
  List<Model> getServerObject(Class<? extends Model> model, String queryStatement, Object... searchParameters);
  List<Model> getServerObject(Class<? extends Model> model);
  boolean addDataObject(Object objectToAdd, String tableName);
  boolean removeServerObject(Object objectToRemove, String tableName);
}
