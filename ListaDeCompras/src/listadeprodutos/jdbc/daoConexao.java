
package listadeprodutos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class daoConexao {
    public static Connection getConexao(){
       String url = "jdbc:mysql://localhost:3306/db_listacompras";
       String user= "root";
       String password = "1234";
       
       try{                   
       return DriverManager.getConnection(url,user,password);   
       
       }catch (SQLException e ){
           e.printStackTrace();
       }    
         return null;
    }
}
