package com.common.sort;

public class FindOneNumberExists {

    public static void main(String[] args){
        int[] arr = {4,9,19,50,80,90,100,199,199,200,220,290,1999,40000};
        System.out.println(isExist(arr, 199));;
    }

    private static Boolean isExist(int[] arr, int num){
        if(arr == null || arr.length < 1){
            return false;
        }
        return findOneNumberExist(arr, num, 0, arr.length);
    }

    private static Boolean findOneNumberExist(int[] arr, int num, int L, int R){
        int left = L;
        int right = R;
        while(left < right){
            int mid = left + ((right - left) >> 1);
            if(arr[mid] == num){
                return true;
            }
            if(arr[mid] < num){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return false;
    }


}
