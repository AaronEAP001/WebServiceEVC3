package pe.idat.aaron.aquino.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pe.idat.aaron.aquino.DB.ConexionDB;
import pe.idat.aaron.aquino.VO.AlumnoVO;

public class AlumnoDAO {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;    

    public AlumnoDAO() {
    }
    
    
    public void insert(AlumnoVO alumno){
        try{
            conn=ConexionDB.MSQL();
            
            ps=conn.prepareStatement("insert into alumno(nombre,apellido,direccion,edaad) value(?,?,?,?)");
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getDireccion());
            ps.setInt(4, alumno.getEdaad());
            
            int rows=ps.executeUpdate();
            
            if(rows!=1){
                System.out.println("Error Insert!");
            }                    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void update(AlumnoVO alumno){
        try{
            conn=ConexionDB.MSQL();
            
            ps=conn.prepareStatement("update alumno set nombre=?,apellido=?,direccion=?,edaad=? where idAlumno=?");
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getDireccion());
            ps.setInt(4, alumno.getEdaad());
            ps.setInt(5, alumno.getIdAlumno());
            
            int rows=ps.executeUpdate();
            
            if(rows!=1){
                System.out.println("Error Insert!");
            }                    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public Collection<AlumnoVO> findAll(){
        
        List<AlumnoVO> list=new ArrayList<>();
        
        try {
            
            conn=ConexionDB.MSQL();
            
            ps=conn.prepareStatement("select * from alumno");
            rs=ps.executeQuery();
            
            while (rs.next()) {
                AlumnoVO alumno = new AlumnoVO();
                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setDireccion(rs.getString("direccion"));
                alumno.setEdaad(rs.getInt("edaad"));
                list.add(alumno);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public AlumnoVO findById(int idAlumno){
        AlumnoVO alumno=null;
        
        try {
            conn=ConexionDB.MSQL();
            ps=conn.prepareStatement("select * from alumno where idAlumno=?");
            ps.setInt(1, idAlumno);
            rs=ps.executeQuery();
            
            if(rs.next()){
                alumno=new AlumnoVO();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setDireccion(rs.getString("direccion"));
                alumno.setEdaad(rs.getInt("edaad"));
            }
            
        } catch (Exception e) {
        }
        
        return alumno;
    }
    
    public void delete(int idAlumno){
        try{
            conn=ConexionDB.MSQL();
            ps=conn.prepareStatement("delete from curso where idAlumno=?");
            ps.setInt(1, idAlumno);
            
            int rows=ps.executeUpdate();
            if(rows!=1){
                System.out.println("Error DELETE!");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
