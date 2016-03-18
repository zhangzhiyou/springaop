package com.you.dao;

/**
 * Created by zhiyou on 16-3-8.
 */
public class Bank {
    private int id;
    private String bankId;
    private int bankmoney;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public int getBankmoney() {
        return bankmoney;
    }

    public void setBankmoney(int bankmoney) {
        this.bankmoney = bankmoney;
    }

    public Bank(String bankId, int bankmoney) {
        this.bankId = bankId;
        this.bankmoney = bankmoney;
    }
}
