package Clases;

import javax.swing.JOptionPane;

public class Menu {

    private int a;
    private int b;
    menuComidas m = new menuComidas();

    public Menu() {
        this.a = 0;
        this.b = 0;

    }

    public void menu() {
        a = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido al restaurante La Buena Cuchara\n\n" + "Digite el numero para las siguientes opciones:\n\n"
                        + "1. Ver menu de Comidas\n2. Hacer un pedido\n3. Registro de empleados\n4.Hacer una Reservacion\n5,Informacion del restaurante\n6.Salir",
                "Menu",
                JOptionPane.PLAIN_MESSAGE));

        switch (a) {
            case 1:
                b = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite el numero para las siguientes opciones:\n"
                                + "1. Ver menu de Comidas Rapidas\n2.  Ver menu de Bebidas\n3.Salir",
                        "Menu",
                        JOptionPane.PLAIN_MESSAGE));
                switch (b) {
                    case 1:
                        m.mostrarComidasRapidas();
                        menu();
                        break;
                    case 2:
                        m.mostrarBebidas();
                        menu();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
                break;
            case 2:
                pedidoComidas p = new pedidoComidas();
                p.pedido();
                p.mostrarPedido();
                p.total();
                menu();
                break;
            case 3:
                registroEmpleados r = new registroEmpleados();
                r.pedirDatos();
                r.mostrarDatos();
                menu();
                break;
            case 4:
                datosReservaciones r1 = new datosReservaciones();
                r1.pedirDatos();
                r1.mostrarDatos();
                menu();
                break;
            case 5:
                informacionRestaurante r2 = new informacionRestaurante();
                r2.mostrarDatos();
                menu();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                menu();
                break;
        }
    }

}
