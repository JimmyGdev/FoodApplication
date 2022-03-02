package com.afpa.fonctionnalities;

public class CaracteristicsFood {

    private boolean containMeat;
    private boolean containGlucose;
    private boolean containGluten;
    private boolean containGlucid;
    private boolean containMilk;
    private boolean containFish;

    public CaracteristicsFood() {
    }

    public CaracteristicsFood(boolean containMeat, boolean containGlucose, boolean containGluten, boolean containGlucid, boolean containMilk, boolean containFish) {
        this.containMeat = containMeat;
        this.containGlucose = containGlucose;
        this.containGluten = containGluten;
        this.containGlucid = containGlucid;
        this.containMilk = containMilk;
        this.containFish = containFish;
    }








    public boolean isContainMeat() {
        return containMeat;
    }

    public void setContainMeat(boolean containMeat) {
        this.containMeat = containMeat;
    }

    public boolean isContainGlucose() {
        return containGlucose;
    }

    public void setContainGlucose(boolean containGlucose) {
        this.containGlucose = containGlucose;
    }

    public boolean isContainGluten() {
        return containGluten;
    }

    public void setContainGluten(boolean containGluten) {
        this.containGluten = containGluten;
    }

    public boolean isContainGlucid() {
        return containGlucid;
    }

    public void setContainGlucid(boolean containGlucid) {
        this.containGlucid = containGlucid;
    }

    public boolean isContainMilk() {
        return containMilk;
    }

    public void setContainMilk(boolean containMilk) {
        this.containMilk = containMilk;
    }

    public boolean isContainFish() {
        return containFish;
    }

    public void setContainFish(boolean containFish) {
        this.containFish = containFish;
    }
}
