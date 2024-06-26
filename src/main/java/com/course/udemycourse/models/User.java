package com.course.udemycourse.models;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    
    public User() {
    }

    public User(String firstName, String lastName, String email) {
        this(firstName, lastName);
        this.email = email;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
