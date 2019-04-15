public class Circle {
    double radius;

    public double getRadius(){
        return radius;
    } //lieka metode - netiek izmantota

    public void setRadiuss(double radius){
        this.radius = radius;
    } //Typo: radius

    double calculateArea(){
        return 3.14 * radius *radius;
    }

}
