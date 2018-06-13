package com.example.user.troncalendar;

public class schoolpostlist {
     private String title;
     private String time;

    public schoolpostlist(String title, String time) {
        this.title = title;
        this.time = time;
    }
    public schoolpostlist(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
