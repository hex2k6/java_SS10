package B2;
public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    @Override
    public void run() {
        System.out.println(brand + " - Cách di chuyển: Di chuyển bằng động cơ");
    }
}
