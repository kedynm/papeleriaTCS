package menu;

import models.Empleado;

import javax.swing.*;
import java.util.UUID;

public class MenuEmpleado {
    private String mensaje;

    public void mostrarMenu() {
        String nombre;
        String apellido;
        String celular;
        String ciudad;
        int ingresoMensual;

        this.mensaje = "*** PAGO DE IMPUESTOS DE EMPLEADO - PAPELERIA TCS ***\n";
        JOptionPane.showMessageDialog(null, this.mensaje);

        nombre = JOptionPane.showInputDialog("Por favor ingrese el nombre del empleado:");
        apellido = JOptionPane.showInputDialog("Por favor ingrese el apellido: ");
        celular = JOptionPane.showInputDialog("Por favor ingrese el número celular: ");
        ciudad = JOptionPane.showInputDialog("Por favor ingrese ciudad: ");
        ingresoMensual = Integer.parseInt(JOptionPane.showInputDialog("Ingreso Mensual: "));

        Empleado empleado = new Empleado(UUID.randomUUID().toString(), nombre, apellido, celular, ciudad, ingresoMensual);
        reporteEmpleado(empleado);
    }

    public void reporteEmpleado(Empleado empleado) {

        this.mensaje = "*** INFORME PAGO DE IMPUESTOS - PAPELERIA TCS ***\n\n" +
                "Empleado:   " + empleado.getNombre() + " " + empleado.getApellido() + "\n" +
                "Celular:       " + empleado.getCelular() + "\n" +
                "Ciudad:        " + empleado.getCiudad() + "\n\n" +
                "INGRESOS:\n" +
                "Mensual:      $" + empleado.getIngresoMensual() + "\n" +
                "Trimestral:  $" + empleado.calcularIngresoTrimestral(empleado.getIngresoMensual()) + "\n" +
                "Semestral:  $" + empleado.calcularIngresoSemestral(empleado.getIngresoMensual()) + "\n" +
                "Anual:           $" + empleado.calcularIngresoAnual(empleado.getIngresoMensual()) + "\n\n" +
                "TOTAL IMPUESTO A PAGAR:   $" + empleado.calcularImpuesto(empleado.getIngresoMensual());

        JOptionPane.showMessageDialog(null, this.mensaje);
    }
}
