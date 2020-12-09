package com.cykj.bean;

import java.util.Date;

public class PeopleSelect {
    private int id;
    private String userName;
    private String  regsiterTime;
    private int score;
    private int upLoading;
    private int downLoading;
    private String  userState;

    public PeopleSelect() {

    }

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

    public String getRegsiterTime() {
        return regsiterTime;
    }

    public void setRegsiterTime(String regsiterTime) {
        this.regsiterTime = regsiterTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUpLoading() {
        return upLoading;
    }

    public void setUpLoading(int upLoading) {
        this.upLoading = upLoading;
    }

    public int getDownLoading() {
        return downLoading;
    }

    public void setDownLoading(int downLoading) {
        this.downLoading = downLoading;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}
