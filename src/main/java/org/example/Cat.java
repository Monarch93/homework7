package org.example;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public String toString() {
        return "Аппетит кота: " + name + " " + appetite + " его сытость: " + fullness;
    }

    void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.removeFood(appetite);
            fullness = true;
        }
    }
}
