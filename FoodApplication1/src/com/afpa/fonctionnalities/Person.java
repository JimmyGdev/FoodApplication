package com.afpa.fonctionnalities;

public class Person extends User{

    private int id;
    private String firstName;
    private String lastName;
    private Preferences preferences;


    public Person(){
        this.preferences = new Preferences();
    }

    public Person(int id, String firstName, String lastName, Preferences preferences) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferences = preferences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }
}
