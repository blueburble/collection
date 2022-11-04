package com.common.sort;

public class InvertedNumCalc {

    public static void main(String[] args){
        int[] arr = {9,10,40,4,20,120};
        System.out.println(calc(arr));
    }

    private static int calc(int[] arr){
        if(arr == null || arr.length < 2){
            return 0;
        }
        return calc(arr, 0, arr.length - 1);
    }

    private static int calc(int[] arr, int l, int r){
        if(l == r){
            return 0;
        }
        int mid = l +  ((r - l) >>1);
        int leftSum = calc(arr, l, mid);
        int rightSum = calc(arr, mid + 1, r);
        return leftSum + mergeSum(arr, l, r, mid) + rightSum;
    }

    private static int mergeSum(int[] arr, int left, int right, int middle){
        int[] tempArray = new int[right - left + 1];
        int sum = 0;
        int L = left;
        int R = middle + 1;
        int index = 0;
        while (L <= middle && R <= right){
            sum += arr[L] > arr[R] ? (R - L + 1) : 0;
            for(int i = R; i <= right; i ++){
                System.out.println(arr[L] + "," + arr[i]);
            }
            tempArray[index++] = arr[L] < arr[R] ? arr[L++] : arr[R++];
        }
        while(L  <= middle){
            tempArray[index++] = arr[L++];
        }
        while(R <= right){
            tempArray[index++] = arr[R++];
        }
        index = 0;
        while(index < tempArray.length){
            arr[index + left] = tempArray[index++];
        }
        return sum;

    }
}
