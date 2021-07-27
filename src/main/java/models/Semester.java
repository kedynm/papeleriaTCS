package models;

import java.util.List;

public class Semester {
    private String idSemester;
    private List<Mes> listMes;

    public Semester() {}

    public Semester(String idSemester) {
        this.idSemester = idSemester;
    }

    public Semester(String idSemester, List<Mes> listMes) {
        this.idSemester = idSemester;
        this.listMes = listMes;
    }

    public String getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(String idSemester) {
        this.idSemester = idSemester;
    }

    public List<Mes> getListMes() {
        return listMes;
    }

    public void setListMes(List<Mes> listMes) {
        this.listMes = listMes;
    }

    @Override
    public String toString() {
        return "Semester{" +
                "idSemester='" + idSemester + '\'' +
                ", listMonths=" + listMes +
                '}';
    }
}
