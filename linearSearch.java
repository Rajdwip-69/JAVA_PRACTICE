package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Targert Element Input form user
        System.out.print("Enter Target:");
        int x = sc.nextInt();
        // Number of elemnts in the array
        System.out.print("No of Elements :");
        int n = sc.nextInt();

       //Input the elements form user
        System.out.println("Enter the array elements :");
        int arr [] = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        // Solution Section for linear Search Algorithm
        boolean flag = false; // for not found the element in the array
        for(int i=0;i<=n-1;i++){
            if(arr[i] == x){
                 flag = true; // for found the elemnt in the array
                break;
            }

        }
        // Output section for Display
        if(flag == true) System.out.println("Element Found");
        else System.out.println("Not Found");

   }
}

