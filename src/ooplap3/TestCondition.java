package ooplap3;

public class TestCondition {
    public static void main(String[] args) {

        //        if
        int x = 10, y = 20;
        if (x<y)
            System.out.println("X less than Y");
        else
            System.out.println("X more than Y");

//        if-else-if
        if (y>30){
            System.out.println("Y less than 30");
        }
        else if (y>=20){
            System.out.println("Y equal 20");
            if (x+y >= 30){
                System.out.println("X+Y = 30");
            }
        }
        else {
            System.out.println("Y more than 20");
        }



        System.out.println("OOP");
        System.out.println("IS221");


    } // main
} // Class
