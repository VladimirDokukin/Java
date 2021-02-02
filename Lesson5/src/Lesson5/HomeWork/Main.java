package Lesson5.HomeWork;

public class Main {

    public static void main(String[] args) {

          Cat cat = new Cat(60,5,5, "Oleg");
          Cat cat2 = new Cat(25,2,1,"Anton");
          Dog dog = new Dog(250,15,1, "Ivan");
          Horse horse = new Horse(1500,100,3,"Anatoliy");
          Bird bird = new Bird(10,5,(float) 0.5, "Igor");
          Bird bird2 = new Bird(4,0,(float) 0.3, "Denis");

          System.out.println(cat.name);
          cat.animalSwim(5);
          cat.animalJump(4);
          cat.animalRun(50);

          System.out.println(cat2.name);
          cat2.animalSwim(5);
          cat2.animalJump(1);
          cat2.animalRun(25);

          System.out.println(dog.name);
          dog.animalSwim(5);
          dog.animalJump((float)0.3);
          dog.animalRun(200);

          System.out.println(horse.name);
          horse.animalSwim(90);
          horse.animalRun(1200);
          horse.animalJump(2);

          System.out.println(bird.name);
          bird.animalSwim(5);
          bird.animalRun(4);
          bird.animalJump((float) 0.2);

          System.out.println(bird2.name);
          bird2.animalSwim(9);
          bird2.animalRun(2);
          bird2.animalJump((float) 0.5);
    }
}
