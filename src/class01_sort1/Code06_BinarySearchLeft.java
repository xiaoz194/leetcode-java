package class01_sort1;

/**
 * @Classname Code06_BinarySearchLeft
 * @Description 二分搜索法应用
 * 在一个有序数组中，找>=某个数最左侧的位置 如 12233333344444444444444555 找>=3最左侧的位置
 * @Date 2021/9/7
 * @Created by sanyejiantai qq:2043439620 email:hayami_sora@163.com
 */
public class Code06_BinarySearchLeft {

    public static int binarySearch(int[] arr,int target){
        int l = 0;
        int r = arr.length-1;
        int index = -1;
        while(l<=r){
           int mid = (l+r)/2;
           if(arr[mid] >= target){
               index = mid;
               r = mid - 1;
           }else if(arr[mid] < target){
               l = mid +1;
           }
        }
        return index;
    }

    public static void main(String[] args) {
        int target = 4;
        int[] arr = {1,2,2,2,3,3,3,3,3,3,3,4,4,5,5,5};
        int res = binarySearch(arr, target);
        System.out.println(res);
    }

}
