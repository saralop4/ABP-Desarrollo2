package Modelo;

/**
 *
 * @author Sarah
 */
public class Empresa {
    
    private int codigo;
    private String empresa;
    private int nit;
    private int idFiscal;
    private int telefono;
    private String correo;
    private String contraseña;

    public Empresa(int codigo, String empresa, int nit, int idFiscal, int telefono, String correo, String contraseña) {
        this.codigo = codigo;
        this.empresa = empresa;
        this.nit = nit;
        this.idFiscal = idFiscal;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(int idFiscal) {
        this.idFiscal = idFiscal;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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


    
}
