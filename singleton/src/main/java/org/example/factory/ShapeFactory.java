package org.example.factory;

public class ShapeFactory {
    public static Shape createShape(String str){
        if(str.equals("Circle"))
            return new Circle();
        else if (str.equalsIgnoreCase("Triangle"))
            return new Triangle();
        else if(str.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(str.equalsIgnoreCase("Square"))
            return new Square();
        else
            return null;
    }
}
