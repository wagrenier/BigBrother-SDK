package DatabaseConnection;

import AppSettingsHandler.AppSettings;
import com.google.inject.Inject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class POSTGRESQLDatabaseConnection extends DataBaseConnectionAbstract {

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
    this.establishConnection();
  }

  @Override
  public void establishConnection() {
    if(connectionDataBase != null){
      return ;
    }

    try {
      this.connectionDataBase = DriverManager.getConnection(this.url, this.username, this.password);
    }catch (SQLException ex){
      System.out.println(ex.toString());
    }
  }

  @Override
  public Object getServerObject(String fieldToSelect, String tableName) {
    StringBuilder queryReturn = new StringBuilder();
    try {
      Statement st = connectionDataBase.createStatement();
      ResultSet rs = st.executeQuery("SELECT " + fieldToSelect + " from " + tableName);

      if(rs != null){
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();

        while(rs.next()){
          queryReturn.append("{");
          for(int i = 1; i <= columnsNumber; i++){
            queryReturn.append("\"");
            queryReturn.append(rsmd.getColumnName(i));
            queryReturn.append("\"");
            queryReturn.append(": ");
            queryReturn.append("\"");
            queryReturn.append(rs.getString(i));
            queryReturn.append("\"");

            if(i < columnsNumber){
              queryReturn.append(", ");
            }
            else{
              queryReturn.append("},");
              queryReturn.append("\n");
            }
          }
        }
      }
    } catch (SQLException ex) {
      System.out.println(ex.toString());
    }

    return queryReturn.toString();
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
