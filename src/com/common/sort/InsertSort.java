package com.common.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args){
        int[] temp = {9, 20,10,40, 5,3,2,100,9000};
        sort(temp);
        System.out.print(Arrays.toString(temp));
    }


    private static void sort(int[] arr){
        if(null == arr || arr.length < 2){
            return;
        }
        for(int i = 1; i < arr.length; i ++){
            for(int j = i ; j >= 1; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr,j, j -1);
                }
            }
        }
    }


    private static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
