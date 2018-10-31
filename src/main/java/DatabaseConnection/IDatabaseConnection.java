package DatabaseConnection;

import java.sql.SQLException;

public interface IDatabaseConnection {
  Object getServerObject(String fieldToSelect, String tableName);
  boolean addDataObject(Object objectToAdd, String tableName);
  boolean removeServerObject(Object objectToRemove, String tableName);
}
