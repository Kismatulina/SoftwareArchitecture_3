package ru.geekbrains.lesson3.lsp.sample1;

/**
 * Ostrich страус это тип S
 */
public class Ostrich extends Bird {


    public Ostrich() {

        super(false);
    } // (4) и на уровне класса наследника переопределили бы соответсвующ конструктор, не умеет летать

    @Override
    public void fly() {
        System.out.println("Страус не умеет летать!"); //но если просто вывести, все равно не подходит,т.к все должны летать
        //throw new UnsupportedOperationException("Страус не умеет летать!"); //создав исключение ломается принцип подстановок
    }

    public void run(){
        System.out.println("Страус бежит!");
    }
}
