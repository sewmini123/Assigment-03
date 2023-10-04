package Shapes;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color="red";
        this.filled=true;
    }
    public Shape(String color ,boolean filled){
        this.color=color;
        this.filled =filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    protected abstract double getArea();
    protected abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color="+color +" ,filled="+ filled+"]" ;
    }

}
class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public  Circle(double radius,String color ,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [" + super.toString() + ", radius=" + radius + "]";

    }
}
class  Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double length , double width){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double length , double width ,String color ,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getLength(){
        return  length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    @Override
    public double getArea(){
        return length * width ;
    }
    @Override
    public double getPerimeter(){
        return 2 *(length * width) ;
    }

    @Override
    public String toString() {

        return "Rectangle [" + super.toString() + ", width=" + width + ", length=" + length+"]";

    }
}
class Square extends Rectangle{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    @Override
    public String toString() {
        return "Square[" + super.toString()+"]";
    }
}
class Main{
    public static void main(String[] args) {
        Circle cir = new Circle (1.0);
        Rectangle rec = new Rectangle(1.0 ,1.0);
        System.out.println("Circle:");
        System.out.println("Area: " + cir.getArea());
        System.out.println("Perimeter: " + cir.getPerimeter());


        System.out.println("\nRectangle:");
        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerimeter());

        Square square = new Square(3.5, "blue", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

    }
}
