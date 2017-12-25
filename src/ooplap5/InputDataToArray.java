package ooplap5;
//1.declare array as Integer // ประกาศ
//2.allow user to input data in to array // ใส่ค่า
//3.show data in array//เเสดงค่าออกมา

import java.util.Scanner;

public class InputDataToArray {
    private static int MAX = 5; // ประกาศตัวเเปร 5 ค่า
    public static void main(String[] args) {
        Integer [] num = new Integer[MAX];
//      int []num2 = new int[MAX];
        num = inputData(num);
        showData(num);

    }//main

    private static void showData(Integer[] num) {
        System.out.println("Data in array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        } // ลูปพิมพ์ค่า 5 ค่า
        //enchance loop
        for (int i:num) {
            System.out.println();
        }

        System.out.println();

    }
    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an integer: ");
        for (int i=0;i<num.length;i++){
            System.out.println("num["+i+"]:  ");
            num[i] = scanner.nextInt();


        }

        return num;
    }//inputData


}//class