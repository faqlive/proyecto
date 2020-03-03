package net.facundojlopez.project.model.model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product {
    private int idProduct;
    private String productName;
    private String porductDesc;
    private BigDecimal productPrice;
    private int productStock;
    private ArrayList <String> prodcutsImages;
    private User user;
    private Advert advert;

    public Product() {
    }

    public Product(String productName, String porductDesc, BigDecimal productPrice, int productStock) {
        this.productName = productName;
        this.porductDesc = porductDesc;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPorductDesc() {
        return porductDesc;
    }

    public void setPorductDesc(String porductDesc) {
        this.porductDesc = porductDesc;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public ArrayList<String> getProdcutsImages() {
        return prodcutsImages;
    }

    public void setProdcutsImages(ArrayList<String> prodcutsImages) {
        this.prodcutsImages = prodcutsImages;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", porductDesc='" + porductDesc + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                '}';
    }
}
