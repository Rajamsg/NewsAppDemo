package com.example.newsapp.modalClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("next_items")
    @Expose
    private Integer nextItems;
    @SerializedName("sport")
    @Expose
    private String sport;
    @SerializedName("newslist")
    @Expose
    private List<News> newslist;

    public Integer getNextItems() {
        return nextItems;
    }

    public void setNextItems(Integer nextItems) {
        this.nextItems = nextItems;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<News> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<News> newslist) {
        this.newslist = newslist;
    }
}
