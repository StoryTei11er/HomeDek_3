package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter your index: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        int [] numbersCopyLeft = Arrays.copyOf(arr, index);
        System.out.println(Arrays.toString(numbersCopyLeft));

        int[] numbersCopyRigh = Arrays.copyOfRange(arr, index, arr.length);
        System.out.println(Arrays.toString(numbersCopyRigh));

        int[] reversArr = new int [numbersCopyRigh.length + numbersCopyLeft.length];

        System.arraycopy(numbersCopyRigh, 0 , reversArr , 0, numbersCopyRigh.length);
        System.arraycopy(numbersCopyLeft, 0, reversArr,  numbersCopyRigh.length, numbersCopyLeft.length);

        System.out.println(Arrays.toString(reversArr));


    }
}


