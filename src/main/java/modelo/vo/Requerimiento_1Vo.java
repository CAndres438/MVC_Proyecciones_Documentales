package modelo.vo;

public class Requerimiento_1Vo {
    private String  usuAlias_fk;
    private String  Titulo_fk;
    private String  transFecha;
    
    private String usuarioVisualizador;


    public String getUsuAlias_fk() {
        return usuAlias_fk;
    }

    /**
     * @param usuAlias_fk the usuAlias_fk to set
     */
    public void setUsuAlias_fk(String usuAlias_fk) {
        this.usuAlias_fk = usuAlias_fk;
    }

    /**
     * @return the Titulo_fk
     */
    public String getTitulo_fk() {
        return Titulo_fk;
    }

    /**
     * @param Titulo_fk the Titulo_fk to set
     */
    public void setTitulo_fk(String Titulo_fk) {
        this.Titulo_fk = Titulo_fk;
    }

    /**
     * @return the transFecha
     */
    public String getTransFecha() {
        return transFecha;
    }

    /**
     * @param transFecha the transFecha to set
     */
    public void setTransFecha(String transFecha) {
        this.transFecha = transFecha;
    }

    /**
     * @return the usuarioVisualizador
     */
    public String getUsuarioVisualizador() {
        return usuarioVisualizador;
    }

    /**
     * @param usuarioVisualizador the usuarioVisualizador to set
     */
    public void setUsuarioVisualizador(String usuarioVisualizador) {
        this.usuarioVisualizador = usuarioVisualizador;
    }
    
 

}
