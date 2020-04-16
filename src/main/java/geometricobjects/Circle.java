package geometricobjects;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }




    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("My radius is: " + radius);

    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
}

