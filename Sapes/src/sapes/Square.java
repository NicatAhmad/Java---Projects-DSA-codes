
package sapes;


class Square extends DrawableShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

   
    @Override
    public double calculateArea() {
        return side * side;
    }

    
    @Override
    public void resize(double factor) {
        side *= factor;
    }
}
