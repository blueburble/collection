package com.common.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {6,10,50,100,900,2000,6000,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        mergeSort(arr,0,arr.length - 1);
    }


    private static void mergeSort(int[] arr, int left, int right){
        if(left == right){
            return;
        }
        int middle = left + ((right - left) >> 1);
        mergeSort(arr,left,middle);
        mergeSort(arr,middle + 1,right);
        merge(arr,left,right,middle);
    }

    private static void merge(int[] arr, int left,  int right, int middle){
        int[] tempArray = new int[right - left  + 1];
        int index= 0;
        int L1 = left;
        int L2 = middle + 1;
        while (L1 <= middle && L2 <= right){
            tempArray[index++] = arr[right] < arr[left] ? arr[L2++] : arr[L1++];
        }
        while(L1 <= middle){
            tempArray[index++] = arr[L1++];
        }
        while(L2 <= right){
            tempArray[index++] = arr[L2++];
        }
        index = 0;
        while(index <  tempArray.length){
            arr[index + left] = tempArray[index++];
        }
    }
}
