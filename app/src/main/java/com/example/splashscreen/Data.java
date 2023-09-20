package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

public class Data {
    private String ques;
    private String play;
    private String fees;
    private String time;
    private String users;
    private Integer image;

    public String getJoinnow() {
        return joinnow;
    }

    public void setJoinnow(String joinnow) {
        this.joinnow = joinnow;
    }

    public Data(String joinnow) {
        this.joinnow = joinnow;
    }

    private String joinnow;

    public Data(String ques, String play, String fees, String time, String users, Integer image) {
        this.ques = ques;
        this.play = play;
        this.fees = fees;
        this.time = time;
        this.users = users;
        this.image = image;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

}


