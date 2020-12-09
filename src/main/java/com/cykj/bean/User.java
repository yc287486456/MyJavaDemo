package com.cykj.bean;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String Account;
    private String password;
    private String sex;
    private String educational;
    private String job;
    private Long phoneNumber;
    private String Email;
    private int userState;
    private String regsitertime;
    private UserParmars userParmars;
    private UserScore userScore;
    public User() {
    }

    public User(String account, String password, String sex, String educational, String job, long phoneNumber, String email) {
        Account = account;
        this.password = password;
        this.sex = sex;
        this.educational = educational;
        this.job = job;
        this.phoneNumber = phoneNumber;
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public String getRegsitertime() {
        return regsitertime;
    }

    public void setRegsitertime(String regsitertime) {
        this.regsitertime = regsitertime;
    }

    public UserParmars getUserParmars() {
        return userParmars;
    }

    public void setUserParmars(UserParmars userParmars) {
        this.userParmars = userParmars;
    }

    public UserScore getUserScore() {
        return userScore;
    }

    public void setUserScore(UserScore userScore) {
        this.userScore = userScore;
    }
}
