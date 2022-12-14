package com.example.coin.dto;

public class Payment {

    String amount;
    String uid;
    String email;
    String indate;

    public Payment(String amount, String uid, String email, String indate) {
        this.amount = amount;
        this.uid = uid;
        this.email = email;
        this.indate = indate;
    }

    public Payment(String amount, String indate) {
        this.amount = amount;
        this.indate = indate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}