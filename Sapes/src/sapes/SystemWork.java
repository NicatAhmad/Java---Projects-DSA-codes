
package sapes;


public class SystemWork {

   
    public static void main(String[] args) 
    {
         
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        
        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());
        circle.resize(1.5);
        System.out.println("Resized Circle Area: " + circle.calculateArea());

        
        square.draw();
        System.out.println("Square Area: " + square.calculateArea());
        square.resize(2.0);
        System.out.println("Resized Square Area: " + square.calculateArea());
    }
    
}
