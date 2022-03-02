package com.afpa.fonctionnalities;

import java.util.ArrayList;

public class Menu {

    private String name;
    private ArrayList<Food> listFoods = new ArrayList<Food>();  //liste des aliments du menu
    private int nbPerson;
    private CaracteristicsFood caracteristicFood;

    public Menu() {
        this.caracteristicFood = new CaracteristicsFood();
    }

    public Menu(String name){
        this.caracteristicFood = new CaracteristicsFood();
        this.name = name;
    }


    public Menu(CaracteristicsFood caracteristicFood) {
        caracteristicFood = caracteristicFood;
    }

    public Menu(String name, ArrayList<Food> listFoods, int nbPerson, CaracteristicsFood caracteristicFood) {
        this.name = name;
        this.listFoods = listFoods;
        this.nbPerson = nbPerson;
        caracteristicFood = caracteristicFood;
    }


    //ajouter caractéristiques de la liste des aliments au menu

    public void addFoodMenu(Food food){
        this.listFoods.add(food);
        //update les caractéristiques du menu sur la food
        if (food.getCaractFood().isContainFish()){
            caracteristicFood.setContainFish(true);
        }
        if (food.getCaractFood().isContainMeat()){
            caracteristicFood.setContainMeat(true);
        }
        if (food.getCaractFood().isContainGlucid()){
            caracteristicFood.setContainGlucid(true);
        }
        if (food.getCaractFood().isContainGluten()){
            caracteristicFood.setContainGluten(true);
        }
        if (food.getCaractFood().isContainMilk()){
            caracteristicFood.setContainMilk(true);
        }
        if (food.getCaractFood().isContainGlucose()){
            caracteristicFood.setContainGlucose(true);
        }

    }



    //getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Food> getListFoods() {
        return listFoods;
    }

    public void setListFoods(ArrayList<Food> listFoods) {
        this.listFoods = listFoods;
    }

    public int getNbPerson() {
        return nbPerson;
    }

    public void setNbPerson(int nbPerson) {
        this.nbPerson = nbPerson;
    }

    public CaracteristicsFood getCaracteristicFood() {
        return caracteristicFood;
    }

    public void setCaracteristicFood(CaracteristicsFood caracteristicFood) {
        caracteristicFood = caracteristicFood;
    }
}
