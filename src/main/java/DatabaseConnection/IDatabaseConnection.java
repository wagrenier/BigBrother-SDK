package DatabaseConnection;

import java.util.List;
import org.javalite.activejdbc.Model;

public interface IDatabaseConnection {
  List<Model> getServerObject(Class<? extends Model> model, String queryStatement, Object... searchParameters);
  List<Model> getServerObject(Class<? extends Model> model);
  Object addDataObject(Class<? extends Model> model, Object... args);
  void removeServerObject(Class<? extends Model> model, String queryStatement, Object... searchParameters);
}
