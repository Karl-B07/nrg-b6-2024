package taskCalculatingShape;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
    }

    abstract class AbstractShape implements Shape{
        String color;
        double length;
        double width;
    
        public AbstractShape(String color, double length, double width){
            this.color = color;
            this.length = length;
            this.width = width;
        }
    }
    
    
    class Circle implements Shape {
        double radius;
    
        public Circle(double radius) {
            this.radius = radius;
        }
    
        @Override
        public double calculateArea() {
           return Math.PI * radius * radius;
        }
    
        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
    
    class Rectangle extends AbstractShape {
    
        public Rectangle(String color, double length, double width) {
            super(color, length, width);
        }
    
        @Override
        public double calculateArea() {
            return length * width;
        }
    
        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }
    
    public class TaskSheet128 {
        public static void main(String[] args) {
            System.out.println();
            Shape circle = new Circle(5.0);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
            System.out.println();
            Shape rectangle = new Rectangle("Red", 4.0, 6.0);
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        }
    }
    