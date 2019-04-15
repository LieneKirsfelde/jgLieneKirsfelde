public class CircleTest {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setRadiuss(2);
        double calculateArea = circle.calculateArea();

        System.out.println("Circle area is: " + calculateArea);

    }
}
