package oop.roadmap;

public class BicycleDemo {

  public static void main(String[] args) {

    // Cria dois tipos diferentes de objetos "bicicleta"
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    // Chama os métodos dos objetos
    bike1.changeCadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printStates();

    bike2.changeCadence(50);
    bike2.speedUp(10);
    bike2.changeGear(2);
    bike2.changeCadence(40);
    bike2.speedUp(10);
    bike2.changeGear(3);
    bike2.printStates();

    // Cria três tipos diferentes de bicicletas
    MountainBike mountainBike = new MountainBike();
    RoadBike roadBike = new RoadBike();
    TandemBike tandemBike = new TandemBike();

    // Chama ações das bicicletas

    // Mountain Bike
    System.out.println(" ===== MountainBike ===== ");
    mountainBike.speedUp(10);
    mountainBike.adjustSuspensionType("Off-Road");
    mountainBike.printStates();

    // Road Bike
    System.out.println(" ===== RoadBike ===== ");
    roadBike.changeGear(2);
    roadBike.changeHandlebarPosition("Top Bar");
    roadBike.printStates();

    // Tandem Bike
    System.out.println(" ===== TandemBike ===== ");
    tandemBike.coordinateRiders();
    tandemBike.changeGear(4);
    tandemBike.printStates();

  }

}
