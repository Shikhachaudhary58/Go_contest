package com.example.splashscreen;

public class Style {
    private String name;
    private String rank;
    private String rs;
    private Integer image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Style(String name, String rank, String rs, Integer image) {
        this.name = name;
        this.rank = rank;
        this.rs = rs;
        this.image = image;
    }
}
