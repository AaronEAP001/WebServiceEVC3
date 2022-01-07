
package pe.idat.aaron.aquino.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.idat.aaron.aquino.DB.ConexionDB;
import pe.idat.aaron.aquino.VO.AlumnoVO;
import pe.idat.aaron.aquino.VO.Resultado_busquedaVO;

/**
 * @author aquin
 */
public class Resultado_busquedaDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Resultado_busquedaDAO() {
    }
    
    public void insert(Resultado_busquedaVO resultado){
        try{
            conn=ConexionDB.MSQL();
            
            ps=conn.prepareStatement("insert into resultado_busqueda(resultado) value(?)");
            ps.setString(1, resultado.getResultado());
            
            int rows=ps.executeUpdate();
            
            if(rows!=1){
                System.out.println("Error Insert!");
            }                    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    
}
