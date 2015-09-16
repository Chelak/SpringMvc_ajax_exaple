package com.springapp.mvc.domain;

import javax.persistence.*;

/**
 * Created by user on 9/15/2015.
 */
@Entity
@Table(name="product")
public class Product
{
    @Id
    @GeneratedValue
    @Column(name="productId")
    private int productId;
    @Column(name="productName")
    private String productName;
    @Column(name="productStock")
    private int productStock;
    @Column(name="productPrice")
    private double productPrice;
    @Column(name="productDescription")
    private String productDescription;


    public Product() {

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
