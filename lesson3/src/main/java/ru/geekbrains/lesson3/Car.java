package ru.geekbrains.lesson3;

import java.awt.*;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //endregion

    //region Public Methods

    // Движение
    public abstract void movement();
    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract boolean gearShifting();
    // Включение фар
    public abstract boolean switchHeadlights();
    // Включение дворников
    public abstract boolean switchWipers();

    // Подметать метод, в базовый сюда не ставим, а в конкретную машину уборщик, вот наш solid 1принцип SRP(ПринципЕдинственнойОтветственности)
    //public abstract void sweeping();

    //добавили обычный метод противотуманных фар, не абстрактный
    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }
// 5.задача метод колсво колес
    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колес
    private int wheelsCount;

    // Тип топлива (protected(защищенный) поставил
    protected FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Состояние противотуманных фар 4задача расширение класса, 2принцип OCP(открытости/закрытости)Наши сущности приложения открыты для расширения и закрыты для модификации
    private boolean fogLights = false;


    //endregion



}
