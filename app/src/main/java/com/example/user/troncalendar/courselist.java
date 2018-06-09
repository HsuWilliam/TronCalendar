package com.example.user.troncalendar;

public class courselist {
    private String name;
    private String teachername;
    private String image;

    public courselist(String name, String organization, String teachername, String image) {
        this.name = name;
        this.teachername = teachername;
        this.image = image;
    }
    public courselist(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}