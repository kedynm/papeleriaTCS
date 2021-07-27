package models;

public class Empleado extends Persona {

    private String celular;
    private String ciudad;
    private Integer ingresoMensual;

    public Empleado(String celular, String ciudad, Integer ingresoMensual) {
        this.celular = celular;
        this.ciudad = ciudad;
        this.ingresoMensual = ingresoMensual;
    }

    public Empleado(String id, String celular, String ciudad, Integer ingresoMensual) {
        super(id);
        this.celular = celular;
        this.ciudad = ciudad;
        this.ingresoMensual = ingresoMensual;
    }

    public Empleado(String id, String nombre, String apellido, String celular, String ciudad, Integer ingresoMensual) {
        super(id, nombre, apellido);
        this.celular = celular;
        this.ciudad = ciudad;
        this.ingresoMensual = ingresoMensual;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(Integer ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public Integer calcularIngresoTrimestral(Integer ingreso) {
        return ingreso * 3;
    }

    public Integer calcularIngresoSemestral(Integer ingreso) {
        return ingreso * 6;
    }

    public Integer calcularIngresoAnual(Integer ingreso) {
        return ingreso * 12;
    }

    public Double calcularImpuesto(Integer ingreso) {
        double impuesto;
        if (ingreso > 1500000) {
            impuesto = ingreso * 2;
        } else {
            impuesto = ingreso * 0.5;
        }
        return impuesto;
    }


}
