package menu;

import javax.swing.*;

public class Principal {

    private int opcion;
    private String mensaje;

    public Principal() {
    }

    public void menuPrincipal() {
        this.mensaje = "*** BIEVENIDO A PAPELERIA TCS ***\n\n"
                + "1. Ganancias por Administrador\n"
                + "2. Generar informe de pago de impuestos de empleados\n"
                + "3. Salir\n\n"
                + "Por favor elija una opción:";

        MenuAdmin menuAdmin = new MenuAdmin();
        MenuEmpleado menuEmpleado = new MenuEmpleado();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            switch (opcion) {
                case 1:
                    menuAdmin.mostrarMenu();
                    break;
                case 2:
                    menuEmpleado.mostrarMenu();
                    break;
                case 3:
                    opcion = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida \n " +
                            "Por favor seleccione una opción correcta ");
                    break;
            }
        } while (opcion != 0);
    }


}
