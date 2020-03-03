package net.facundojlopez.project.model.model;

import java.time.LocalDate;

public class Advert {

    private int idAdvert;
    private String title;
    private String advertDesc;
    private Product product;
    private LocalDate advertUp;
    private Category category;
    private User user;

    public Advert() {
    }

    public Advert(int idAdvert, String title, String advertDesc, Product product, LocalDate advertUp, Category category, User user) {
        this.idAdvert = idAdvert;
        this.title = title;
        this.advertDesc = advertDesc;
        this.product = product;
        this.advertUp = advertUp;
        this.category = category;
        this.user = user;
    }

    public int getIdAdvert() {
        return idAdvert;
    }

    public void setIdAdvert(int idAdvert) {
        this.idAdvert = idAdvert;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdvertDesc() {
        return advertDesc;
    }

    public void setAdvertDesc(String advertDesc) {
        this.advertDesc = advertDesc;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getAdvertUp() {
        return advertUp;
    }

    public void setAdvertUp(LocalDate advertUp) {
        this.advertUp = advertUp;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "idAdvert=" + idAdvert +
                ", title='" + title + '\'' +
                ", product=" + product +
                ", advertUp=" + advertUp +
                ", category=" + category +
                ", user=" + user +
                '}';
    }
}
