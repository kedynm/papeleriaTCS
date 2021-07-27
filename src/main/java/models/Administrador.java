package models;

public class Administrador extends Persona {

    private Float gananciaEnero;


    public Administrador() {
    }

    public Administrador(Float gananciaEnero) {
        this.gananciaEnero = gananciaEnero;
    }

    public Float getGananciaEnero() {
        return gananciaEnero;
    }

    public void setGananciaEnero(Float gananciaEnero) {
        this.gananciaEnero = gananciaEnero;
    }

    public Administrador(String id, Float gananciaEnero) {
        super(id);
        this.gananciaEnero = gananciaEnero;
    }

    public Administrador(String id, String nombre, String apellido, Float gananciaEnero) {
        super(id, nombre, apellido);
        this.gananciaEnero = gananciaEnero;
    }


}

