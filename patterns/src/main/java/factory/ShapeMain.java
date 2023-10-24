package factory;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("Triangle");
        shape.draw();

        
    }
}
