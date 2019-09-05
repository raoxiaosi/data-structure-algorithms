package com.rao.util;

import com.rao.common.constant.OrderDirectionEnum;

/**
 * 方向工具类
 * @author raojing
 * @date 2019/9/5 20:20
 */
public class DirectionUtil {

    /**
     * 判断方向
     * @param nextVal 后一个数
     * @param preVal 前一个数
     * @param direction 方向
     * @return
     */
    public static boolean judgeDirection(int nextVal, int preVal, OrderDirectionEnum direction){
        switch (direction){
            case ASC:
                return preVal > nextVal;
            case DESC:
                return preVal < nextVal;
            default:
                // 默认升序
                return preVal > nextVal;
        }
    }
    
}
