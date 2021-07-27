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

    public Integer gananciaFebrero(Integer gananciasEnero) {
        return gananciasEnero / 2;
    }

    public Integer gananciaMarzo(Integer gananciasEnero) {
        return gananciasEnero * 2;
    }

    public Double gananciaAbril(Integer gananciasEnero) {
        return gananciaMarzo(gananciasEnero) * 0.8;
    }

    public Integer gananciasMayo(Integer gananciasEnero) {
        return (gananciaFebrero(gananciasEnero) + gananciaMarzo(gananciasEnero)) / 3;
    }

    public Double gananciaJunio(Integer gananciasEnero) {
        return (gananciasEnero +
                gananciaFebrero(gananciasEnero) +
                gananciaMarzo(gananciasEnero) +
                gananciaAbril(gananciasEnero) +
                gananciasMayo(gananciasEnero)) / 5;
    }
    public Double gananciaSemestre(Integer gananciasEnero) {
        return gananciasEnero +
                gananciaFebrero(gananciasEnero) +
                gananciaMarzo(gananciasEnero) +
                gananciaAbril(gananciasEnero) +
                gananciasMayo(gananciasEnero) +
                gananciaJunio(gananciasEnero);
    }




}
