package ru.geekbrains.lesson3;
/** 6. Создать конкретный автомобиль путём наследования класса
 * «Car», определить метод «движение» - «полёт». Провести
 * проверку принципа LSP.(Liskov Substitution Principle.Принцип подстановки Барбары Лисков)
 * */
import java.awt.*;

public class FlyCar extends Car {
    public FlyCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    public void fly(){
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly(); // добавили летать, не поняла про стоимость 3 колес говорит
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
