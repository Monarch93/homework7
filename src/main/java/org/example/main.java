package org.example;

import java.util.Scanner;

public class main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;

        Cat[] Cats = new Cat[5];
        Cats[0] = new Cat("Чубаис", 5, false);
        Cats[1] = new Cat("Шерстень", 10, false);
        Cats[2] = new Cat("Крабичигоръ", 15, false);
        Cats[3] = new Cat("Ратлук", 20, false);
        Cats[4] = new Cat("Игорь", 25, false);

        Plate plate = new Plate(50);
        plate.foodAmount();
        for (int i = 0; i < Cats.length; i++) {
            if (Cats[i].fullness == false && Cats[i].appetite <= plate.food){
                Cats[i].eat(plate);
                Cats[i].fullness = true;
                System.out.println("Киса " + Cats[i].name + " скушал " + Cats[i].appetite);
            } else {
                System.out.println("Для кисы " + Cats[i].name + " не хватило еды!");
            }
        }

        plate.foodAmount();
        System.out.println("Пожалуйста укажите сколько необходимо добавить еды.");
        action = sc.nextInt();
        plate.addFood(action);
        plate.foodAmount();

    }
}