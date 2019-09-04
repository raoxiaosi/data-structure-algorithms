package com.rao.sort;

import com.rao.common.constant.OrderDirectionEnum;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 测试排序算法
 * @author raojing
 * @date 2019/9/3 14:59
 */
public class TestSort {

    private int[] arr;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    {
        arr = new int[80000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 800000);
        }
    }

    @Test
    public void testSelectSort(){
        System.out.println(dateFormat.format(new Date()));
        SelectSort.sort(arr, OrderDirectionEnum.DESC);
        System.out.println(dateFormat.format(new Date()));
    }
    
    @Test
    public void testBubbleSort(){
        System.out.println(dateFormat.format(new Date()));
        BubbleSort.sort(arr, OrderDirectionEnum.DESC);
        System.out.println(dateFormat.format(new Date()));
    }
    
}
