package com.shsxt.mybatis.pojo;


public class Custmer {

    private int id;

    private String userName;

//    private String balance;

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

//    public String getBalance() {
//        return balance;
//    }
//
//    public void setBalance(String balance) {
//        this.balance = balance;
//    }


    @Override
    public String toString() {
        return "Custmer{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
