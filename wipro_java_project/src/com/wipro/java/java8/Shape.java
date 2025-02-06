package com.wipro.java.java8;

@FunctionalInterface
interface Triangle {
 
    public void sides(int sides);

    default String show() {
        return "Showing the polygon figure";
    }
    default String show(String fig) {
        return fig;
    }

    static int area(int num1) {
        return num1;
    }
    static int perimeter(int num2) {
        return num2;
    }
}

public class Shape implements Triangle {

    @Override
    public void sides(int sides) {
        System.out.println("This shape has " + sides + " sides.");
    }

    public static void main(String[] args) {
        Shape triangle = new Shape();

        triangle.sides(3); 
        System.out.println(triangle.show()); 
        System.out.println(triangle.show("Triangle Pic")); 

        System.out.println("Triangle Area: " + Triangle.area(3)); 
        System.out.println("Triangle Perimeter : " + Triangle.perimeter(3)); 
        
        
        Shape decagon = new Shape();
        decagon.sides(10);
        System.out.println(decagon.show());
        System.out.println(decagon.show("Displaying a rectangle")); 

        System.out.println("Decagon Area : " + Triangle.area(100)); 
        System.out.println("Decagon Perimeter : " + Triangle.perimeter(50)); 
    }
}
