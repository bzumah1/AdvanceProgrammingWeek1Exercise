package college;
//Shape superclass
public class Shape {
 public double area() {
     return 0;
 }

 public double perimeter() {
     return 0;
 }

 public double calculateVolume(double height) {
     return 0;
 }
}

//Circle subclass
public class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 public Circle(double diameter, boolean isDiameter) {
     this.radius = diameter / 2;
 }

 public double circumference() {
     return 2 * Math.PI * radius;
 }

 @Override
 public double area() {
     return Math.PI * Math.pow(radius, 2);
 }

 @Override
 public double perimeter() {
     return circumference();
 }

 @Override
 public double calculateVolume(double height) {
     return area() * height;
 }
}

//Rectangle subclass
public class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double area() {
     return length * width;
 }

 @Override
 public double perimeter() {
     return 2 * (length + width);
 }

 @Override
 public double calculateVolume(double height) {
     return area() * height;
 }
}

//Triangle superclass
public class Triangle extends Shape {
 private double base;
 private double height;
 private double sideA;
 private double sideB;
 private double sideC;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 public Triangle(double sideA, double sideB, double sideC) {
     this.sideA = sideA;
     this.sideB = sideB;
     this.sideC = sideC;
 }

 @Override
 public double area() {
     return 0.5 * base * height;
 }

 @Override
 public double perimeter() {
     return sideA + sideB + sideC;
 }

 @Override
 public double calculateVolume(double height) {
     return area() * height;
 }
}

//RightTriangle subclass
public class RightTriangle extends Triangle {
 private double side1;
 private double side2;

 public RightTriangle(double side1, double side2) {
     super(side1, side2);
     this.side1 = side1;
     this.side2 = side2;
 }

 @Override
 public double area() {
     return 0.5 * side1 * side2;
 }

 @Override
 public double calculateVolume(double height) {
     return (0.5 * side1 * side2 * height);
 }
}

//Main class
public class JAVAMIXPrac {
 public static void main(String[] args) {
     Circle circle1 = new Circle(5);
     Circle circle2 = new Circle(10, true);
     Rectangle rectangle = new Rectangle(4, 6);
     Triangle triangle = new Triangle(4, 6);
     RightTriangle rightTriangle = new RightTriangle(3, 4);

     System.out.println("Circle 1: ");
     System.out.println("Area: " + circle1.area());
     System.out.println("Circumference: " + circle1.circumference());
     System.out.println("Perimeter: " + circle1.perimeter());
     System.out.println("Volume: " + circle1.calculateVolume(2));
 }
}