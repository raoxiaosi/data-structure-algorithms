package com.rao.sort;

import com.rao.common.constant.OrderDirectionEnum;
import com.rao.util.DirectionUtil;

import java.util.Arrays;

/**
 * 希尔排序（交换式）
 * @author raojing
 * @date 2019/9/5 19:51
 */
public class ShellSwapSort {
    
    public static void sort(int[] arr, OrderDirectionEnum direction){
        int temp;
        for(int gap = arr.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < arr.length; i++){
                for(int j = i - gap; j >= 0; j -= gap){
                    if(DirectionUtil.judgeDirection(arr[j + gap], arr[j], direction)){
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        ShellSwapSort.sort(arr, OrderDirectionEnum.ASC);
        System.out.println(Arrays.toString(arr));
    }
    
}
