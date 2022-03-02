package com.afpa.fonctionnalities;

public class ShoppingList {

    public String [] food;


    public ShoppingList() {
    }

    public ShoppingList(String[] food) {
        this.food = food;
    }


    public String[] getFood() {
        return food;
    }

    public void setFood(String[] food) {
        this.food = food;
    }
}
