package com.example.splashscreen;

public class notification1 {
    private String play;
    private String time;
    private String text;
    private Integer image;

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public notification1(String play, String time, String text, Integer image) {
        this.play = play;
        this.time = time;
        this.text = text;
        this.image = image;
    }
}
