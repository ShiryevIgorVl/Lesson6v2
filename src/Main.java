public class Main {

    public static void main (String[] args) {
        Animals[] animal = {
          new Dog("Бобик", 150, 5, 500, 10),
          new Cat("Мурзик", 50, 2, 200, 0),
          new Dog("Шарик", 150, 5, 500, 10),
          new Cat("Барсик", 50, 2, 200, 0),
        };
        for (int i = 0; i < animal.length; i++) {
            animal[i].run(120);
            animal[i].sail(6);

        }

    }
}
