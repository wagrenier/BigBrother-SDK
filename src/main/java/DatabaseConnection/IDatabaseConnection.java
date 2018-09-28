package DatabaseConnection;

public interface IDatabaseConnection {
  boolean establishConnection();
  boolean testConnection();
  Object getServerObject();
  boolean addDataObject(Object objectToAdd);
  boolean removeServerObject(Object objectToRemove);
}
