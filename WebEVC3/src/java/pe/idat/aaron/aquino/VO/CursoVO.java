package pe.idat.aaron.aquino.VO;

import java.util.ArrayList;
import java.util.Collection;

/* @author aquin */
public class CursoVO {
    private Integer idCurso;
    private String nombre;
    private String aula;
    private Double horas;
    
    private Collection<AlumnoCursoVO> itemsAlumnoCurso=new ArrayList();

    public CursoVO() {
    }

    public CursoVO(String nombre, String aula, Double horas) {
        this.nombre = nombre;
        this.aula = aula;
        this.horas = horas;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
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
        sb.append("CursoVO{idCurso=").append(idCurso);
        sb.append(", nombre=").append(nombre);
        sb.append(", aula=").append(aula);
        sb.append(", horas=").append(horas);
        //sb.append(", alumnoCurso=").append(alumnoCurso.getIdAlumnoCurso());
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }
    
    
    
}
