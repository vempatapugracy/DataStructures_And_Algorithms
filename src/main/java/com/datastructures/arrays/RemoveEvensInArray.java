package com.datastructures.arrays;

import java.util.Arrays;

import static com.datastructures.arrays.ArrayUtils.printArray;

public class RemoveEvensInArray {

    public static int[] removeEvensUsingStreams(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return new int[0];
        }
        int newArr[] = Arrays.stream(arr).
                filter(i -> i % 2 != 0).toArray();
        return newArr;
    }

    public static int[] removeEvensRegular(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return new int[0];
        }
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] newArray=new int[oddCount];
        int k=0;
        for(int j=0; j<arr.length;j++){
            if(arr[j]%2!=0){
                newArray[k]=arr[j];
                k++;
            }
        }
        return newArray;
    }



    public static void main(String[] args) {
        int[] arr=new int[]{5,2,6,3,7,9,8};
        System.out.println("Original Array");
        printArray(arr);

        System.out.println("Array after removing Evens using Streams");
        printArray(removeEvensUsingStreams(arr));

        System.out.println("Array after removing Evens using Regular Loop");
        printArray(removeEvensRegular(arr));
    }
}
