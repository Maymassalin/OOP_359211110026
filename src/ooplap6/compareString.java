package ooplap6;

public class compareString {
    public static void main(String[] args) {
        // compare String
        String m = "Hello GGGGG";
        String n = "Hello GGGGGGGGGG";

        // type 1 (==)
        if (m==n)System.out.println("yes.");
        else System.out.println("no.");

        // type 2 (equal())
        if (m.equals(n)) System.out.println("yes.");
        else System.out.println("no.");

        // type 3 (compareTo())
        if (m.compareTo(n)==0)
            System.out.println("yes.");             // ถ้า m และ n มีค่าเท่ากัน พิม yes
        else if (m.compareTo(n)>=1)
            System.out.println("no. +");            // ถ้า m มากกว่า n พิม no+
        else
            System.out.println("no. -");            // ถ้า m น้อยกว่า n พิม no-

    } // main
} // class