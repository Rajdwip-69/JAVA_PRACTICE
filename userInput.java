
package Arrays;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.print("Enter the Array Items :");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i =0; i<=4; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entred Items :");
        for(int i  = 0; i<=4 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
