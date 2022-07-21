package com.company;

import java.util.Arrays;

public class Farm {

    private String ownerName;
    private String address;
   private  Horse [] horses;
   private Cow[] cows;
   private Sheep[] sheep;

    public Farm(String ownerName, String address, Horse[] horses, Cow[] cows, Sheep[] sheep) {
        this.ownerName = ownerName;
        this.address = address;
        this.horses = horses;
        this.cows = cows;
        this.sheep = sheep;
    }

    public Farm(String animalFarm2, String osch, Cow cow2, Horse horse2, Sheep sheep1) {
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "ownerName='" + ownerName + '\'' +
                ", address='" + address + '\'' +
                ", horses=" + Arrays.toString(horses) +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                '}';
    }
}
