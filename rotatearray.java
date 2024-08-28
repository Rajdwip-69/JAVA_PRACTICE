package Arrays;

import java.util.Scanner;

public class rotatearray {
    public static void reverse(int arr[] ,int i,int j){
    while(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Array Elements:");
        int n = sc.nextInt();
        System.out.println("Enter the Elemnts :");
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int z = arr.length;
        System.out.print("Enter the kth Elemets:");
        int k = sc.nextInt();
        k = k%z;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int ele : arr){
            System.out.print(ele+" ");

        }


    }
}
