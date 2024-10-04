package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "portfolio_id")
    private long portfolioId;

    @Column(name = "client_id")
    @OneToOne
    private Client client;

    public Portfolio() {
    }

    public Portfolio(Client client) {
        this.portfolioId = portfolioId;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
