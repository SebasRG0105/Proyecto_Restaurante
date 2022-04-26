package Clases;

import javax.swing.JOptionPane;

public class datosReservaciones {

    private String nombre;
    private String apellido;
    private String cedula;
    private String fecha;
    private String hora;

    public datosReservaciones() {
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.fecha = "";
        this.hora = "";
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void pedirDatos() {
        setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:", "Nombre",
                JOptionPane.QUESTION_MESSAGE));
        setApellido(JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente:", "Apellido",
                JOptionPane.QUESTION_MESSAGE));
        setCedula(JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:", "Cedula",
                JOptionPane.QUESTION_MESSAGE));
        setFecha(JOptionPane.showInputDialog(null, "Ingrese la fecha de la reservacion:", "Fecha",
                JOptionPane.QUESTION_MESSAGE));
        setHora(JOptionPane.showInputDialog(null, "Ingrese la hora de la reservacion:", "Hora",
                JOptionPane.QUESTION_MESSAGE));
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nCedula: "
                + getCedula() + "\nFecha: " + getFecha() + "\nHora: " + getHora());
    }
}
