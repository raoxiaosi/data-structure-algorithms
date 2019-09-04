package com.rao.sort;

import com.rao.common.constant.OrderDirectionEnum;

import java.util.Arrays;

/**
 * 插入算法
 * @author raojing
 * @date 2019/9/4 23:14
 */
public class InsertSort {

    /**
     * 插入排序
     * 看做是两个数列，一个是无序，一个有序
     * @param arr
     * @param direction
     */
    public static void sort(int[] arr, OrderDirectionEnum direction){

        for(int i = 1; i < arr.length; i++){
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && judgeDirection(insertVal, arr[insertIndex], direction)){
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            };
            arr[insertIndex + 1] = insertVal;
        }
    }

    private static boolean judgeDirection(int insertVal, int insertIndexVal, OrderDirectionEnum direction){
        switch (direction){
            case ASC:
                return insertIndexVal > insertVal;
            case DESC:
                return insertIndexVal < insertVal;
            default:
                // 默认升序
                return insertIndexVal > insertVal;
        }
    }

}
