package Clases;

import javax.swing.JOptionPane;

public class pedidoComidas {

    private int Pollo, Pizza, Hamburguesa, Tacos;
    private int Cafe, Te, Leche, Agua;
    private int CocaCola, Pepsi;
    private int combo1, combo2, combo3, combo4, combo5, combo6, combo7, combo8, combo9, combo10;
    private int total;

    public pedidoComidas() {
        this.Pollo = 2500;
        this.Pizza = 8500;
        this.Hamburguesa = 4500;
        this.Tacos = 2500;
        this.Cafe = 1000;
        this.Te = 1000;
        this.Leche = 500;
        this.Agua = 500;
        this.CocaCola = 1350;
        this.Pepsi = 1400;
    }

    // sumar segun el pedido
    public void pedido() {
        combo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Pollo:", "Pollo",
                JOptionPane.QUESTION_MESSAGE));
        combo2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Pizza:", "Pizza",
                JOptionPane.QUESTION_MESSAGE));
        combo3 = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Hamburguesa:", "Hamburguesa",
                        JOptionPane.QUESTION_MESSAGE));
        combo4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Tacos:", "Tacos",
                JOptionPane.QUESTION_MESSAGE));
        combo5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Cafe:", "Cafe",
                JOptionPane.QUESTION_MESSAGE));
        combo6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Te:", "Te",
                JOptionPane.QUESTION_MESSAGE));
        combo7 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Leche:", "Leche",
                JOptionPane.QUESTION_MESSAGE));
        combo8 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Agua:", "Agua",
                JOptionPane.QUESTION_MESSAGE));
        combo9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Coca-Cola:", "Coca-Cola",
                JOptionPane.QUESTION_MESSAGE));
        combo10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresel la cantidad de Pepsi:", "Pepsi",
                JOptionPane.QUESTION_MESSAGE));
    }

    public void mostrarPedido() {
        JOptionPane.showMessageDialog(null,
                "Pollo: " + combo1 + "\nPizza: " + combo2 + "\nHamburguesa: " + combo3 + "\nTacos: " + combo4
                        + "\nCafe: " + combo5 + "\nTe: " + combo6 + "\nLeche: " + combo7 + "\nAgua: " + combo8
                        + "\nCoca-Cola: " + combo9 + "\nPepsi: " + combo10);
    }

    public void total() {
        total = combo1 * Pollo + combo2 * Pizza + combo3 * Hamburguesa + combo4 * Tacos + combo5 * Cafe + combo6 * Te
                + combo7 * Leche + combo8 * Agua + combo9 * CocaCola + combo10 * Pepsi;
        JOptionPane.showMessageDialog(null, "El total es: " + total);
    }

}
