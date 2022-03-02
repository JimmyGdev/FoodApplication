package com.afpa.fonctionnalities;

import java.util.ArrayList;

public class SearchMenus {

    private static ArrayList<Menu> menuList = new ArrayList<Menu>(); //tableau dynamique

    public SearchMenus() {
    }

    public SearchMenus(ArrayList<Menu> menuList) {
        menuList = menuList;
    }


    public void addMenu(Menu newMenu){   //ajoute un nouveau menu à la liste des menus disponible
        menuList.add(newMenu);
    }

    public ArrayList<Menu> searchMenuForUser(Person person){

        boolean eatable = true;
        ArrayList<Menu> menuListEatable = new ArrayList<Menu>();

        for (int i = 0; i <= menuList.size() - 1; i++){

            if (person.getPreferences().isVegan()){
                if (!isFoodForVegans(menuList.get(i).getCaracteristicFood())){
                    eatable = false;
                }
            }
            if (person.getPreferences().isGlucoseInTolerant() && eatable){
                if (!isFoodOkForGlucose(menuList.get(i).getCaracteristicFood())){
                    eatable = false;
                }
            }
            if (person.getPreferences().isGlutenInTolerant() && eatable){
                if (!isFoodOkForGluten(menuList.get(i).getCaracteristicFood())){
                    eatable = false;
                }
            }
            if (person.getPreferences().isVegetarian() && eatable){
                if (!isFoodOkForVegetariansOrDislikeMeat(menuList.get(i).getCaracteristicFood())){
                    eatable = false;
                }
            }
            if (person.getPreferences().isHasCholesterol() && eatable){
                if (!isFoodOkForCholesterol(menuList.get(i).getCaracteristicFood())){
                    eatable = false;
                }
            }
            if (person.getPreferences().isHasDiabetes() && eatable){
                if (!isFoodOkForDiabete(menuList.get(i).getCaracteristicFood())){
                    eatable = false;
                }
            }
            if (person.getPreferences().isDislikeFish() && eatable){
                if (!isFoodForVegans(menuList.get(i).getCaracteristicFood())){
                    eatable = false;
                }
            }
            if (person.getPreferences().isVegan() && eatable){
                if (!isFoodForVegans(menuList.get(i).getCaracteristicFood())){
                    eatable = false;
                }
            }
            if (eatable){
                menuListEatable.add(menuList.get(i));
            }
            }
        return menuListEatable;
        }






    //méthodes de tests pour chaque préférence

    public boolean isFoodForVegans(CaracteristicsFood food){
        if (food.isContainMilk() || food.isContainFish() || food.isContainMeat()){
            return false;
        }
        return true;
    }

    public boolean isFoodOkForVegetariansOrDislikeMeat(CaracteristicsFood food){
        if (food.isContainMeat()){
            return false;
        }
        return true;
    }

    public boolean isFoodOkForCholesterol(CaracteristicsFood food){
        if (food.isContainMeat() || food.isContainMilk()){
            return false;
        }
        return true;
    }

    public boolean isFoodOkForDiabete(CaracteristicsFood food){
        if(food.isContainMeat() || food.isContainGlucid()){
            return false;
        }
        return true;
    }

    public boolean isFoodOkForGlucose(CaracteristicsFood food){
        if(food.isContainGlucose()){
            return false;
        }
        return true;
    }

    public boolean isFoodOkForGluten(CaracteristicsFood food){
        if (food.isContainGluten()){
            return false;
        }
        return true;
    }

    public boolean isFoodOkForGlucid(CaracteristicsFood food){
        if (food.isContainGlucid()){
            return false;
        }
        return true;
    }

    public boolean isFoodOkForDislikeFish(CaracteristicsFood food){
        if (food.isContainFish()){
            return false;
        }
        return true;
    }


    //getter setter

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Menu> menuList) {
        this.menuList = menuList;
    }
}
