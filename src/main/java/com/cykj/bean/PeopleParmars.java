package com.cykj.bean;

import java.util.List;

public class PeopleParmars {
    private int id;
    private String pjob;
    private int pType;
    private List<People> peopleList;

    public PeopleParmars() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPjob() {
        return pjob;
    }

    public void setPjob(String pjob) {
        this.pjob = pjob;
    }

    public int getpType() {
        return pType;
    }

    public void setpType(int pType) {
        this.pType = pType;
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }
}
