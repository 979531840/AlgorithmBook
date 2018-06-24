package com.taojian.sort;

/**
 * @description: 冒泡排序
 * @author: taojian
 * @create: 2018-06-24 19:31
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，
 * 一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 *
 * 1.1 算法描述
 * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 针对所有的元素重复以上的步骤，除了最后一个；
 * 重复步骤1~3，直到排序完成。
 **/
public class BubbleSort {

    public static void main(String[] args) {

    }

    public static void bubbleSort(int array[]){
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (array[j] > array[j+1]) {        // 相邻元素两两对比
                    int temp = array[j+1];        // 元素交换
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
