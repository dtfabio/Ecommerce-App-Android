package com.example.fabiodt.route66store.Model;

public class User {
    private String name;
    private String password;

    public User(){

    }

    public User(String Name, String Password){
        name=Name;
       password=Password;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        name=Name;
    }

    public String getPassword(){
        return password;
    }
}
