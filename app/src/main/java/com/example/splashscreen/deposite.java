package com.example.splashscreen;

public class deposite {
    private String diposit;
    private String time;
    private String date;
    private String rs;
    private String status;

    public deposite(String diposit, String time, String date, String rs, String status) {
        this.diposit = diposit;
        this.time = time;
        this.date = date;
        this.rs = rs;
        this.status = status;
    }

    public String getDiposit() {
        return diposit;
    }

    public void setDiposit(String diposit) {
        this.diposit = diposit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
