package org.example;

public class main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
            cat[0] = new Cat("Чубаис", 5, false);
            cat[1] =new Cat("Шерстень", 10, false);
            cat[2] =new Cat("Крабичигоръ", 15, false);
            cat[3] =new Cat("Игорь", 20, false);
            cat[4] =new Cat("Ратлук", 25, false);

        Plate plate = new Plate(100);
        for (Cat c : cat) {
            System.out.println(c);
        }
        System.out.println("Добавляем еду в кормушку 100");
        plate.addFood(100);
        System.out.println("Кошки кушают еду:");
        for (Cat c : cat) {
            c.eat(plate);
            System.out.println(c);
        }
    }
}
