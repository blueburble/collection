package com.common.sort;

public class FindMaxNumber {

    public static void main(String[] args){
        int[] arr = {4,9,10,80,100,30,80,10,8,33,2,1999};
        System.out.println(find(arr, 8, 0 , arr.length - 1));
    }

    private static int find(int[] arr, int num, int l, int r){
        if(l == r){
            return arr[l];
        }
        int mid = l + ((r  - l) >> 1);
        int leftMax = find(arr, num, l, mid);
        int rightMax = find(arr, num, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }


}
