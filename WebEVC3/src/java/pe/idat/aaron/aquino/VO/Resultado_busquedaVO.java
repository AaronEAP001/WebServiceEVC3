package pe.idat.aaron.aquino.VO;

/**
 *
 * @author aquin
 */
public class Resultado_busquedaVO {
    
    private Integer idresultado_busqueda; 
    private String resultado;

    public Resultado_busquedaVO() {
    }

    public Resultado_busquedaVO(String resultado) {
        this.resultado = resultado;
    }

    public Integer getIdresultado_busqueda() {
        return idresultado_busqueda;
    }

    public void setIdresultado_busqueda(Integer idresultado_busqueda) {
        this.idresultado_busqueda = idresultado_busqueda;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resultado_busqueda{idresultado_busqueda=").append(idresultado_busqueda);
        sb.append(", resultado=").append(resultado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
