package DatabaseConnection;

/** The type Data base connection abstract. */
public abstract class DataBaseConnectionAbstract implements IDatabaseConnection {
  /** Establish connection. */
  protected abstract void establishConnection();

  /** Close connection. */
  public abstract void closeConnection();
}
