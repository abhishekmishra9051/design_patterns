package org.example.singeton;

public class Tea {

//    Eager way to creating singleton object
    private static Tea tea = new Tea();
    public static Tea getTea(){
        return tea;
    }
}
