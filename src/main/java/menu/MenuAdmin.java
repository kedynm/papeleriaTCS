package menu;

import models.Administrador;
import models.Mes;

import javax.swing.*;
import java.util.Objects;
import java.util.UUID;

public class MenuAdmin {
    private String mensaje;

    public void menuPpalAdmin() {
        String nombre;
        String apellido;
        int gananciaEnero;

        this.mensaje = "*** BIENVENIDO A LA ADMINISTRACIÒN DE LA PAPELERIA TCS ***\n";
        JOptionPane.showMessageDialog(null, this.mensaje);
        nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Por favor ingrese su Apellido : ");
        gananciaEnero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese las ganancias obtenidas en el mes de enero: "));

        Administrador administrador = new Administrador(UUID.randomUUID().toString(), nombre, apellido, gananciaEnero);
        Mes mes = new Mes(UUID.randomUUID().toString(), "Enero");
        reporte(administrador, mes);
    }

    public void reporte(Administrador administrador, Mes mes) {

        int gananciaEne = administrador.getGananciaEnero();
        Mes febrero = new Mes(UUID.randomUUID().toString(), "Febrero");
        Mes marzo = new Mes(UUID.randomUUID().toString(), "Marzo");
        Mes abril = new Mes(UUID.randomUUID().toString(), "Abril");
        Mes mayo = new Mes(UUID.randomUUID().toString(), "Mayo");
        Mes junio = new Mes(UUID.randomUUID().toString(), "Junio");

        this.mensaje = "***REPORTE DE GANANCIAS***\n\n" +
                "Administrador: " + administrador.getNombre() + " " + administrador.getApellido() + "\n\n" +
                "GANANCIAS POR MES:\n" +
                mes.getNombre() + ":      " + administrador.getGananciaEnero() + "\n" +
                febrero.getNombre() + ":  " + febrero.gananciaFebrero(gananciaEne) + "\n" +
                marzo.getNombre() + ":    " + marzo.gananciaMarzo(gananciaEne) + "\n" +
                abril.getNombre() + ":    " + abril.gananciaAbril(gananciaEne) + "\n" +
                mayo.getNombre() + ":     " + mayo.gananciasMayo(gananciaEne) + "\n" +
                junio.getNombre() + ":    " + junio.gananciaJunio(gananciaEne) + "\n\n" +
                "GANANCIA POR SEMESTRE:" + "\n" +
                mes.gananciaSemestre(gananciaEne);

        JOptionPane.showMessageDialog(null, this.mensaje);
    }
}
