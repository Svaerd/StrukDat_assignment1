public class Main {
  public static void main(String[] args) throws Exception {

    Car mycar = new Car();
    Car myHonda = new Car("Honda", "yellow", "Brio", 150);

    System.out.println("Hello, World!");
    System.out.println(myHonda.getBrand());

    // No Abstraction
    // User see too much, all they care is the engine starting, not the whole
    // mechanism
    mycar.startEngine();
    mycar.injectFuel();
    mycar.igniteSpark();
    mycar.rotatePistons();

    // With Abstraction
    // User only see start
    mycar.start();
  }
}
