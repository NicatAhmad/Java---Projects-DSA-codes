
package sapes;


abstract class DrawableShape implements Shape {
    // Partial implementation of draw common to all drawable shapes
    @Override
    public void draw() {
        System.out.println("Drawing a shape.");
    }

    
    public abstract void resize(double factor);
}