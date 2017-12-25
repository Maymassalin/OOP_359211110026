package ooplap5;
//1. allow user input data into array: inputData,showData
//2. find summation of data in array
//3. find average value in array
//4. find maximum value in array
//5. find maximum valur in array
//6. sorting data in array (Descending order)
//7. sorting data in array (Ascehding ouder)


import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
    private static void MAX = 5;
    public static void main (String[] args){
        Integer[] num = new Integer[MAX];
    num = inputData(num);
    showData(num);
    findSummarion(num);
    findMax(num);
    DescendingOrder(num);
    AscendingOrder(num);

    }//main

    private static void findSummarion(Integer[] mum){
        System.out.println("The Manimun value is: "+ Collections.min(Arrays.asList(num)));
    }
    private static void findSummarion(Integer[] num){
        int total=0;
        for (int val:num)
            total+=val;
        System.out.println("The summation is : "+total);
        findSummarion(total);
    }//findSummarion
    private static void findAverage(Integer num){
        System.out.println("The average valus is: "+num);
    }
}//class
