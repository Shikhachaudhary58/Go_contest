package com.example.splashscreen;

public class play {
    String brief;
    boolean visibilty;

    public boolean isVisibilty() {
        return visibilty;
    }

    public void setVisibilty(boolean visibilty) {
        this.visibilty = visibilty;
    }

    public play(String brief, boolean visibilty) {
        this.brief = brief;
        this.visibilty = false;
    }

    public play(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;
}
