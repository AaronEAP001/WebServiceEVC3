package pe.idat.aaron.aquino;

import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import pe.idat.aaron.aquino.DAO.AlumnoCursoDAO;
import pe.idat.aaron.aquino.VO.AlumnoCursoVO;

/**
 * REST Web Service
 *
 * @author aquin
 */
@Path("alumnoCurso")
public class AlumnoCursoRest {
    
    AlumnoCursoDAO alumnoCursoDAO = new AlumnoCursoDAO();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AlumnoCursoRest
     */
    public AlumnoCursoRest() {
    }

    /**
     * Retrieves representation of an instance of pe.idat.aaron.aquino.AlumnoCursoRest
     * @param nombre
     * @param limite
     * @return an instance of java.lang.String
     */
    @Path("/cursoAlumnoLimit/{nombre}/{limite}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<AlumnoCursoVO> findByNombreLimt(@PathParam("nombre") String nombre,@PathParam("limite") int limite){
        return alumnoCursoDAO.findByNombreLimt(nombre, limite);
    }
}
