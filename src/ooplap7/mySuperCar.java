package ooplab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {

      SuperCar c = new SuperCar();
        c = inputData(c);
        c.getSuperCarInfo(c);

    } // main


    private static SuperCar inputData(SuperCar c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter car info ");
        System.out.print("Enter car brand : ");
        c.setBrand(scanner.nextLine());
        System.out.print("Enter car color : ");
        c.setColor(scanner.nextLine());
        System.out.print("Enter engine size : ");
        c.setEnginesize(scanner.nextLine());
        System.out.print("Enter max speed : ");
        c.setMaxspeed(scanner.nextLine());
        System.out.print("Enter country of origin :");
        c.setCountry(scanner.nextLine());
        System.out.println("-----------------------");

        return c;

    } // inputData
} // class