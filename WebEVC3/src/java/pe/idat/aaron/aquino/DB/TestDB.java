package pe.idat.aaron.aquino.DB;

import java.sql.SQLException;
import pe.idat.aaron.aquino.DAO.AlumnoCursoDAO;
import pe.idat.aaron.aquino.DAO.AlumnoDAO;
import pe.idat.aaron.aquino.DAO.CursoDAO;
import pe.idat.aaron.aquino.VO.AlumnoVO;
import pe.idat.aaron.aquino.VO.CursoVO;

public class TestDB {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        
        AlumnoCursoDAO alumnoCurso = new AlumnoCursoDAO();
        ConexionDB.MSQL();
        System.out.println("!Conexión DB...OK!");
        System.out.println(alumnoCurso.findByNombreAll("algebra"));
        System.out.println("\n\n");
        System.out.println(alumnoCurso.findByNombreLimt("quimica", 3));
        //ZapatillaDAO zapatillaDAO = new ZapatillaDAO();
        /*
        CursoDAO CursoDAO = new CursoDAO();
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        
        ConexionDB.MSQL();
        
        System.out.println("!Conexión DB...OK!");
        
        for(CursoVO vo: CursoDAO.findAll()){
            System.out.println("\n"+vo.toString());
        }
        
        System.out.println("Xd-------");
        System.out.println(CursoDAO.findById(4));
        
        System.out.println("Alumno");
        
        for(AlumnoVO vo: alumnoDAO.findAll()){
            System.out.println("\n"+vo.toString());
        }
        
        System.out.println("-------");
        System.out.println(alumnoDAO.findById(3));
        */
        /*
        CursoDAO CursoDAO = new CursoDAO();
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        
        ConexionDB.MSQL();
        
        System.out.println("!Conexión DB...OK!");
        
        for(CursoVO vo: CursoDAO.findAll()){
            System.out.println("\n"+vo.toString());
        }
        System.out.println("----------");
        System.out.println(CursoDAO.findByNombre("algebra"));*/
    }
}
