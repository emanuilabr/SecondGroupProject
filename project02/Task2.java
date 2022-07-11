package group.project02;

import static java.lang.Math.PI;

public class Task2 {

    /*
    Create an Interface 'Shape' with undefined methods as calculate Area and calculate Perimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */

}
class ShapeTester {
    public static void main(String[] args) {

        Shape[] obs = {new Circle(4), new Square(4.50)};
        for (Shape ob : obs) {
            ob.area();
            ob.perimeter();

        }
    }
}
interface Shape {
    void area();

    void perimeter();

}

class Circle implements Shape {
    double rad;

    Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public void area() {
        System.out.println("Area of a circle with rad " + rad + " is " + PI * (rad * rad));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of a circle with rad " + rad + " is " + (2 * PI * rad));
    }
}

class Square implements Shape {

    double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("Are of a square with side length " + length + " is " + (length * length));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of a square with side length " + length + " is " + 4 * (length));
    }
}

