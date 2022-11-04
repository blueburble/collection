package com.common.sort;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args){
            int[] temp = {7,2,1,10,30,2,4,99,100,110};
            sort(temp);
            System.out.println(Arrays.toString(temp));
    }


    private static void sort(int[] arr){
        if(null == arr || arr.length < 2){
            return;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int i = 0;

        for(; i < arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int[] tempArray = new int [max - min +1];

        i = 0;
        for(; i < arr.length; i++){
            tempArray[arr[i] - min]++;
        }

        i = 0;
        int j = 0;
        for(; i < tempArray.length; i ++){
            while(tempArray[i] > 0){
                arr[j++] = min + i;
                tempArray[i] = tempArray[i] - 1;
            }
        }
    }
}
