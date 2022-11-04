package com.common.sort;

import java.util.Arrays;

public class HollandFlagLessEqualMore {

    public static void main(String[] args){
        int[] temp = {5,1,5,10,3,2,90,0,10,4,1000,10};
        convert(temp, 10);
        System.out.println(Arrays.toString(temp));
    }

    private static void convert(int[] arr, int num){
        if(arr == null || arr.length < 1){
            return;
        }
        int left = 0;
        int less = -1;
        int more = arr.length;
        while(left < more){
            if(arr[left] < num){
                    swap(arr, ++less, left++);
            }else if(arr[left] > num){
                    swap(arr, --more, left);
            } else{
                    left++;
            }
        }
    }

    private static void swap(int[] arr, int i , int j){
        if(i != j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }
}
