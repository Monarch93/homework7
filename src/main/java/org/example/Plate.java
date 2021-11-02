package org.example;

public class Plate {

    public int food;
    public Plate(int food) {
        this.food = food;
    }

    public void removeFood(int n) {
        food -= n;
    }

    public void addFood(int x) {
        food += x;
    }

    public void foodAmount() {
        System.out.println("Всего еды: " + food);
    }
}
