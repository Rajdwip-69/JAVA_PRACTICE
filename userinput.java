import java.util.Scanner;

class userinput{
    public static void main(String[] args) {
        System.out.print("Enter the Number of Element :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr [] = new int[n];
            System.out.println("Enter the Element :");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Display the Elements :");
            for(int i = 0;i<n;i++){
                System.out.println(arr[i]);
            }
        }
    }

}