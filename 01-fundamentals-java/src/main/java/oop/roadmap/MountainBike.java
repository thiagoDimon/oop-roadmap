package oop.roadmap;

public class MountainBike extends Bicycle {

  String suspensionType = "Full Suspension";
  String tireType = "Off-Road";
  String frameMaterial = "Aluminium";
  int seatHeight;

  public MountainBike() {}

  public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
  }

  void adjustSuspensionType(String suspensionType) {
    this.suspensionType = suspensionType;
  }

  void changeTyreType(String tireType) {
    this.tireType = tireType;
  }

  void changeFrameMaterial(String frameMaterial) {
    this.frameMaterial = frameMaterial;
  }

}
