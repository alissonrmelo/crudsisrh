package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionControler {
 
    public static Connection conector() {
    	
        java.sql.Connection conexao = null; 
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sisrh";
        String user = "root";
        String password = "";
             
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return conexao;
 
    } 
}
