package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] arr = {4,2,1,6,7,3,5,-5,0};
//        int index = minValue(arr);
//        System.out.println(arr[index]);

        Scanner scanner =new Scanner(System.in);
        int num;
        System.out.println("Enter a size: ");
        num = scanner.nextInt();
        int newArr[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + (i+1) + ": " );
            newArr[i] = scanner.nextInt();
        }
        System.out.println("Property list: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + " ");
        }
        int min = newArr[0];
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] < min) {
                newArr[i] = min;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
//    public static int minValue(int[] arr){
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < arr[index])
//            index = i;
//        }
//        return index;
//    }
}
