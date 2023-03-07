package chapter14.shapes;

import java.util.Arrays;
import java.util.List;

abstract public class Shape {
    abstract public String toString();
    public void draw(){
        System.out.println(this + ".draw()");
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(),new Triangle(),new Square(),new Rhomboid());
        for (Shape item: shapes) {
            item.draw();
            rotate(item);

        }
        Rhomboid rhomboid = (Rhomboid) shapes.get(shapes.size() - 1);
        rhomboid.draw();
        if (shapes.get(shapes.size() - 1) instanceof Circle){
            Circle circle = (Circle) shapes.get(shapes.size() - 1);
            circle.draw();
        }

    }

    static void rotate(Shape shape){
        if (shape instanceof Circle){
        }else {
            System.out.println(shape.toString() + "rotate");
        }
    }
}
