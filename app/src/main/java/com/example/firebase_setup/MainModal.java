package com.example.firebase_setup;

public class MainModal {
    String username, specialisation, email, image;

    MainModal(){

    }

    public MainModal(String username, String specialisation, String email, String image) {
        this.username = username;
        this.specialisation = specialisation;
        this.email = email;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return image;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
