package models;

public class Administrator {

    private String idAdmin;
    private String name;
    private String lastName;

    public Administrator() {
    }

    public Administrator(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Administrator(String idAdmin, String name, String lastName) {
        this.idAdmin = idAdmin;
        this.name = name;
        this.lastName = lastName;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "idAdmin='" + idAdmin + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
