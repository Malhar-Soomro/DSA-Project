package com.JavaByHarry;

public class Chapter_06_Practice_Set {
    public static void main(String[] args) {
//        key promote X
//        Noctis minimus
//        1
//        float [] num = new float[5];
//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//       System.out.println("Enter 5 numbers to calculate their sum");
//        for(int i = 0; i < num.length; i++){
//         num[i] = sc.nextFloat();
//         sum+=num[i];
//        }
//        System.out.println("Sum is "+sum);

        //2
//        int [] arr = {2, 43, 12, 54, 63, 23, 76, 44, 87, 74};
//        int num, counter = 0;
//        System.out.println("Enter a natural number ");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        for(int i = 0; i < arr.length; i++){
//            if(num==arr[i]){
//                counter++;
//                break;
//            }
//        }
//        if(counter==1){
//            System.out.println("Number is present in array");
//        }
//        else {
//            System.out.println("Number is not present in array");
//        }

        //3
//        System.out.println((100+34+43+22+77+54+98+34+87+67)/10f);

//        int[] marks = new int[10];
//        int total = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the marks of students in Physics");
//        for(int i:marks){
//            System.out.println(i);
//            marks[i] = sc.nextInt();
//           total+=marks[i];
//
//        }
//        System.out.println("average marks of students in Physics is "+total/10f);

        //4
//        int [][]MatrixA = new int[2][3];
//        int [][]MatrixB = new int[2][3];
//        int [][]MatrixC = new int[2][3];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the elements of Matrix A");
//       for(int i = 0; i < MatrixA.length; i++){
//           for(int j = 0; j < MatrixA[i].length; j++){
//               MatrixA[i][j] = sc.nextInt();
//           }
//       }
//        System.out.println("Enter the elements of Matrix B");
//        for(int i = 0; i < MatrixB.length; i++){
//            for(int j = 0; j < MatrixB[i].length; j++){
//                MatrixB[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < MatrixC.length; i++){
//            for(int j = 0; j < MatrixC[i].length; j++){
//                MatrixC[i][j]+=MatrixA[i][j] + MatrixB[i][j];
//                System.out.print(MatrixC[i][j]+" ");
//            }
//            System.out.println();
//        }

        //5
//        int []arr = {1,2,3,4,5,6};
//        for(int i = arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
//        }
        // Practice Problem 5
//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//
//        for(int element: arr){
//            System.out.print(element + " ");
//        }


        //6
//        int []arr = {54,21,86,43,27,564,93,54,85,23};
//        int max = 0;
//        for (int i:arr) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("Maximum element is "+max);

        //7
//
//        int []arr = {54,21,86,43,27,564,93,54,85,23};
//        int min = arr[0];
//
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println("Minimum element is "+min);

        //8
//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the elements of array");
//        for(int i = 0; i < arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
//        int counter = 0;
//        int counter2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(i==9){
//                break;
//            }
//            if (arr[i] < arr[i + 1]) {
//                counter++;
//
//            }
//        }
//        if (counter == 9) {
//            System.out.println("Sorted in increasing order");
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(i==9){
//                break;
//            }
//            if (arr[i] > arr[i + 1]) {
//                counter2++;
//            }
//        }
//        if (counter2 == 9) {
//            System.out.println("Sorted in decreasing  order");
//        }
//        if(counter2 < 9 && counter < 9 ){
//            System.out.println("Not sorted");
//        }



    }
}
