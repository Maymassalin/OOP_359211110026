package ooplap5;

public class myArray {
    private static int MAX  = 10;
    public static void main(String[] args) {
        // array
        int []num;
        num = new int[5];
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
//        System.out.println(num.length);
//        shortData(num);
        shortData(num);
        num[1] = 100;
        num[3] = num[1] *3; //100*=300
        num[5-1] = num[3] /50; //300/50 = 6;
        //   num[5] = 500;
        shortData(num);
        int num2[] = new  int[MAX]; //10 elements
        shortData(num2);



    }//main

    private static void shortData(int[] num) {
        System.out.println("Data in array: ");
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]+" ");
        }
    }
}//class

