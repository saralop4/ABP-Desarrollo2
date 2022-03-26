package Modelo;

import java.util.Date;

/**
 *
 * @author Sarah
 */
public class FormacionAcademica {
    
    private String nivelAcademico;
    private String institucion;
    private Date fechadeFinalizacion;

    public FormacionAcademica(){
    
    }
    
    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Date getFechadeFinalizacion() {
        return fechadeFinalizacion;
    }

    public void setFechadeFinalizacion(Date fechadeFinalizacion) {
        this.fechadeFinalizacion = fechadeFinalizacion;
    }

  
   
    
}
