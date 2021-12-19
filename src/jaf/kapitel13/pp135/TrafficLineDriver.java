package jaf.kapitel13.pp135;

import java.util.LinkedList;

public class TrafficLineDriver {
  public static void main(String[] args) {
    TrafficLine trafficLine = new TrafficLine(new LinkedList<>());
    trafficLine.addAllCars();

    trafficLine.runTrafficLight();
  }
}
