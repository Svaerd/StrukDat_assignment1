public class Main {
  public static void main(String[] args) throws Exception {

    Car mycar = new Car();
    Car myHonda = new Car("Honda", "yellow", "Brio", 150);

    System.out.println("Hello, World!");
    System.out.println(myHonda.getBrand());
  }
}
