import java.util.Scanner;

class userinput1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input for array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Storing input into the array
        }
        
        // Printing the array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        sc.close(); // Closing the scanner to prevent resource leak
    }
}
