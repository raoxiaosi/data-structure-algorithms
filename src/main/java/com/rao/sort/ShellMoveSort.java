package com.rao.sort;

import com.rao.common.constant.OrderDirectionEnum;
import com.rao.util.DirectionUtil;

import java.util.Arrays;

/**
 * 希尔排序（移动法）
 *
 * @author raojing
 * @date 2019/9/8 17:56
 */
public class ShellMoveSort {

    public static void sort(int[] arr, OrderDirectionEnum direction) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && DirectionUtil.judgeDirection(insertVal, arr[insertIndex - gap], direction)) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        ShellMoveSort.sort(arr, OrderDirectionEnum.DESC);
        System.out.println(Arrays.toString(arr));
    }

}
