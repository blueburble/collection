package com.common.sort;

import java.util.Arrays;

public class HollandFlagLess {

    public static void main(String[] args){
        int[] temp = {5,1,5,10,3,2,90,0,10,4,1000};
        convert(temp, 10);
        System.out.println(Arrays.toString(temp));
    }


    private static void convert(int[] arr, int num){
        if(arr == null || arr.length < 1){
            return;
        }
        int index_ = 0;
        int mostLess = -1;
        while(index_ < arr.length){
            if(arr[index_] < num){
                swap(arr, ++mostLess,index_);
            }
            index_++;
        }
    }


    private static void swap(int[] arr, int l, int r){
        if(l != r){
            arr[l] = arr[l] ^ arr[r];
            arr[r] = arr[l] ^ arr[r];
            arr[l] = arr[l] ^ arr[r];
        }

    }

}
