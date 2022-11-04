package com.common.sort;

import java.util.Arrays;

public class QuickSortSecondVersion {

    public static void main(String[] args){

        int [] temp = {90, 100, 2, 1,0,900,300,1000};
        sort(temp);
        System.out.println(Arrays.toString(temp));
    }


    private static  void sort(int[] arr){
        if(null == arr || arr.length < 2){
            return;
        }
        sort(arr, 0, arr.length - 1);
    }


    private static void sort(int[] arr, int L, int R){
        if(L >= R){
            return;
        }
        int[] partition = partition(arr, L, R);
        sort(arr, L, partition[0]);
        sort(arr, partition[1] + 1, R);
    }

    private static int[] partition(int[] arr, int L, int R){
        int num = arr[R];
        int mostLeft = L - 1;
        int mostRight = R;
        int index = L;
        while(index < mostRight){
            if(arr[index] < num){
                swap(arr, ++mostLeft, index++);
            }else if(arr[index] == num){
                index++;
            }else if(arr[index] > num){
                swap(arr, --mostRight, index);
            }
        }
        swap(arr, mostRight, R);
        return new int[]{mostLeft, mostRight};
    }



    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
