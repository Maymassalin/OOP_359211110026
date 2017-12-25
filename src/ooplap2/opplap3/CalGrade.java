package ooplap2.opplap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int score = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number between (1-100) : ");
            score = Integer.parseInt(reader.readLine());
            if (score < 0 || score > 100) {
                count++;
                if (count == 3) {
                    System.out.print("System Eror.");
                    break;
                }
            } else {
                if (score < 50) System.out.println("Your grade : F");
                else if (score <= 59) System.out.println("Your grade : D");
                else if (score <= 69) System.out.println("Your grade : C");
                else if (score <= 79) System.out.println("Your grade : B");
                else System.out.println("Your grade : A");
                break;

            }
        }
    }
}

//    score 0-49 grade F
//    score 50-59 grade D
//    score 60-69 grade C
//    score 70-79 grade B
//    score 80-100 grade A