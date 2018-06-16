package com.example.user.troncalendar;

public class activitylist2 {
    String title;
    String time;
    String image;

    public activitylist2(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {

        return title;
    }

    public activitylist2(String image) {
        this.image = image;
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
    public activitylist2(){

    }
}
