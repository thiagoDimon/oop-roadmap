package oop.roadmap;

public class MountainBike extends Bicycle {

  String suspensionType = "Full Suspension";
  String tireType = "Off-Road";
  String frameMaterial = "Aluminium";

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
