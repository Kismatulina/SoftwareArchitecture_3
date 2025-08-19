package ru.geekbrains.lesson3.ocp;

public class CircleV2 implements ShapeV2{

    private final int radius;

    public int getRadius() {
        return radius;
    }

    public CircleV2(int radius) {
        this.radius = radius;
    }
//издесь сразу посчитаем площадь окружности, она меняться не будет
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}