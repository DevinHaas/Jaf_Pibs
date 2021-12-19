package jaf.kapitel13.pp135;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class TrafficLine {

  public static final String RED = "\033[0;31m";     // RED
  public static final String GREEN = "\033[0;32m";   // GREEN
  public static final String RESET = "\033[0m";  // Text Reset

  Queue<Car> carQueue;
  ArrayList<Car> allCars = new ArrayList<>();
  Random ran = new Random();

  Car audieA8 = new Car("Audi", "A8", 400, "black");
  Car vwPassat = new Car("VW", "Passat", 210, "silver");
  Car supra = new Car("Toyota", "Supra", 700, "orange");
  Car lambo = new Car("Lamorghini", "Aventador", 650, "yellow");
  Car golf = new Car("VW", "Golf", 100, "navy blue");
  Car bentley = new Car("Bentley", "Continental Gt", 500, "green");
  Car mustang = new Car("Ford", "Mustang", 450, "black");

  public TrafficLine(Queue<Car> carQueue) {
    this.carQueue = carQueue;
  }

  public void runTrafficLight() {


    for (int i = 0; i <= 10; i++) {
      int numberOfCarThatEnter = ran.nextInt(5) + 1;

      try {

        System.out.println(RED + "\nThe Lights are red\n");
        for (int j = 0; j <= numberOfCarThatEnter; j++) {
          int randomCar = ran.nextInt(allCars.size());
          System.out.println(RESET+allCars.get(randomCar).carEntered());
          carQueue.add(allCars.get(randomCar));
        }

        System.out.println("\n" + "Waiting Line: \n" +carQueue);


        int numberOfCarThatLeave = ran.nextInt(carQueue.size());

        Thread.sleep(3000);
        System.out.println(GREEN+"\nThe Lights are green\n");
        for (int j = 0; j <= numberOfCarThatLeave; j++) {
          assert carQueue.peek() != null;
          System.out.println(RESET+ carQueue.peek().carLefts());
          carQueue.poll();
        }


        System.out.println("\n" + "Waiting Line: \n" +carQueue);

        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
        Thread.currentThread().interrupt();
      }
    }
  }

  public void addAllCars() {
    allCars.add(audieA8);
    allCars.add(vwPassat);
    allCars.add(supra);
    allCars.add(lambo);
    allCars.add(golf);
    allCars.add(bentley);
    allCars.add(mustang);
  }
}
