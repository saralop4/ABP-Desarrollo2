
package Modelo;

/**
 *
 * @author Sarah
 */
public class Oferta {
    
    private String titulo;
    private int vacantes;
    private String categoria;
    private String descripcion;
    private String departamento;
    private String fechainicio;
    private String fechafin;
    private String municipio;
    private String tipoContrato;
    private double salario;
    private String jornadaLaboral;

    public Oferta(String titulo, int vacantes, String categoria, String descripcion, String departamento, String fechainicio, String fechafin, String municipio, String tipoContrato, double salario, String jornadaLaboral) {
        this.titulo = titulo;
        this.vacantes = vacantes;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.departamento = departamento;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.municipio = municipio;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.jornadaLaboral = jornadaLaboral;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getJornadaLaboral() {
        return jornadaLaboral;
    }

    public void setJornadaLaboral(String jornadaLaboral) {
        this.jornadaLaboral = jornadaLaboral;
    }
    
    
    
}
