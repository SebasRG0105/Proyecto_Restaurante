package Clases;

import javax.swing.JOptionPane;

public class registroEmpleados {

    private datosEmpleados[] empleados = new datosEmpleados[3];

    public void pedirDatos() {
        datosEmpleados d = new datosEmpleados();
        for (int i = 0; i < empleados.length; i++) {
            d.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:", "Nombre",
                    JOptionPane.QUESTION_MESSAGE));
            d.setApellido(JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:", "Apellido",
                    JOptionPane.QUESTION_MESSAGE));
            d.setCedula(JOptionPane.showInputDialog(null, "Ingrese la cedula del empleado:", "Cedula",
                    JOptionPane.QUESTION_MESSAGE));
            d.setSalario(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado:", "Salario",
                    JOptionPane.QUESTION_MESSAGE));
            d.setCargo(JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado:", "Cargo",
                    JOptionPane.QUESTION_MESSAGE));
            empleados[i] = d;
        }
    }

    public void mostrarDatos() {
        for (int i = 0; i < empleados.length; i++) {
            JOptionPane.showMessageDialog(null,
                    "Nombre: " + empleados[i].getNombre() + "\nApellido: " + empleados[i].getApellido() + "\nCedula: "
                            + empleados[i].getCedula() + "\nSalario: " + empleados[i].getSalario() + "\nCargo: "
                            + empleados[i].getCargo());
        }
    }

}
