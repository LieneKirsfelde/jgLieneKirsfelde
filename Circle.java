package lv.javaguru.lesson3;

public class Circle {
    double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadiuss(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return 3.14 * radius *radius;
    }

}
