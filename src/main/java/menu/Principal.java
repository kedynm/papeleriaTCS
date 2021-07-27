package menu;

import models.Administrador;
import models.Empleado;
import models.Mes;

import javax.swing.*;
import java.util.UUID;

public class Principal {

    private String message;

    public Principal() {
    }

    public void principalMenu() {
        String nombre;
        String apellido;
        Float gananciaEnero;

        this.message = "***BIENVENIDO A LA ADMINISTRACIÒN DE LA PAPELERIA TCS***\n";
        JOptionPane.showMessageDialog(null, this.message);
        nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Por favor ingrese su Apellido : ");
        gananciaEnero = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese las ganancias obtenidas en el mes de enero: "));

        Administrador administrador = new Administrador(UUID.randomUUID().toString(), nombre, apellido, gananciaEnero);
        Mes mes = new Mes(UUID.randomUUID().toString(), "Enero");
        reporte(administrador, mes);
    }

    public void reporte(Administrador administrador, Mes mes) {

        Float gananciaEne = administrador.getGananciaEnero();
        Mes febrero = new Mes(UUID.randomUUID().toString(), "Febrero");
        Mes marzo = new Mes(UUID.randomUUID().toString(), "Marzo");
        Mes abril = new Mes(UUID.randomUUID().toString(), "Abril");
        Mes mayo = new Mes(UUID.randomUUID().toString(), "Mayo");
        Mes junio = new Mes(UUID.randomUUID().toString(), "Junio");

        this.message = "***REPORTE DE GANANCIAS***\n\n" +
                "Administrador: " + administrador.getNombre() + " " + administrador.getApellido() + "\n\n" +
                "\tGANANCIAS POR MES:\n" +
                mes.getNombre() + ": \t" + administrador.getGananciaEnero() + "\n" +
                febrero.getNombre() + ": \t" + febrero.gananciaFebrero(gananciaEne) + "\n" +
                marzo.getNombre() + ": \t" + marzo.gananciaMarzo(gananciaEne) + "\n" +
                abril.getNombre() + ": \t" + abril.gananciaAbril(gananciaEne) + "\n" +
                mayo.getNombre() + ": \t" + mayo.gananciasMayo(gananciaEne) + "\n" +
                junio.getNombre() + ": \t" + junio.gananciaJunio(gananciaEne) + "\n\n" +
                "\tGANANCIA SEMESTRE:" + "\n" +
                mes.gananciaSemestre(gananciaEne);

        JOptionPane.showMessageDialog(null, this.message);
    }

    public void principalEmpleado() {
        String nombre;
        String apellido;
        String celular;
        String ciudad;
        int ingresoMensual;

        this.message = "***PAGO DE IMPUESTOS EMPLEADO - PAPELERIA TCS***\n";
        JOptionPane.showMessageDialog(null, this.message);

        nombre = JOptionPane.showInputDialog("Por favor ingrese el nombre del empleado:");
        apellido = JOptionPane.showInputDialog("Por favor ingrese el apellido: ");
        celular = JOptionPane.showInputDialog("Por favor ingrese el número celular: ");
        ciudad = JOptionPane.showInputDialog("Por favor ingrese ciudad: ");
        ingresoMensual = Integer.parseInt(JOptionPane.showInputDialog("Ingreso Mensual: "));

        Empleado empleado = new Empleado(UUID.randomUUID().toString(), nombre, apellido, celular, ciudad, ingresoMensual);
        reporteEmpleado(empleado);
    }

    public void reporteEmpleado(Empleado empleado) {

        this.message = "*** INFORME PAGO DE IMPUESTOS - PAPELERIA TCS ***\n\n" +
                "Empleado: " + empleado.getNombre() + " " + empleado.getApellido() + "\n" +
                "Celular: " + empleado.getCelular() + "\n" +
                "Ciudad: " + empleado.getCiudad() + "\n\n" +
                "\tINGRESOS:\n" +
                "Trimestral: \t\t" + empleado.calcularIngresoTrimestral(empleado.getIngresoMensual()) + "\n" +
                "Semestral: \t\t" + empleado.calcularIngresoSemestral(empleado.getIngresoMensual()) + "\n" +
                "Anual: \t\t" + empleado.calcularIngresoAnual(empleado.getIngresoMensual()) + "\n\n" +
                "\tTOTAL IMPUESTO A PAGAR: \t\t" + empleado.calcularImpuesto(empleado.getIngresoMensual());

        JOptionPane.showMessageDialog(null, this.message);
    }


}
