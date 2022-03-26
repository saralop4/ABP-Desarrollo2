package Modelo;

import java.util.*;


/**
 *
 * @author Sarah
 */
public class Candidato {

    private String nombres;
    private String apellidos;
    private String correo;
    private String contraseña;
    private Date fechaNacimiento;

    private String tipoId;
    private String identificacion;
    private String estadoCivil;
    private String telefono;
    private String genero;
    private String pais;
    private String ciudad;

    private String profesion;
    private String cargoDeseado;
    private String salarioDeseado;
    private String disponibilidadViajar;

    private List<Idioma> listIdiomas;
    private List<FormacionAcademica> listFormacion;
    private List<ExperienciaLaboral> listExperiencia;

    public Candidato() {

        listIdiomas = new ArrayList<>();

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCargoDeseado() {
        return cargoDeseado;
    }

    public void setCargoDeseado(String cargoDeseado) {
        this.cargoDeseado = cargoDeseado;
    }

    public String getSalarioDeseado() {
        return salarioDeseado;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
    }

    public String getDisponibilidadViajar() {
        return disponibilidadViajar;
    }

    public void setDisponibilidadViajar(String disponibilidadViajar) {
        this.disponibilidadViajar = disponibilidadViajar;
    }

    public List<Idioma> getListIdiomas() {
        return listIdiomas;
    }

    public void setIdioma(Idioma idiomas) {
        this.listIdiomas.add(idiomas);
    }

    public List<FormacionAcademica> getListFormacion() {
        return listFormacion;
    }

    public void setListFormacion(List<FormacionAcademica> listFormacion) {
        this.listFormacion = listFormacion;
    }

    public List<ExperienciaLaboral> getListExperiencia() {
        return listExperiencia;
    }

    public void setListExperiencia(List<ExperienciaLaboral> listExperiencia) {
        this.listExperiencia = listExperiencia;
    }

   

}
