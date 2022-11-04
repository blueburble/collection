package com.common.sort;

import java.util.Arrays;

public class BubbleSort {

        public static void main(String[] args){
            int[] temp = {9, 20,10,40, 5,3,2,100,9000};
            sort(temp);
            System.out.println(Arrays.toString(temp));
        }

        private static void sort(int[] arr){
            if(null == arr || arr.length < 2){
                return;
            }
            for(int i = arr.length - 1; i > 0; i--){

                for(int j = 0; j < i; j++){
                    if(arr[j + 1] < arr[j]){
                        swap(arr, j, j+1);
                    }
                }

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
