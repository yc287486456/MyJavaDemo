package com.cykj.bean;

public class People {
    private int id;
    private String peopleName;
    private String pSex;
    private String pAccount;
    private String pPassword;
    private int pRoleid;
    private PeopleParmars peopleParmars;

    public People() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex;
    }

    public String getpAccount() {
        return pAccount;
    }

    public void setpAccount(String pAccount) {
        this.pAccount = pAccount;
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword;
    }

    public PeopleParmars getPeopleParmars() {
        return peopleParmars;
    }

    public void setPeopleParmars(PeopleParmars peopleParmars) {
        this.peopleParmars = peopleParmars;
    }

    public int getpRoleid() {
        return pRoleid;
    }

    public void setpRoleid(int pRoleid) {
        this.pRoleid = pRoleid;
    }
}
