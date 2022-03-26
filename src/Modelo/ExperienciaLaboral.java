
package Modelo;

/**
 *
 * @author Sarah
 */
public class ExperienciaLaboral {
    
    private String cargo;
    private String empresa;
    private String jefe;
    private String tiempolaborado;

    
   public ExperienciaLaboral(){
   
   }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getTiempolaborado() {
        return tiempolaborado;
    }

    public void setTiempolaborado(String tiempolaborado) {
        this.tiempolaborado = tiempolaborado;
    }

}