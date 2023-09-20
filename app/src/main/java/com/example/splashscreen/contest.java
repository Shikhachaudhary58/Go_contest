package com.example.splashscreen;

public class contest {
    private String greetings;
    private String won;
    private String date;
    private Integer image;

    public contest(String greetings, String won, String date, Integer image) {
        this.greetings = greetings;
        this.won = won;
        this.date = date;
        this.image = image;

    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public String getWon() {
        return won;
    }

    public void setWon(String won) {
        this.won = won;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
