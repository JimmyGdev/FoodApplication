package com.afpa.fonctionnalities;

public class Food {

    private String name;
    private CaracteristicsFood caractFood;
    private String description;

    public Food() {
    }

    public Food(String name, CaracteristicsFood caractFood, String description) {
        this.name = name;
        this.caractFood = caractFood;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CaracteristicsFood getCaractFood() {
        return caractFood;
    }

    public void setCaractFood(CaracteristicsFood caractFood) {
        this.caractFood = caractFood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
