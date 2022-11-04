package com.common.sort;

import java.util.Arrays;

public class QuickSortFirstVersion {
    public static void main(String[] args){
            int[] temp = {100,90,10,1000,60000,10000,20000,2};
            sort(temp);
            System.out.println(Arrays.toString(temp));
    }


    private static void sort(int[] arr){
        if(null == arr || arr.length < 2){
            return;
        }
        sort(arr, 0, arr.length - 1);
    }



    private static void sort(int[] arr, int L, int R){
        if(L >= R) {
            return;
        }
        int partition = partition(arr,L,R);
        sort(arr, L, partition);
        sort(arr,partition + 2, R);
    }

    private static int partition(int[] arr, int l, int r){
        int left = l;
        int mostLeft = l -1;
        while(left < r){
            if(arr[left] <= arr[r]){
                swap(arr, ++mostLeft, left);
            }
            left++;
        }
        swap(arr, mostLeft + 1, r);
        return mostLeft;
    }

    private static void swap(int[] arr, int i, int j){
        if(i != j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }

    }
}
