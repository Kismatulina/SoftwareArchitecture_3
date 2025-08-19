package ru.geekbrains.lesson3.lsp.sample1;

public class Program {

    // Тип S будет подтипом Т тогда и только тогда,
    // когда каждому объекту oS типа S соответствует некий объект oT типа T таким образом,
    // что для всех программ P,
    // реализованных в терминах T, поведение P не будет меняться, если oT заменить на oS.(oS это объект создан на базе S)

    public static void main(String[] args) {
        Bird bird1 = new Bird(); // oT (oT это объект создан на базе T)
        Bird bird2 = new Bird(); // oT
        Bird bird3 = new Bird(); // oT

        Ostrich ostrich1 = new Ostrich(); // oS (oS это объект создан на базе S)

        Bird[] birds = new Bird[4];
        birds[0] = bird1;
        birds[1] = bird2;
        birds[2] = bird3;
        birds[3] = ostrich1;

        flyBirds(birds);

    }

    /**
     * P
     * @param birds
     */
    public static void flyBirds(Bird[] birds){
        for (Bird bird: birds) {
            if (bird.isCanFly()) // (5) и сделали бы проверку, если птица умеет летать, то пускаем в полет
                bird.fly();
        }
    }

}
