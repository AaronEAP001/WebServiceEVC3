package pe.idat.aaron.aquino.VO;


public class AlumnoCursoVO {
    
    private Integer idAlumnoCurso;
    private AlumnoVO alumnoVO;
    private CursoVO cursoVO;

    public AlumnoCursoVO() {
    }

    public Integer getIdAlumnoCurso() {
        return idAlumnoCurso;
    }

    public void setIdAlumnoCurso(Integer idAlumnoCurso) {
        this.idAlumnoCurso = idAlumnoCurso;
    }

    public AlumnoVO getAlumnoVO() {
        return alumnoVO;
    }

    public void setAlumnoVO(AlumnoVO alumnoVO) {
        this.alumnoVO = alumnoVO;
    }

    public CursoVO getCursoVO() {
        return cursoVO;
    }

    public void setCursoVO(CursoVO cursoVO) {
        this.cursoVO = cursoVO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlumnoCursoVO{idAlumnoCurso=").append(idAlumnoCurso);
        sb.append(", alumnoVO=").append(alumnoVO);
        sb.append(", cursoVO=").append(cursoVO);
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }
    
    
    
}
