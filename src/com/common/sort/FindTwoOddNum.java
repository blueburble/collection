package com.common.sort;

import java.util.Arrays;

public class FindTwoOddNum {

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 4, 4, 4, 5, 5, 5, 3};
        System.out.println(Arrays.toString(findTwoArray(arr)));
    }


    private static int[] findTwoArray(int[] arr) {
        int eor1 = 0;
        int eor2 = 0;
        for (int temp : arr) {
            eor1 ^= temp;
        }
        // 提取最右侧的一  则说明这两个数一定存在该为为1 另外一个为0
        // 其他的偶数该为 是 1 或者 0 因为是偶数次 所以不影响结果
        int mostRight = eor1 & (~eor1 + 1);
        for (int temp : arr) {
            if ((mostRight & temp) == 0) {
                eor2 ^= temp;
            }
        }
        return new int[]{eor2, eor1 ^ eor2};
    }

}
