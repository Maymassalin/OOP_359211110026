package ooplap5;
//1.allow input data to array :inputData :showData
//2.find summation of data in array
//3.find average value in array //ค่าเฉลี่ย
//4.find maximum value in array //มากที่สุด
//5.find minimum value in array //น้อยที่สุด
//6.sorting data in array Descending order //น้อยไปมาก
//7.sorting data in array ascending order //มากไปน้อย

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {
    private static int MAX = 20; // ประกาศตัวเเปร 20 ค่า //1มิติ
    public static void main(String[] args) {
        Integer [] num = new Integer[MAX];
        num = inputData(num);
        showData(num);
        findSummation(num);
        findMax(num);
        findMin(num);
        DescendingOrder(num);
        AscendingOrder(num);




    }//main

    private static void AscendingOrder(Integer[] num) {
        System.out.println("Ascending Order:  ");
        Arrays.sort(num,Collections.reverseOrder());
        showData(num);
    }//AscendingOrder

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.println("Desending Order is: ");
        showData(num);  //showData(array.sort)
    }//descending


    private static void findMin(Integer[] num) {
        System.out.println("Minimum value is:  "+
                Collections.min(Arrays.asList(num)));

    }//min

    private static void findMax(Integer[] num) {
        System.out.println("Maximum value is:  "+
                Collections.max(Arrays.asList(num)));
    }//maximum

    private static void findSummation(Integer[] num) {
        int total=0;
        for (int val:num)
            total+=val;
        System.out.println("The summation is : "+total);
        findAverage(total);


    }//Summation

    private static void findAverage(Integer num) {
        System.out.println("The Average value is: "+num/MAX);

    }//findAverage

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
            //แสดงค่า 5 ค่าที่เอาร์เรย์ออกมา

        }

        return num;
    }//inputData


}//class