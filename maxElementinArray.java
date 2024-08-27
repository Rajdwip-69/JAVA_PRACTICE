package Arrays;

import java.util.Scanner;

public class maxElementinArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enrer the array size:");
//        int n = sc.nextInt();
//        System.out.println("Enter the Elements:");
//        int arr [] = new int[n];
//        for(int i=0;i<=n-1;i++){
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for(int i=0;i<=n-1;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println("Large :"+max);


        // Static Method

        int [] arr = {10,20,4,6,30};
//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 1; i<n;i++) {
            if(arr[i]>max){
//                max = arr[i];
                max = Math.max(arr[i],max);
            }

        }
        System.out.println("Max is :" +max);
    }
}
