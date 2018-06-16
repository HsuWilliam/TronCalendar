package com.example.user.troncalendar;

public class activitylist3 {
    String title;
    String club;
    String time;
    String image;


    public activitylist3(String title, String club, String time,String image) {
        this.title = title;
        this.club = club;
        this.time = time;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClub() {
        return club;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public activitylist3(){

    }
}
