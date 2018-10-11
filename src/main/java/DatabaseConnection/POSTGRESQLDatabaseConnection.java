package DatabaseConnection;

import AppSettingsHandler.AppSettings;
import com.google.inject.Inject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class POSTGRESQLDatabaseConnection implements IDatabaseConnection {

  protected AppSettings appSettings;

  private String url;
  private String username;
  private String password;
  protected Connection connectionDataBase;

  @Inject
  public POSTGRESQLDatabaseConnection(AppSettings appSettings){
    this.appSettings = appSettings;
    this.url = (String) this.appSettings.getValue("url");
    this.username = (String) this.appSettings.getValue("username");
    this.password = (String) this.appSettings.getValue("password");
  }

  @Override
  public void establishConnection() {
    try {
      this.connectionDataBase = DriverManager.getConnection(this.url, this.username, this.password);
    }catch (SQLException ex){
      System.out.println(ex.toString());
    }
  }

  @Override
  public void testConnection() {
    try {
      Statement st = connectionDataBase.createStatement();
      ResultSet rs = st.executeQuery("SELECT * from utilisateur");

      while(rs.next()){
        System.out.println(rs.getString(1) + " / " + rs.getString(3) + " " + rs.getString(2));
      }

    } catch (SQLException ex) {
      System.out.println(ex.toString());
    }
  }

  @Override
  public Object getServerObject() {
    return null;
  }

  @Override
  public boolean addDataObject(Object objectToAdd, String tableName) {
    return false;
  }

  @Override
  public boolean removeServerObject(Object objectToRemove, String tableName) {
    return false;
  }

}
