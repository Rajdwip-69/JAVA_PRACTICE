import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int x = 0 ; // 0 Means Prime
        for(int i = 2;i<=n-1;i++) {
            if (n % i == 0) {
                System.out.println("Composite Number:");
                x = 1; // Numer is Composite
                break;
            }
        }
        if (n == 1) {

            System.out.println("Nither Prime not Composite:");
        }
        if(x==0){
            System.out.println("Prime Number:");

        }
    }
}
