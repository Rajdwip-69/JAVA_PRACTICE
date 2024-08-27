package Arrays;
import java.util.Arrays;
public class copyofArray {
    public static void main(String[] args) {
        int arr [] = {10,30,50,60};
        for(int ele : arr){
            System.out.println(ele+" ");
        }

//        int nums [] = arr;
//         nums[0] = 70; // Shallow Copy
        System.out.println(arr[0]);
//        for(int ele : nums){
//            System.out.print(ele+" ");
//        }
        // Deep copy
        int brr [] = Arrays.copyOf(arr, arr.length);
//        for(int ele : brr){
//            System.out.println(ele+" ");
//        }
        brr[0]=90;
        System.out.println(arr[0]);


    }
}
