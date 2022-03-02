package com.afpa.fonctionnalities;


public class Preferences {

    private boolean isVegetarian;
    private boolean isGlucoseTolerant;
    private boolean isGlutenTolerant;
    private boolean isVegan;

    private boolean hasDiabetes;
    private boolean hasCholesterol;

    private boolean dislikeFish;
    private boolean dislikeMeat;


    public Preferences() {
    }

    public Preferences(boolean isVegetarian, boolean isGlucoseTolerant, boolean isGlutenTolerant, boolean isVegan, boolean hasDiabetes, boolean hasCholesterol, boolean likeFish, boolean likeMeat) {
        this.isVegetarian = isVegetarian;
        this.isGlucoseTolerant = isGlucoseTolerant;
        this.isGlutenTolerant = isGlutenTolerant;
        this.isVegan = isVegan;
        this.hasDiabetes = hasDiabetes;
        this.hasCholesterol = hasCholesterol;
        this.dislikeFish = likeFish;
        this.dislikeMeat = likeMeat;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean isGlucoseInTolerant() {
        return isGlucoseTolerant;
    }

    public void setGlucoseInTolerant(boolean glucoseTolerant) {
        isGlucoseTolerant = glucoseTolerant;
    }

    public boolean isGlutenInTolerant() {
        return isGlutenTolerant;
    }

    public void setGlutenTolerant(boolean glutenTolerant) {
        isGlutenTolerant = glutenTolerant;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isHasDiabetes() {
        return hasDiabetes;
    }

    public void setHasDiabetes(boolean hasDiabetes) {
        this.hasDiabetes = hasDiabetes;
    }

    public boolean isHasCholesterol() {
        return hasCholesterol;
    }

    public void setHasCholesterol(boolean hasCholesterol) {
        this.hasCholesterol = hasCholesterol;
    }

    public boolean isDislikeFish() {
        return dislikeFish;
    }

    public void setDislikeFish(boolean likeFish) {
        this.dislikeFish = likeFish;
    }

    public boolean isLikeMeat() {
        return dislikeMeat;
    }

    public void setLikeMeat(boolean likeMeat) {
        this.dislikeMeat = likeMeat;
    }
}
