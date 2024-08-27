package Arrays;
import java.util.Arrays;
public class buildInMrthodsInArray {
    public static void main(String[] args)
    {
        int arr[] = {10, 1, 45, 2, 67, 6};
//        for(int i =0;i<arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }
        // For-Each loop in array
//        for(int ele : arr){
//            System.out.println(ele+" ");
//        }
        //shorting in array using Arrays.sort() Method
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]+" ");
       }


        }
    }
