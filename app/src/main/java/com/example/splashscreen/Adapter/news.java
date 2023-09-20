package com.example.splashscreen.Adapter;

public class news {


    public boolean expandable;
    String heading;
    String brief;
    Boolean visibility;

    public news(String heading, String brief) {
        this.heading = heading;
        this.brief = brief;
        this.visibility = false;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable =false;
    }

    public news(boolean expandable) {
        this.expandable = expandable;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public boolean isVisibility() {
        return visibility;
    }
}
