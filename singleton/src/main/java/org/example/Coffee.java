package org.example;

public class Coffee {

    private static Coffee coffee;
    // Constructor also private
    private Coffee(){
    }

//    Lazy way of creating single object
//    public static Coffee getCoffee(){
////        Object of this class
//       if(coffee == null){
//           coffee = new Coffee();
//       }
//       return coffee;
//    }

//    <----------- Multi-Threaded Environments --------------->

//  The entire getCoffee() method was synchronized, ensuring thread safety but potentially impacting performance.

//    public static synchronized Coffee getCoffee(){
//        if (coffee == null){
//            coffee = new Coffee();
//        }
//        return coffee;
//    }

//    Here, Double-checked locking pattern is used, reducing the performance impact of synchronization
//    by applying it only when the coffee instance is null.

    public static Coffee getCoffee(){
       if(coffee == null){
           synchronized (Coffee.class){
               if(coffee == null){
                   coffee = new Coffee();
               }
           }
       }
       return coffee;
    }
}
