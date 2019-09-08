package com.rao.sort;

import com.rao.common.constant.OrderDirectionEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 快速排序
 * @author raojing
 * @date 2019/9/8 19:08
 */
public class QuickSort {

    public static void sort(int[] arr, int left, int right){
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp;

//        System.out.println("进入排序方法内");
//        System.out.println(l);
//        System.out.println(r);
//        System.out.println(pivot);

        while (l < r) {

//            System.out.println("===============刚进入循环" + l + ":" + arr[l] + "---" + r + ":" + arr[r] + "========中间值为:" + pivot);

            while (arr[l] < pivot) {
                l++;
//                System.out.println("找到左边:" + l + "值:" + arr[l]);
            }

            while (arr[r] > pivot) {
                r--;
//                System.out.println("找到右边:" + r + "值:" + arr[r]);
            }

            if (l >= r) {
//                System.out.println("如果左边的大于等于右边的退出内层循环");
                break;
            }

            System.out.println();
            System.out.println("交换之前的值" + Arrays.toString(arr));
            System.out.println("交换值:" + l + ":" + arr[l] + "---" + r + ":" + arr[r] + "===基准点值:" + pivot);
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            System.out.println("交换之后的值" + Arrays.toString(arr));


            if (arr[l] == pivot) {
                r--;
//                System.out.println("arr[l] == pivot:" + r);
            }

            if (arr[r] == pivot) {
                l++;
//                System.out.println("arr[r] == pivot:" + l);
            }

        }

        if(l == r){
//            System.out.println("如果左边等于右边");
            l++;
            r--;
        }

        if(left < r){
//            System.out.println("开始左边的" + left + r);
            System.out.println("左半边" + left + "---" + r);
            sort(arr, left, r);
        }
        if(right > l){
//            System.out.println("开始右边的" + right + l);
            System.out.println("右半边" + l + "---"+ + right);
            sort(arr, l, right);
        }

//        System.out.println();
        System.out.println("---");

    }


    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
//        int[] arr = {-9,78,1000,23,-567,70};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
