package DatabaseConnection;

public abstract class DataBaseConnectionAbstract implements IDatabaseConnection {
  protected abstract void establishConnection();
  public abstract void closeConnection();
}
