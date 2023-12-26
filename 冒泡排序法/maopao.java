package suanfa;

import java.util.Arrays;

public class maopao {

    /**
     * （1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换位置。
     * （2）这样对数组的第 0 个数据到 N-1 个数据进行一次遍历后，最大的一个数据就“沉”到数组第
     * N-1 个位置。
     * （3）N=N-1，如果 N 不为 0 就重复前面二步，否则排序完成。
     * @param a
     * @param n
     */
    public static void bubbleSort1(int [] a, int n){
        int i, j;
        for(i=0; i<n; i++){//表示 n 次排序过程。
            for(j=1; j<n-i; j++){
                if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
                    //交换 a[j-1]和 a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] Arr={1,23,8,54,3,5,65,88,97,45,82,0,7,6,54,99};
        int a=Arr.length-1;
        bubbleSort1(Arr,a);
        System.out.println(Arrays.toString(Arr));
    }

}
