
public class Car {
  public Car() {
  }

  // ----
  // Encapsulation
  // ----

  // Hide atribute from outside
  private String brand;
  private String color;
  private String type;
  private int speed;

  // set and get
  public void setSpeed(int speed) {
    this.speed = Math.max(0, speed); // Prevent negative
  }

  public String getBrand() {
    return brand;
  }

  public String getColor() {
    return color;
  }

  public String getType() {
    return type;
  }

  public int getSpeed() {
    return speed;
  }

  // -----
  // Abstraction
  // -----

  // No Abstraction
  public void startEngine() {
    System.out.println("Engine Starting");
  }

  public void injectFuel() {
  }

  public void igniteSpark() {
  }

  public void rotatePistons() {
  }

  // With Abstraction
  public void start() {
    startEngineAbstract();
    injectFuelAbstract();
    igniteSparkAbstract();
    rotatePistonsAbstract();
  }

  private void startEngineAbstract() {
    System.out.println("Engine Starting with Abstraction");
  }

  private void injectFuelAbstract() {
  }

  private void igniteSparkAbstract() {
  }

  private void rotatePistonsAbstract() {
  }

  public Car(String brand, String color, String type, int speed) {
    this.brand = brand;
    this.color = color;
    this.type = type;
    this.speed = speed;
  }

  public void accelerate(int speedIncrease) {
  }

}
