package org.example;

public class Plate {
    private int food;

    Plate(int foodAmount) {
        this.food = foodAmount;
    }

    void removeFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    int getFood() {
        return food;
    }

    void addFood(int amount) {
        food += amount;
    }
}
