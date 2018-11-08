package DatabaseConnection;

import org.javalite.activejdbc.Model;

/** The interface Database connection. */
public interface IDatabaseConnection {
  /**
   * Gets server object.
   *
   * @param model the model
   * @param queryStatement the query statement
   * @param searchParameters the search parameters
   * @return the server object
   */
  String getServerObject(
      Class<? extends Model> model, String queryStatement, Object... searchParameters);

  /**
   * Gets server object.
   *
   * @param model the model
   * @return the server object
   */
  String getServerObject(Class<? extends Model> model);

  /**
   * Add data object object.
   *
   * @param model the model
   * @param args the args
   * @return the object
   */
  Object addDataObject(Class<? extends Model> model, Object... args);

  /**
   * Remove server object.
   *
   * @param model the model
   * @param queryStatement the query statement
   * @param searchParameters the search parameters
   */
  void removeServerObject(
      Class<? extends Model> model, String queryStatement, Object... searchParameters);
}
