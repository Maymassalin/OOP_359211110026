package ooplap3;


        import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {

        int select;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 1-3 : ");
        select = scanner.nextInt();

//        switch-case
        switch (select) {
            case 1: System.out.println("You enter 1");
                break;
            case 2: System.out.println("You enter 2");
                break;
            case 3: System.out.println("You enter 3");
                break;
            default: System.out.println("Please enter number 1-3, Thank you");
        } // switch

        char c = 'E';
        switch (c) {
            case 'A': System.out.println("A ant");break;
            case 'B': System.out.println("B bird");break;
            case 'c': System.out.println("c cat");break;
            default: System.out.println("----Thank you---");
        } // switch


    } // main
} // Class
