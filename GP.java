import java.util.*;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
//        int a = 1;
//        for(int i = 1; i<=n;i++){
//            System.out.println(a);
//            a*=2;
//        }

        int a = 3 , m =4;
        for(int i = 1; i<=n;i++){
            System.out.println(a);
            a*=m;
        }
    }
}
