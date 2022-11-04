package com.common.sort;

import java.util.Arrays;

public class BaseNumSort {

    public static void main(String[] args){

        int[] arr = {4,10,5,1,2,9,1000,300000,20,0};
        sort(arr, getMaxDigit(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int digit){
        int[] help = new int[arr.length];
        for(int i = 0;  i < digit; i++){
            int[] baseNumArray = new int[10];
            for(int j = 0;  j < arr.length; j++){
                baseNumArray[getDigitNum(arr[j], i + 1)]++;
            }
            int k = 1;
            for(; k < baseNumArray.length; k++){
                baseNumArray[k] = baseNumArray[k] +  baseNumArray[k - 1];
            }
            k = arr.length - 1;
            while(k >= 0){
                help[baseNumArray[getDigitNum(arr[k], i + 1)] -1 ] = arr[k];
                (baseNumArray[getDigitNum(arr[k--], i + 1)]) -= 1;
            }
            k = 0;
            while(k < help.length){
                arr[k] = help[k++];
            }
        }
    }


    private static int getDigitNum(int num, int digit){
        int sj = (int) Math.pow(10, digit - 1);
        return (num) / sj  % 10;
    }

    private static int getMaxDigit(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int digit = 1;
        while(max/10 != 0){
            digit++;
            max = max/ 10;
        }
        return digit;
    }
}
