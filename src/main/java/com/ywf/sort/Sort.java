package com.ywf.sort;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * ClassName Sort
 * 功能: 排序算法类
 * Author yangweifeng
 * Date 2019-07-12 15:05
 * Version 1.0
 **/
public class Sort {
    /**
     * 快速排序
     * @param array 数组
     * @param low 起始位置
     * @param high 结束位置
     */
    public static void quickSort(int[] array,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = array[low];
        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=array[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=array[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = array[j];
                array[j] = array[i];
                array[i] = t;
            }
        }
        //最后将基准为与i和j相等位置的数字交换
        array[low] = array[i];
        array[i] = temp;
        //递归调用左半数组
        quickSort(array, low, j-1);
        //递归调用右半数组
        quickSort(array, j+1, high);
    }
    /**
     * 冒泡排序 稳定排序算法
     * @param array 排序数组
     * 时间复杂度 n-1 + n-2 + n-3 + ... +1 等差数列  n(n-1)/2   n的平方
     */
    public static void BubbleSort(int array[]){
        int temp;
        for (int i = 0; i < array.length - 1; i++) { // -1是因为没必要和自身进行比较
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 改进版冒泡排序
     * @param array 排序数组
     * 假设我们现在排序ar[]={1,2,3,4,5,6,7,8,10,9}这组数据，按照上面的排序方式，第一趟排序后将10和9交换已经有序，
     * 接下来的8趟排序就是多余的，什么也没做。所以我们可以在交换的地方加一个标记，如果那一趟排序没有交换元素，
     * 说明这组数据已经有序，不用再继续下去。
     */
    public static void BubbleSortBetter1(int array[]){
        int i = 0;
        int tmp = 0;
        for (i = 0; i < array.length - 1; i++)//确定排序趟数
        {
            int j;
            int flag = 0;
            for (j = 0; j < array.length - 1 - i; j++)//确定比较次数
            {
                if (array[j]>array[j + 1])
                {
                    //交换
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = 1;//加入标记
                }
            }
            if (flag == 0)//如果没有交换过元素，则已经有序
            {
                return;
            }
        }
    }

    /**
     *优化2
     * @param array
     * 优化一仅仅适用于连片有序而整体无序的数据(例如：1， 2，3 ，4 ，7，6，5)。
     * 但是对于前面大部分是无序而后边小半部分有序的数据(1，2，5，7，4，3，6，8，9，10)排序效率也不可观，
     * 对于种类型数据，我们可以继续优化。既我们可以记下最后一次交换的位置，后边没有交换，必然是有序的，
     * 然后下一次排序从第一个比较到上次记录的位置结束即可。
     */
    public static void BubbleSortBetter2(int array[])
    {
        int i;
        int tmp;
        int flag;
        int pos;//用来记录最后一次交换的位置
        int k = array.length - 1;
        for (i = 0; i < array.length - 1; i++)//确定排序趟数
        {
            pos = 0;
            int j = 0;
            flag = 0;
            for (j = 0; j < k - i; j++)//确定比较次数
            {
                if (array[j]>array[j + 1])
                {
                    //交换
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = 1;//加入标记
                    pos = j;//交换元素，记录最后一次交换的位置
                }
            }
            if (flag == 0)//如果没有交换过元素，则已经有序
            {
                return;
            }
            k = pos;//下一次比较到记录位置即可
        }
    }

    /**
     * 数组逆序
     * @param array 不占用额外空间
     */
    public static  void arrayReverse(int array[]) {
        int temp;
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
    /**
     * 数组逆序
     * 算法本身不占据额外空间，数组均为已经分配好的数据
     */
    public static  void arrayReverse(int array1[],int array2[]) {
       int n = array1.length;
        for (int i = 0; i < n; i++) {
            array2[i] = array1[n - 1 - i];
        }
    }



}
