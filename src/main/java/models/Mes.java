package models;

public class Mes {

    private String id;
    private String nombre;

    public Mes() {
    }

    public Mes(String id) {
        this.id = id;
    }

    public Mes(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float gananciaFebrero(Float gananciasEnero) {
        return gananciasEnero / 2;
    }

    public Float gananciaMarzo(Float gananciasEnero) {
        return gananciasEnero * 2;
    }

    public Float gananciaAbril(Float gananciasEnero) {
        return gananciaMarzo(gananciasEnero) * 0.8f;
    }

    public Float gananciasMayo(Float gananciasEnero) {
        return (gananciaFebrero(gananciasEnero) + gananciaMarzo(gananciasEnero)) / 3;
    }

    public Float gananciaJunio(Float gananciasEnero) {
        return (gananciasEnero +
                gananciaFebrero(gananciasEnero) +
                gananciaMarzo(gananciasEnero) +
                gananciaAbril(gananciasEnero) +
                gananciasMayo(gananciasEnero)) / 5;
    }
    public Float gananciaSemestre(Float gananciasEnero) {
        return gananciasEnero +
                gananciaFebrero(gananciasEnero) +
                gananciaMarzo(gananciasEnero) +
                gananciaAbril(gananciasEnero) +
                gananciasMayo(gananciasEnero) +
                gananciaJunio(gananciasEnero);
    }




}
