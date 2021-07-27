package models;

public class Month {

    private String idMonth;
    private String name;
    private Float utilitiesMonth;

    public Month() {
    }

    public Month(String idMonth) {
        this.idMonth = idMonth;
    }

    public Month(String idMonth, String name, Float utilitiesMonth) {
        this.idMonth = idMonth;
        this.name = name;
        this.utilitiesMonth = utilitiesMonth;
    }

    public String getIdMonth() {
        return idMonth;
    }

    public void setIdMonth(String idMonth) {
        this.idMonth = idMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getUtilitiesMonth() {
        return utilitiesMonth;
    }

    public void setUtilitiesMonth(Float utilitiesMonth) {
        this.utilitiesMonth = utilitiesMonth;
    }

    public Float utilitiesFebrary(Float utilitiesJanuary) {
        return utilitiesJanuary / 2;
    }

    public Float utilitiesMarch(Float utilitiesJanuary) {
        return utilitiesJanuary * 2;
    }

    public Float utilitiesApril(Float utilitiesJanuary) {
        return utilitiesMarch(utilitiesJanuary) * 0.8f;
    }

    public Float utilitiesMay(Float utilitiesJanuary) {
        return (utilitiesFebrary(utilitiesJanuary) + utilitiesMarch(utilitiesJanuary)) / 3;
    }

    public Float utilitiesJun(Float utilitiesJanuary) {
        return (utilitiesJanuary +
                utilitiesFebrary(utilitiesJanuary) +
                utilitiesMarch(utilitiesJanuary) +
                utilitiesApril(utilitiesJanuary) +
                utilitiesMay(utilitiesJanuary)) / 5;
    }


    @Override
    public String toString() {
        return "Month{" +
                "idMonth='" + idMonth + '\'' +
                ", name='" + name + '\'' +
                ", utilitiesMonth=" + utilitiesMonth +
                '}';
    }

}
