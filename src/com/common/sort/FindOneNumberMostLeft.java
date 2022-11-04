package com.common.sort;

public class FindOneNumberMostLeft {

    public static void main(String[] args){
        int[] arr = {4,9,19,50,80,90,100,199,199,200,220,290,1999,40000};
        System.out.println(findMostLeftNum(arr, 40000));;
    }

    private static int findMostLeftNum(int[] arr, int num){
        if(arr == null || arr.length < 1){
            return -1;
        }
        return findMostLeftNum(arr, num, 0, arr.length);
    }



    private static int findMostLeftNum(int[] arr, int num, int left, int right){
        int L = left;
        int R = right;
        int mostLeft = Integer.MAX_VALUE;
        while(L < R){
            int mid = L + ((R - L) >> 1);
            if(arr[mid]  == num){
                mostLeft = Math.min(mid, mostLeft);
                R = mid;
            }
            else if(arr[mid] > num){
                R = mid;
            }
            else {
                L = mid + 1;
            }
        }
        return mostLeft;
    }



}
