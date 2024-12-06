package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());


        smallestNumber(firstNumber,secondNumber,thirdNumber);



    }

    private static void smallestNumber(int n,int n2, int n3) {

        System.out.println(Math.min(Math.min(n,n2),n3));


    }

}
