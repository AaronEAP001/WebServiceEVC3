package pe.idat.aaron.aquino.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    
    public static Connection MSQL() throws SQLException,ClassNotFoundException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
        String url="jdbc:mysql://localhost:3306/db_cursos?useSSL=false&allowPublicKeyRetrieval=true";
        
        return DriverManager.getConnection(url, "root", "Vamosa12");
    }
    
}
