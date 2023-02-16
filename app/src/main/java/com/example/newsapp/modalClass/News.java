package com.example.newsapp.modalClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("pid")
    @Expose
    private String pid;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("time_pst")
    @Expose
    private String timePst;
    @SerializedName("pname")
    @Expose
    private String pname;
    @SerializedName("is_favorite")
    @Expose
    private Boolean isFavorite;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("source_name")
    @Expose
    private String sourceName;
    @SerializedName("source_url")
    @Expose
    private String sourceUrl;
    @SerializedName("source_logo")
    @Expose
    private String sourceLogo;
    @SerializedName("hash_url")
    @Expose
    private String hashUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("player_image_url")
    @Expose
    private String playerImageUrl;
    @SerializedName("pro_only")
    @Expose
    private Boolean proOnly;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimePst() {
        return timePst;
    }

    public void setTimePst(String timePst) {
        this.timePst = timePst;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSourceLogo() {
        return sourceLogo;
    }

    public void setSourceLogo(String sourceLogo) {
        this.sourceLogo = sourceLogo;
    }

    public String getHashUrl() {
        return hashUrl;
    }

    public void setHashUrl(String hashUrl) {
        this.hashUrl = hashUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlayerImageUrl() {
        return playerImageUrl;
    }

    public void setPlayerImageUrl(String playerImageUrl) {
        this.playerImageUrl = playerImageUrl;
    }

    public Boolean getProOnly() {
        return proOnly;
    }

    public void setProOnly(Boolean proOnly) {
        this.proOnly = proOnly;
    }
}
