package com.cykj.bean;

public class UserScore {
    private int id;
    private  int SocerCount;
    private String OpenTime;
    private int UserId;
    private int ChangeScore;

    public UserScore() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSocerCount() {
        return SocerCount;
    }

    public void setSocerCount(int socerCount) {
        SocerCount = socerCount;
    }

    public String getOpenTime() {
        return OpenTime;
    }

    public void setOpenTime(String openTime) {
        OpenTime = openTime;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getChangeScore() {
        return ChangeScore;
    }

    public void setChangeScore(int changeScore) {
        ChangeScore = changeScore;
    }
}
