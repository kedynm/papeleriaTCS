package menu;

import models.Administrator;
import models.Month;

import javax.swing.*;
import java.util.UUID;

public class Principal {


    private String message;


    public Principal() {
    }


    public void principalMenu() {
        String name;
        String lastName;
        Float utilitiesMonth;

        this.message = "***Bienvenido a la Administración Papeleria TCS***\n";
        JOptionPane.showMessageDialog(null, this.message);
        name = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");
        lastName = JOptionPane.showInputDialog("Por favor ingrese su Apellido : ");
        utilitiesMonth = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese las ganancias obtenidad en el mes de enero: "));

        Administrator administrator = new Administrator(UUID.randomUUID().toString(), name, lastName);
        Month month = new Month(UUID.randomUUID().toString(), "Enero", utilitiesMonth);
        reporte(administrator, month);
    }

    public void reporte(Administrator administrator, Month month) {
        Float january = month.getUtilitiesMonth();
        this.message = "Reporte de ganancias del administrador " + administrator.getName() + " " + administrator.getLastName() + "\n\n" +
                "\tGanancias mes Enero: " + month.getUtilitiesMonth() + "\n" +
                "\tGanancias mes Febrero: " + month.utilitiesFebrary(january) + "\n" +
                "\tGanancias mes Marzo: " + month.utilitiesMarch(january) + "\n" +
                "\tGanancias mes Abril: " + month.utilitiesApril(january) + "\n" +
                "\tGanancias mes Mayo: " + month.utilitiesMay(january) + "\n" +
                "\tGanancias mes Junio: " + month.utilitiesJun(january);

        JOptionPane.showMessageDialog(null, this.message);

    }


}
