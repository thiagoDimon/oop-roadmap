package oop.roadmap;

public class Bicycle implements IBicycle{

  // Representam o estado
  private int cadence = 0;
  private int speed = 0;
  private int gear = 1;

  // Representa os construtores
  public Bicycle() {}

  public Bicycle(int startCadence, int startSpeed, int startGear) {
    cadence = startCadence;
    speed = startSpeed;
    gear = startGear;
  }

  // Representam os métodos (ações)
  public int getCadence() {
    return cadence;
  }

  public void setCadence(int cadence) {
    this.cadence = cadence;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  @Override
  public void changeCadence(int newValue) {
    cadence = newValue;
  }

  @Override
  public void changeGear(int newValue) {
    gear = newValue;
  }

  @Override
  public void speedUp(int increment) {
    speed = speed + increment;
  }

  @Override
  public void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  void printStates() {
    System.out.println("cadence:" +
        cadence + " speed:" +
        speed + " gear:" + gear);
  }

}
