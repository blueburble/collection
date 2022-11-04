package com.common.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args){
            int[] temp = {9, 20,10,40, 5,3,2,100,9000};
            sort(temp);
            System.out.println(Arrays.toString(temp));
    }


    private static void sort(int[] arr){

        if(null == arr || arr.length < 2){
            return;
        }

        for(int i = 0;  i < arr.length - 1; i ++){

            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){

                minIndex = arr[j] < arr[minIndex] ? j : minIndex;

            }
            swap(arr, i, minIndex);
        }

    }



    private static void swap(int[] arr, int i, int j){
        if(i != j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }

}
