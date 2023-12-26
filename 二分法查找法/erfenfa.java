package suanfa;

public class erfenfa {
    /**
     * 注意：     二分法是升序或者降序     不是乱序的，乱序查找不了
     *
     * @param array
     * @param a
     * @return
     */
    public static int biSearch(int []array,int a){
        int lo=0;
        int hi=array.length-1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;//中间位置
            if(array[mid]==a){
                return mid+1;
            }else if(array[mid]<a){ //向右查找
                lo=mid+1;
            }else{ //向左查找
                hi=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={0,2,3,4,5,6,7,8,9};
        int a=biSearch(arr,3);
        System.out.println("在数组中位置是第:"+a);
    }
}
