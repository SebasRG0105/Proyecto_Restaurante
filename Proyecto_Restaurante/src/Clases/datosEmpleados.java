package Clases;

public class datosEmpleados {

    private String nombre;
    private String apellido;
    private String cedula;
    private String salario;
    private String cargo;

    public datosEmpleados() {
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.salario = "";
        this.cargo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

}
