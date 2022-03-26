package Controlador;

import Modelo.*;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Sarah
 */
public class CandidatoController {

    static public Candidato crear(
            String nombre,
            String apellido,
            String email,
            String clave,
            Date fechaNacimiento,
            String tipoId,
            String numID,
            String estadoCivil,
            String telefono,
            String genero,
            String pais,
            String ciudad,
            String profesion,
            String puestoDeseado,
            String salaDeseado,
            String disponibilidad,
            Idioma idioma,
            FormacionAcademica fAcademica,
            ExperienciaLaboral experienciaLaboral
    ) {
        Candidato candi = new Candidato();
        candi.setNombres(nombre);
        candi.setApellidos(apellido);
        candi.setCorreo(email);
        candi.setContraseña(clave);
        candi.setFechaNacimiento(fechaNacimiento);
        candi.setTipoId(tipoId);
        candi.setIdentificacion(numID);
        candi.setEstadoCivil(estadoCivil);
        candi.setTelefono(telefono);
        candi.setGenero(genero);
        candi.setPais(pais);
        candi.setCiudad(ciudad);
        candi.setProfesion(profesion);
        candi.setCargoDeseado(puestoDeseado);
        candi.setSalarioDeseado(salaDeseado);
        candi.setDisponibilidadViajar(disponibilidad);
        candi.setIdioma(idioma);
        
        System.out.println(candi);
        return null;
    }

    static public Boolean BorrarUsuario(int cedula) {
        return null;
    }

    static public Candidato updateCandidato(Candidato candidato, int cedula) {

        return null;
    }

    static public Candidato BuscarPorCedula(int cedula) {

        return null;
    }

    static public List<Candidato> index() {

        return null;
    }

    static public Candidato AgregarIdiomas(List<Idioma> idiomas, int cedula) {

        Candidato candidato = new Candidato();

        for (Idioma idioma : idiomas) {
            candidato.setIdioma(idioma);
        }
        return candidato;
    }
}
