package com.shsxt.mybatis.pojo;


public class Custmer {

    private int id;

    private String userName;

    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Custmer{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
