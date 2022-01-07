package pe.idat.aaron.aquino.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import pe.idat.aaron.aquino.DB.ConexionDB;
import pe.idat.aaron.aquino.VO.AlumnoCursoVO;
import pe.idat.aaron.aquino.VO.AlumnoVO;
import pe.idat.aaron.aquino.VO.CursoVO;
import pe.idat.aaron.aquino.VO.Resultado_busquedaVO;

public class AlumnoCursoDAO {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private AlumnoDAO alumnoDAO = new AlumnoDAO();
    private CursoDAO cursoDAO = new CursoDAO();
    private Resultado_busquedaDAO resultadoDao = new Resultado_busquedaDAO();

    public AlumnoCursoDAO() {}
    
    public Collection<AlumnoCursoVO> findByNombreAll(String nombre){
        
        List<AlumnoCursoVO> list = new ArrayList<>();
        AlumnoCursoVO alumnoCurso = null;
        
        try{
            conn=ConexionDB.MSQL();
            ps=conn.prepareStatement("select * from alumno_curso where idCurso=?");
            ps.setInt(1, cursoDAO.findByNombre(nombre).getIdCurso());
            rs=ps.executeQuery();
            
            while (rs.next()) {
                alumnoCurso=new AlumnoCursoVO();
                alumnoCurso.setIdAlumnoCurso(rs.getInt("idAlumnoCurso"));
                
                AlumnoVO alumno = alumnoDAO.findById(rs.getInt("idAlumno"));
                alumnoCurso.setAlumnoVO(alumno);
                CursoVO curso = cursoDAO.findById(rs.getInt("idCurso"));
                alumnoCurso.setCursoVO(curso);
                
                list.add(alumnoCurso);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return list;
    }
    
    
    public Collection<AlumnoCursoVO> findByNombreLimt(String nombre,int rango){
        
        List<AlumnoCursoVO> list = new ArrayList<>();
        AlumnoCursoVO alumnoCurso = null;
        
        try{
            conn=ConexionDB.MSQL();
            ps=conn.prepareStatement("SELECT * FROM alumno_curso where idCurso=? LIMIT ?");
            ps.setInt(1, cursoDAO.findByNombre(nombre).getIdCurso());
            ps.setInt(2, rango);
            rs=ps.executeQuery(); 
            while (rs.next()) {
                alumnoCurso=new AlumnoCursoVO();
                alumnoCurso.setIdAlumnoCurso(rs.getInt("idAlumnoCurso"));
                
                AlumnoVO alumno = alumnoDAO.findById(rs.getInt("idAlumno"));
                alumnoCurso.setAlumnoVO(alumno);
                CursoVO curso = cursoDAO.findById(rs.getInt("idCurso"));
                alumnoCurso.setCursoVO(curso);
                
                list.add(alumnoCurso);
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        String str = Arrays.deepToString(list.toArray());
        Resultado_busquedaVO resultadoVO = new Resultado_busquedaVO(str);
        resultadoDao.insert(resultadoVO);
        
        return list;
    }
    
    
    
    
}
