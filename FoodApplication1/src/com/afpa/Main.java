package com.afpa;

import com.afpa.fonctionnalities.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //creations d'ingrédients   (avec des paramètres aléatoires!!)

        Food banana = new Food("Banana", new CaracteristicsFood(false, false, false, false, false, false), "Yummy" );
        Food milk = new Food("Milk", new CaracteristicsFood(false, false, false, false, true, false), "Lorem" );
        Food meat = new Food("Meat", new CaracteristicsFood(true, false, false, false, false, false), "Ipsum" );
        Food watermelon = new Food("Watermelon", new CaracteristicsFood(true, false, true, true, false, false), "Ipsum" );
        Food coffee = new Food("Coffee", new CaracteristicsFood(true, false, false, true, false, false), "Ipsum" );
        Food egg = new Food("Egg", new CaracteristicsFood(false, false, false, false, false, true), "Ipsum" );

        //creations de menues ALEATOIRES

        Menu bestMenu = new Menu("best menu");
        bestMenu.addFoodMenu(banana);
        bestMenu.addFoodMenu(milk);
        bestMenu.addFoodMenu(egg);

        Menu happyMeal = new Menu("Happy Meal");

        happyMeal.addFoodMenu(coffee);
        happyMeal.addFoodMenu(watermelon);

        Menu worstMenu = new Menu("worst Menu");
        worstMenu.addFoodMenu(meat);
        worstMenu.addFoodMenu(watermelon);

        Menu tresbonMenu = new Menu("Tres bon menu");
        tresbonMenu.addFoodMenu(meat);
        tresbonMenu.addFoodMenu(milk);

        //creations de personnes

        Person amelia = new Person();
        Preferences ameliaPreference = new Preferences(true, true, false, true, true, false, false, true);
        amelia.setPreferences(ameliaPreference);

        Person vick = new Person();
        Preferences vickPreference = new Preferences(false, false, false, true, true, false, false, true);
        vick.setPreferences(vickPreference);

        Person carl = new Person();
        Preferences carlPreference = new Preferences(true, false, false, true, false, false, true, true);
        carl.setPreferences(carlPreference);

        Person max = new Person();
        Preferences maxPreference = new Preferences(false, true, true, false, false, false, true, true);
        carl.setPreferences(carlPreference);

        //creation de la liste des menues
        SearchMenus menuListAChercher = new SearchMenus();
        menuListAChercher.addMenu(happyMeal);
        menuListAChercher.addMenu(worstMenu);
        menuListAChercher.addMenu(bestMenu);

        //recherche dans les menues en fonction de la personne amelia
        ArrayList<Menu> menuForAmelia = new ArrayList<Menu>();
        menuForAmelia = menuListAChercher.searchMenuForUser(amelia);

        //afficher la liste:
        Menu[] menuForAmeliaTab = new Menu[menuForAmelia.size()];
        for (int i = 0; i< menuForAmelia.size(); i++){
            menuForAmeliaTab[i] = menuForAmelia.get(i);
            System.out.println("Menu adapté pour Amelia: " + menuForAmeliaTab[i].getName());
        }

        //recherche dans les menues en fonction de la personne max
        ArrayList<Menu> menuForMax = new ArrayList<Menu>();
        menuForMax = menuListAChercher.searchMenuForUser(max);

        //afficher la liste:
        Menu[] menuForMaxTab = new Menu[menuForMax.size()];
        for (int i = 0; i< menuForMax.size(); i++){
            menuForMaxTab[i] = menuForMax.get(i);
            System.out.println("Menus adapté pour Max: " + menuForMaxTab[i].getName());
        }
    }
}
