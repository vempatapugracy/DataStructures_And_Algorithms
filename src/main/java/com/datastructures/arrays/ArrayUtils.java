package com.datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    public void printArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void addAndUpdate(int[] arr){
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[2]=33;
    }

    public Object[] createArray(int length){
        Object[] createArr=new Object[length];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements into the array");
        for(int i=0;i<createArr.length;i++){
            System.out.println("Enter "+ i +" element to be added to the array");
            createArr[i]=sc.nextInt();
        }
        return createArr;
    }

    public static void main(String []args){
        ArrayUtils a=new ArrayUtils();
        Object[] arr=a.createArray(5);
        int[] intArr= Arrays.stream(arr).
                mapToInt(i-> i == null ? 0 : (int) i).
                toArray();
        a.addAndUpdate(intArr);
        a.printArray(intArr);

    }



}
