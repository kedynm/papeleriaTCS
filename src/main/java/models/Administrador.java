package models;

public class Administrador extends Persona {

    private Integer gananciaEnero;


    public Administrador() {
    }

    public Administrador(Integer gananciaEnero) {
        this.gananciaEnero = gananciaEnero;
    }

    public Administrador(String id, Integer gananciaEnero) {
        super(id);
        this.gananciaEnero = gananciaEnero;
    }

    public Integer getGananciaEnero() {
        return gananciaEnero;
    }

    public void setGananciaEnero(Integer gananciaEnero) {
        this.gananciaEnero = gananciaEnero;
    }

    public Administrador(String id, String nombre, String apellido, Integer gananciaEnero) {
        super(id, nombre, apellido);
        this.gananciaEnero = gananciaEnero;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "gananciaEnero=" + gananciaEnero +
                '}';
    }
}

