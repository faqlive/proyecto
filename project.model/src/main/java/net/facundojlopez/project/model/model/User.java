package net.facundojlopez.project.model.model;

import java.time.LocalDate;

public class User {

    private  String idUser;
    private String name;
    private String mail;
    private LocalDate birthDate;
    private LocalDate accounUp;
    private String password;
    private Role userRole;

    public User() {

    }

    public User(String idUser, String name, String mail, LocalDate birthDate, String password) {
        this.idUser = idUser;
        this.name = name;
        this.mail = mail;
        this.birthDate = birthDate;
        this.accounUp = LocalDate.now();
        this.password = password;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getAccounUp() {
        return accounUp;
    }

    public void setAccounUp(LocalDate accounUp) {
        this.accounUp = accounUp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser='" + idUser + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", accounUp=" + accounUp +
                '}';
    }
}
