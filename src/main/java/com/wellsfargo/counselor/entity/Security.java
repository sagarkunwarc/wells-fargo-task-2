package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "security_id")
    private long securityId;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "purchasePrice")
    private double purchasePrice;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "portfolio_id")
    @OneToMany
    private Portfolio portfolio;


    public Security() {

    }

    public Security(long securityId, String name, String category, Date purchaseDate, double purchasePrice, int quantity, Portfolio portfolio) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }


    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
