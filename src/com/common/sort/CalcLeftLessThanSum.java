package com.common.sort;

public class CalcLeftLessThanSum {

    public static void main(String[] args){
        // 6 + 9 + 10 + 6 + 6 + 9
        int[] temp = {6,9,10,20};
        System.out.println(calcSum(temp));
    }

    private static long calcSum(int[] arr){
        if(null == arr || arr.length < 1){
            return 0L;
        }
        return caclSum(arr, 0,  arr.length - 1);
    }

    private static long caclSum(int[] arr, int l, int r){
        if(l == r){
            return 0;
        }
        int middle = l + ((r - l) >> 1);
        long leftSum = caclSum(arr, l, middle);
        long rightSum = caclSum(arr, middle +1,  r);
        return merge(arr, l, middle, r) + leftSum + rightSum;
    }


    private static long merge(int[] arr, int left, int middle, int right){
        long sum = 0;
        int temp[] = new int[right - left + 1];
        int index1 = left;
        int index2 = middle + 1;
        int index_ = 0;
        while(index1<= middle && index2 <= right){
            sum += arr[index2] > arr[index1] ? (long) (right - index2 + 1) * arr[index1] : 0;
            temp[index_++] = arr[index1] < arr[index2] ?  arr[index1 ++ ] : arr[index2 ++ ];
        }
        while(index1 <= middle ){
            temp[index_++] = arr[index1++];
        }
        while(index2 <= right){
            temp[index_++] = arr[index2++];
        }
        index_ = 0;
        while(index_ < temp.length){
            arr[left + index_] = temp[index_++];
        }
        return sum;
    }
}
