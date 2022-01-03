package com.DSA_Lab_Tasks;

public class Array_Deletion {


    public static void print(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void delete(int arr[], int index) {

        for (int k = index; k < (arr.length - 1); k++) {
            arr[k] = arr[k + 1];
        }
        arr[arr.length - 1] = 0;
    }


    public static void main(String[] args) {

        int[] array = {14,70,22,71,87,95,16,33,23,12};
        print(array);
        delete(array, 3);
        System.out.println();
        print(array);
    }
}
