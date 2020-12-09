package com.cykj.bean;

import java.util.List;

public class Page<T>{
    private int curPage;//当前页
    private int prePage;
    private int nextPage;//下一页
    private int countPage;//总页数
    private int pageSize;//每页多少
    private int totalCount;//总行数
    private List<T> list;

    public Page() {
    }

    public Page(int curPage, int pageSize, int totalCount) {
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        countPage=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getNextPage() {
        return nextPage==countPage?curPage:curPage+1;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPrePage() {
        return prePage==1?curPage:curPage-1;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
