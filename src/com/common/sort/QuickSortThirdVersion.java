package com.common.sort;

import java.util.Arrays;

public class QuickSortThirdVersion {

    public static void main(String[] args){

            int[] temp = {4,1,2,1000,2,7,1,0};
            sort(temp);
            System.out.println(Arrays.toString(temp));

    }

    private static void sort(int[] arr){
            if(null == arr || arr.length < 2){
                return;
            }
            sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int left, int right){
            if(left >= right){
                return;
            }
            // 例如  一个数组长度 是 4    则left 是 0 right是3    Math.random[0, 1)  * 3的话 就是在 0,2
            swap(arr, left  + (int)(Math.random() * (right - left + 1)), right);
            int[] partition = partition(arr, left, right);
            sort(arr, left, partition[0]);
            sort(arr, partition[1] + 1, right);
    }

    private static int[] partition(int[] arr, int left, int right){
        int mostLeft = left - 1;
        int mostRight = right;
        int index = left;
        while(index < mostRight){
            if(arr[index] < arr[right]){
                swap(arr, ++mostLeft, index++);
            }else if (arr[index] > arr[right]){
                swap(arr, --mostRight, index);
            }else{
                index++;
            }
        }
        swap(arr, mostRight, right);
        return new int[]{mostLeft,mostRight};
    }

    private static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
