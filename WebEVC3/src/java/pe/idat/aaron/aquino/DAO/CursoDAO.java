package pe.idat.aaron.aquino.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pe.idat.aaron.aquino.DB.ConexionDB;
import pe.idat.aaron.aquino.VO.CursoVO;

public class CursoDAO {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;    

    public CursoDAO() {
    }
    
    public void insert(CursoVO curso){
        try{
            conn=ConexionDB.MSQL();
            
            ps=conn.prepareStatement("insert into curso(nombre,aula,horas) value(?,?,?)");
            ps.setString(1, curso.getNombre());
            ps.setString(2, curso.getAula());
            ps.setDouble(3, curso.getHoras());
            
            int rows=ps.executeUpdate();
            
            if(rows!=1){
                System.out.println("Error Insert!");
            }                    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void update(CursoVO curso){
        try{
            conn=ConexionDB.MSQL();
            
            ps=conn.prepareStatement("update curso set nombre=?,aula=?,horas=? where idCurso=?");
            ps.setString(1, curso.getNombre());
            ps.setString(2, curso.getAula());
            ps.setDouble(3, curso.getHoras());
            ps.setInt(4, curso.getIdCurso());
            
            int rows=ps.executeUpdate();
            
            if(rows!=1){
                System.out.println("Error Insert!");
            }                    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public Collection<CursoVO> findAll(){
        
        List<CursoVO> list=new ArrayList<>();
        
        try {
            
            conn=ConexionDB.MSQL();
            
            ps=conn.prepareStatement("select * from curso");
            rs=ps.executeQuery();
            
            while (rs.next()) {
                CursoVO curso = new CursoVO();
                
                curso.setIdCurso(rs.getInt("idCurso"));
                curso.setNombre(rs.getString("nombre"));
                curso.setAula(rs.getString("aula"));
                curso.setHoras(rs.getDouble("horas"));
                
                list.add(curso);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public CursoVO findById(int idCurso){
        CursoVO curso=null;
        
        try {
            conn=ConexionDB.MSQL();
            ps=conn.prepareStatement("select * from curso where idCurso=?");
            ps.setInt(1, idCurso);
            rs=ps.executeQuery();
            
            if(rs.next()){
                curso=new CursoVO();
                curso.setIdCurso(rs.getInt("idCurso"));
                curso.setNombre(rs.getString("nombre"));
                curso.setAula(rs.getString("aula"));
                curso.setHoras(rs.getDouble("horas"));
            }
            
        } catch (Exception e) {
        }
        
        return curso;
    }
    
    public void delete(int idCurso){
        try{
            conn=ConexionDB.MSQL();
            ps=conn.prepareStatement("delete from curso where idCurso=?");
            ps.setInt(1, idCurso);
            
            int rows=ps.executeUpdate();
            if(rows!=1){
                System.out.println("Error DELETE!");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    public CursoVO findByNombre(String nombre){
        CursoVO curso=null;
        
        try {
            conn=ConexionDB.MSQL();
            ps=conn.prepareStatement("select * from curso where nombre=?");
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            
            if(rs.next()){
                curso=new CursoVO();
                curso.setIdCurso(rs.getInt("idCurso"));
                curso.setNombre(rs.getString("nombre"));
                curso.setAula(rs.getString("aula"));
                curso.setHoras(rs.getDouble("horas"));
            }
            
        } catch (Exception e) {
        }
        
        return curso;
    }
    
}

