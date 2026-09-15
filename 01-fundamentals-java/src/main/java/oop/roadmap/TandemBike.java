package oop.roadmap;

public class TandemBike extends Bicycle {

  int seatCount = 2;
  int riderCount = 2;

  void synchronizePedaling() {
    System.out.println("TandemBike.synchronizePedaling");
  }

  void coordinateRiders() {
    System.out.println("TandemBike.coordinateRiders");
  }

}
