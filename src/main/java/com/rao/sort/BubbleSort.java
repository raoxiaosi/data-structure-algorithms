package com.rao.sort;

import com.rao.common.constant.OrderDirectionEnum;
import com.rao.util.DirectionUtil;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 冒泡排序算法
 * @author raojing
 * @date 2019/9/3 14:23
 */
public class BubbleSort {

    /**
     * 排序
     * @param arr 无序数组
     * @param direction 方向
     */
    public static void sort(int[] arr, OrderDirectionEnum direction){
        int temp;
        boolean flag;
        for(int i = 0; i < arr.length - 1; i++){
            flag = true;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(DirectionUtil.judgeDirection(arr[j + 1], arr[j], direction)){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

}
