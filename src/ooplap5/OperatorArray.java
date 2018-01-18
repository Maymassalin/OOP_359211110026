package ooplap5;

public class OperatorArray {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};                        // การใส่่ค่าให้กับข้อทูลในอาเรย์เลย
        int num2[] = num;                                   // มีค่าเท่ากัน เพราะชี้ที่ตำแหน่งเดียวกัน
        int num3[] = {1, 2, 3, 4, 5};                       // มีค่าไม่เหมือนกันกับ num[]
        if(num==num3)
            System.out.println("true");
        else
            System.out.println("false");
        if(num==num2)
            System.out.println("true");
        else
            System.out.println("false");

        num[0] = 100;
        System.out.println(num2[0]);
        num[4] = 500;
        System.out.println(num[4]);

    } // main
} // class