package com.rao.sort;

import com.rao.common.constant.OrderDirectionEnum;

import java.util.Arrays;

/**
 * 选择排序算法
 * @author raojing
 * @date 2019/9/4 20:37
 */
public class SelectSort {

    public static void sort(int[] arr, OrderDirectionEnum direction){
        int min;
        int minIndex;
        for(int i = 0; i< arr.length - 1; i++){
            min = arr[i];
            minIndex = i;

            for(int j = i + 1; j < arr.length; j ++){
                switch (direction){
                    case DESC:
                        if(min < arr[j]){
                            min = arr[j];
                            minIndex = j;
                        }
                        break;
                    case ASC:
                        if(min > arr[j]){
                            min = arr[j];
                            minIndex = j;
                        }
                        break;
                    default:
                        break;
                }
            }

            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void main(String[] args) {

    }

}
