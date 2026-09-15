package oop.roadmap;

public class RoadBike extends Bicycle {

  String handlebarType = "Drop Bar";
  Boolean racingGeometry = false;
  Boolean aerodynamicDesing = true;

  void changeHandlebarPosition(String handlebarType) {
    this.handlebarType = handlebarType;
  }

}
