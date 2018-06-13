package com.example.user.troncalendar;

public class activity1list {
    String name;
    String organization;
    String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public activity1list(String name, String organization, String type) {
        this.name = name;
        this.organization = organization;
        this.type = type;
    }
    public activity1list(){

    }

}
