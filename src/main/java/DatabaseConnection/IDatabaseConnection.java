package DatabaseConnection;

import java.sql.SQLException;

public interface IDatabaseConnection {
  void establishConnection() throws SQLException;
  String testConnection();
  Object getServerObject();
  boolean addDataObject(Object objectToAdd, String tableName);
  boolean removeServerObject(Object objectToRemove, String tableName);
}
