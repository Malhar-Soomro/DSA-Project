package com.DSA_Lab_Tasks.DSA_Pr;

import java.util.Arrays;

public class SearchAlgorithm {

    public static int linearSearch(int[] arr, int target){
        int elementNotFound = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return elementNotFound;
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int elementNotFound = -1;
        while (left <= right){
            mid = (left + right) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        //initializing an array
        int[] arr = {1, 6, 4, 3 , 7, 5,55,34,23,98,56,33};
        Arrays.sort(arr);
        int target = 56; // element which we have to find in array

        System.out.println(target+" found at index: "+linearSearch(arr,target));
        System.out.println(target+" found at index: "+binarySearch(arr,target));
        System.out.println(arr.length-1);
    }
}
