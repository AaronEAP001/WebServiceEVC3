package pe.idat.aaron.aquino.VO;

import java.util.ArrayList;
import java.util.Collection;

public class AlumnoVO {
    private Integer idAlumno;
    private String nombre; 
    private String apellido;
    private String direccion;
    private Integer edaad;
    
    private Collection<AlumnoCursoVO> itemsAlumnoCurso=new ArrayList();

    public AlumnoVO() {
    }

    public AlumnoVO(String nombre, String apellido, String direccion, Integer edaad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edaad = edaad;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdaad() {
        return edaad;
    }

    public void setEdaad(Integer edaad) {
        this.edaad = edaad;
    }

    public Collection<AlumnoCursoVO> getItemsAlumnoCurso() {
        return itemsAlumnoCurso;
    }

    public void setItemsAlumnoCurso(Collection<AlumnoCursoVO> itemsAlumnoCurso) {
        this.itemsAlumnoCurso = itemsAlumnoCurso;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlumnoVO{idAlumno=").append(idAlumno);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", direccion=").append(direccion);
        sb.append(", edaad=").append(edaad);
        //sb.append(", alumnoCurso=").append(alumnoCurso.getIdAlumnoCurso());
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }

    
}
