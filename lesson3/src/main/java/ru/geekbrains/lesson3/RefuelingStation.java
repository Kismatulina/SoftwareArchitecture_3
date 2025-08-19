package ru.geekbrains.lesson3;

public class RefuelingStation implements Refueling {
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }
}
/**
 * * 11. Создать путём наследования класса «Car» два
 *      * автомобиля: с бензиновым и дизельным двигателями,
 *      * имплементировать метод «Заправка топливом» интерфейса
 *      * «Заправочная станция». Реализовать заправку каждого
 *      * автомобиля подходящим топливом. Провести проверку принципа DIP.
 */