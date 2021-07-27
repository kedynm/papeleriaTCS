package models;

import java.util.List;

public class Semester {
    private String idSemester;
    private List<Month> listMonths;

    public Semester() {}

    public Semester(String idSemester) {
        this.idSemester = idSemester;
    }

    public Semester(String idSemester, List<Month> listMonths) {
        this.idSemester = idSemester;
        this.listMonths = listMonths;
    }

    public String getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(String idSemester) {
        this.idSemester = idSemester;
    }

    public List<Month> getListMonths() {
        return listMonths;
    }

    public void setListMonths(List<Month> listMonths) {
        this.listMonths = listMonths;
    }

    @Override
    public String toString() {
        return "Semester{" +
                "idSemester='" + idSemester + '\'' +
                ", listMonths=" + listMonths +
                '}';
    }
}
