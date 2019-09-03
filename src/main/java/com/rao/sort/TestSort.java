package com.rao.sort;

import com.rao.common.constant.OrderDirectionEnum;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试排序算法
 * @author raojing
 * @date 2019/9/3 14:59
 */
public class TestSort {
    
    @Test
    public void testBubbleSort(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        int[] arr = {1,2,-1,5,-5};
        int[] arr = new int[80000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 800000);
        }

        System.out.println(dateFormat.format(new Date()));
        BubbleSort.sort(arr, OrderDirectionEnum.DESC);
        System.out.println(dateFormat.format(new Date()));
    }
    
}
