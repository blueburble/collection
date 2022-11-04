package com.common.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AlmostOrderArraySort {

    public static void main(String[] args){
        int[] arr= {1,3,2,4,3,5};
        sort(arr, 2);
        System.out.println(Arrays.toString(arr));
    }


    private static void sort(int[] arr, int k){
        if(null == arr || arr.length < 2 || arr.length < k){
            return;
        }
        PriorityQueue<Integer> smallRootHeap = new PriorityQueue<>();
        int i = 0;
        for(; i < k; i++){
            smallRootHeap.add(arr[i]);
        }
        int j = 0;
        for(; i < arr.length; i ++){
            arr[j++] = smallRootHeap.poll();
            smallRootHeap.add(arr[i]);
        }
        while(!smallRootHeap.isEmpty()){
            arr[j++] = smallRootHeap.poll();
        }
    }


}
