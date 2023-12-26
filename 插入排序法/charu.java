package suanfa;

import java.util.Arrays;

public class charu {
    /**
     *通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应的位置并插入。
     */
    public static void sort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            //插入的数
            int insertVal=arr[i];
//            被插入的位置(准备和前一个数比较)
            int index=i-1;
//            如果插入的数比被插入的数小
            while (index >= 0 && insertVal < arr[index]) {
//                将把arr[index]向后移动
                arr[index+1]=arr[index];
//                让index向前移动
                index--;
            }
            arr[index+1]=insertVal;
            System.out.println("第" + i + "轮的排序结果为：" + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5,3,2,6,4};
        System.out.println("排序前的结果为：" + Arrays.toString(numbers));
        sort(numbers);
        System.out.println("排序后的结果为：" + Arrays.toString(numbers));
    }
}
