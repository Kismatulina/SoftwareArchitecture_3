package ru.geekbrains.lesson3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {
// 2 задача - авто уборщик. Заправка (Fueling) и из 10 зад добавили Вытирание Wiping
//11з.DIP(Принцип инверсии зависимости) refueling(дозаправка) делает: 1 половина инверсии зависимости. 2я-детали реализации должны полностью подстраиваться под абстракцию
    private Refueling refueling;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль, 11 зад. если запр.станция существует, то вызываю на заправке метод(в файле Car.java тип топлива fuelType)
     */
    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }
//движение:
    @Override
    public void movement() {

    }
//обслуживание:
    @Override
    public void maintenance() {

    }
//Переключение передач:
    @Override
    public boolean gearShifting() {

        return false;
    }
//переключатель фар:
    @Override
    public boolean switchHeadlights() {

        return false;
    }
//переключатель дворников:
    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

//8. Имплементировали эти же методы интерфейса «Заправочная станция» но и в Refueling.java поставил их, а у меня нет
//стереть зеркала:
    @Override
    public void wipMirrors() {

    }
//протирать лобовое стекло:
    @Override
    public void wipWindshield() {

    }
//протереть фары:
    @Override
    public void wipHeadlights() {

    }


}
