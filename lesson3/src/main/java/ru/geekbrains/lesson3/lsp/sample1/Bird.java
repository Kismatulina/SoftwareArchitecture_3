package ru.geekbrains.lesson3.lsp.sample1;

/**
 * Bird это тип T
 */
public class Bird {

    private boolean canFly = true; //но если бы добавили параметр(1)

    public Bird(boolean canFly) {
        this.canFly = canFly;
    } // (2)какие-нибудь конструкторы

    public Bird() {
    }

    public boolean isCanFly() {

        return canFly; // (3)в рамках геттера
    }

    public void fly(){

        System.out.println("Птица летит.");
    }

}
