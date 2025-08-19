package ru.geekbrains.lesson3;
/**
 * 5. Создать конкретный автомобиль путём наследования класса
 *      * «Car», определить число колёс = 3. Провести проверку принципа LSP.(Liskov Substitution Principle.Принцип подстановки Барбары Лисков)
 */

import java.awt.*;

public class SoprtCar extends Car {
    public SoprtCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(3); //кол колес 3шт в
    }

    @Override
    public void movement() {

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
