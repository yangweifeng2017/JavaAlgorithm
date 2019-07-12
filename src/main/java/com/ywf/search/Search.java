package com.ywf.search;

/**
 * ClassName Search
 * 功能: 数据查找
 * Author yangweifeng
 * Date 2019-07-12 14:41
 * Version 1.0
 **/
public class Search {

    /**
     * 二分查找算法
     * @param array 有序数组
     * @param num 目标值
     * @return 目标值在数组中的下标
     */
    public static Integer BinarySearch(Integer array[],Integer num){
        if (null == array || array.length == 0) {
            System.out.println("数组为空");
            return -1;
        }
        Integer start = 0;
        Integer end = array.length - 1;
        while (start <= end){
            Integer middle = (start + end)/2;
            //Integer middle = (start + end) >> 1;
            if (array[middle] == num){
                return middle;
            }else if (array[middle] < num){
                start = middle + 1;
            }else if (array[middle] > num){
                end = middle - 1;
            }
        }
        return -1;
    }
}
