package suanfa;

import java.util.Arrays;

public class kuaisu {
    public static void main(String[] args) {
        /**
         * 快速排序的原理：选择一个关键值作为基准值。比基准值小的都在左边序列（一般是无序的），
         * 比基准值大的都在右边（一般是无序的）。一般选择序列的第一个元素。
         * 分析： 1.选择基准元素（Pivot）：
         *       2.分区（Partition）：
         *             左侧区域：所有小于或等于基准元素的元素。
         *             右侧区域：所有大于基准元素的元素。
         *       3.递归排序：
         *       重复以上步骤：当子数组的大小减小到一定程度（例如，只有一个元素或者为空）时，递归结束。
         */
        int[] arr = {5, 2, 9, 1, 7, 6, 3};
        System.out.println("原始数组：");
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(arr));

    }


    public static void sort(int[] a, int low, int high){
        int start = low;//数组开始位置  下标为：0开始
        int end = high;//数组长度结束位置 的下标数
        int key = a[low];  //基质
        while(end>start){
            //从后往前比较
            while(end>start&&a[end]>=key)
        //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while(end>start&&a[start]<=key)
     //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的
//                值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1 到最后一个
    }
}
