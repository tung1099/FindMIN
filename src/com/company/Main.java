package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {4,2,1,6,7,3,5,-5,0};
        int index = minValue(arr);
        System.out.println(arr[index]);
    }
    public static int minValue(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index])
            index = i;
        }
        return index;
    }
}
