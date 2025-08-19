package ru.geekbrains.lesson3;

import java.awt.*;

public class CarWash extends Car {
    public CarWash(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4); //кол колес 4шт в
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

