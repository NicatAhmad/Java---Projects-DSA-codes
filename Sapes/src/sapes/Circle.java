
package sapes;

class Circle extends DrawableShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

  
    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    
    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
