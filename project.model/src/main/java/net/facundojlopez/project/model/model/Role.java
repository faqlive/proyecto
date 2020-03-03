package net.facundojlopez.project.model.model;

public class Role {

    private String idRole;
    private String role;

    public Role() {
    }

    public Role(String idRole, String role) {
        this.idRole = idRole;
        this.role = role;
    }

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole='" + idRole + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
