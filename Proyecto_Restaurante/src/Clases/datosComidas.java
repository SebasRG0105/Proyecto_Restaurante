package Clases;

import javax.swing.JOptionPane;

public class datosComidas {

    private String nombre;
    private String tipo;
    private int precio;

    public datosComidas() {
        this.nombre = "";
        this.tipo = "";
        this.precio = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void pedirDatos() {
        setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la comida:", "Nombre",
                JOptionPane.QUESTION_MESSAGE));
        setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de la comida:", "Tipo",
                JOptionPane.QUESTION_MESSAGE));
        setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio de la comida:", "Precio",
                JOptionPane.QUESTION_MESSAGE)));
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + getNombre() + "\nTipo: " + getTipo() + "\nPrecio: " + getPrecio());
    }

}
