package Clases;

import javax.swing.JOptionPane;

public class menuComidas {

    private String ComidasRapidas[] = { "Pollo", "Pizza", "Hamburguesa", "Tacos" };
    private String bebidas[][] = { { "Coca-Cola", "Pepsi", "Fanta", "Sprite" },
            { "Cafe", "Te", "Leche", "Agua" } };

    public void mostrarComidasRapidas() {
        JOptionPane.showMessageDialog(null, "Comidas Rapidas:\n\n " + ComidasRapidas[0] + "\n" + ComidasRapidas[1] + "\n"
                + ComidasRapidas[2] + "\n" + ComidasRapidas[3]);
    }

    public void mostrarBebidas() {
        JOptionPane.showMessageDialog(null, "Bebidas: \n\n" + bebidas[0][0] + "\n" + bebidas[0][1] + "\n" + bebidas[0][2]
                + "\n" + bebidas[0][3] + "\n" + bebidas[1][0] + "\n" + bebidas[1][1] + "\n" + bebidas[1][2]
                + "\n" + bebidas[1][3]);
    }

 

}
