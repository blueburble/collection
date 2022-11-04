package com.common.sort;

public class FindOneOddNum {

    public static void main(String[] args){
        int[] temp = {4,4,4,4,4,4,1};
        System.out.println(find(temp));
    }

    private static int find(int[] temp){
        int eor = 0;
        for(int num : temp){
            eor = eor ^ num;
        }
        return  eor;
    }

}
