package net.facundojlopez.project.model.model;

import java.time.LocalDate;
import java.util.List;

public class User {

    private  int idUser;
    private String name;
    private String mail;
    private LocalDate birthDate;
    private LocalDate accountUp;
    private String password;
    private List<Role> userRole;


    public User() {

    }

    public User(int idUser, String name, String mail, LocalDate birthDate, String password) {
        this.idUser = idUser;
        this.name = name;
        this.mail = mail;
        this.birthDate = birthDate;
        this.accountUp = LocalDate.now();
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
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

    public LocalDate getAccountUp() {
        return accountUp;
    }

    public void setAccountUp(LocalDate accountUp) {
        this.accountUp = accountUp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getUserRole() {
        return userRole;
    }

    public void setUserRole(List<Role> userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser='" + idUser + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", accounUp=" + accountUp +
                '}';
    }
}
