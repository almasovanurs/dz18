package com.company;

public class Main {
    public static void main(String[] args) {
        /* Класс Cow (weight, age, gender, nickName)
        Класс Sheep (weight, age, gender, nickName)
        Класс Horse (weight, age, gender, nickName)
        Класс Farm (address, cows, horses, sheep, ownerName)
        2 Farm тузунуздор
        1 чи Farmда 3 sheep,5 cows, 2 horses болсун.
        2 чи  Farmда 1 sheep, 1 cow, 1 horse болсун.*/

        Cow cow1 = new Cow(222, 5, "woman", "A");
        Cow cow2 = new Cow(230, 6, "man", "B");
        Cow cow3 = new Cow(242, 2, "woman", "V");
        Cow cow4 = new Cow(300, 3, "man", "G");
        Cow cow5 = new Cow(400, 4, "woman", "s");
        Cow cow6 = new Cow(500, 5, "man", "BN");
        Cow [] cows = new Cow[] {cow1, cow2, cow3, cow4, cow5};
        Cow [] cows1 = new Cow[] {cow6};

        Sheep sheep1 = new Sheep(50, 3, "woman", "AS");
        Sheep sheep2 = new Sheep(55, 4, "man", "Av");
        Sheep sheep3 = new Sheep(65, 5, "woman", "AD");
        Sheep sheep4 = new Sheep(45, 2, "man", "AG");
        Sheep [] sheep = new Sheep[] {sheep1, sheep2, sheep3};
        Sheep [] sheepp = new Sheep[] {sheep4};

        Horse horse = new Horse(700, 5, "woman", "Luna");
        Horse horse1 = new Horse(800, 3, "man", "Pepi");
        Horse horse2 = new Horse(900, 6, "woman", "Anna");
        Horse [] horses = new Horse[] {horse, horse1};
        Horse [] horsesp = new Horse[] {horse2};

        /*Farm farm5 = new Farm ("AnimalFarm1", "Haryn",  cows, sheep, horses);
        Farm farm7 = new Farm("AnimalFarm2", "Osch",  cows1, sheepp, horsesp);*/


        Farm farm1 = new Farm("AnimalFarm", "Haryn",
                       horses,
                        cows,
                        sheep);
        System.out.println("Farm1: " + farm1.toString());
        Farm farm2 = new Farm("AnimalFarm2", "Osch",
                       horsesp,
                        cows1,
                        sheepp);
        System.out.println("Farm2: " + farm2.toString());










       // Farm farm = new Farm("AnimalFarm", "Naryn", "Hose1",   )


    }



}