package B1;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Shape[] shapes = {circle, rectangle};

        for (Shape s : shapes) {
            System.out.println("Diện tích: " + s.getArea());
            System.out.println("Chu vi: " + s.getPerimeter());
            System.out.println("------------------");
        }
    }
}
