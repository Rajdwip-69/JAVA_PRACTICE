package Arrays;

import java.util.Scanner;

public class varSizearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Items to be Entered :");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements :");
        int [] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Items is :");
        for(int i = 0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
