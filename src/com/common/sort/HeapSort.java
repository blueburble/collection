package com.common.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args){
        int[] arr = {10,2,1,9888,0,1,9998811,2,0,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void sort(int[] arr){
        if(null == arr || arr.length < 2){
            return;
        }
        int i = 0;
        for(; i < arr.length; i++){
            heapInsert(arr, i);
        }
        i = arr.length - 1;;
        for(; i > 0; ){
            swap(arr, 0, i);
            heapIfy(arr, --i);
        }
    }



    private static void heapInsert(int arr[], int i){
        while(arr[(i - 1)/ 2] < arr[i]){
            swap(arr, (i - 1)/ 2, i);
            i = (i - 1)/ 2;
        }
    }

    private static void heapIfy(int[] arr, int i){
        int maxIndex = 0;
        while((2 * maxIndex + 1) < i){
                int largest =  (2 * maxIndex + 2) > i ? (2 * maxIndex + 1) :
                        (Math.max(arr[ 2 * maxIndex + 1], arr[ 2 * maxIndex + 2]) == arr[ 2 * maxIndex + 1] ? (2 * maxIndex + 1) : (2 * maxIndex + 2));
                largest = Math.max(arr[largest], arr[maxIndex]) == arr[maxIndex] ? maxIndex : largest;
                if(largest == maxIndex){
                    return;
                }
                swap(arr, largest, maxIndex);
                maxIndex = largest;
        }

    }

    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
