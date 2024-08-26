import java.util.*;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
//        for(int  i =1; i<= 2*n-1;i+=2){
//            System.out.println(i);
//        }
//
//        for(int i = 4; i<= 3*n+3;i+=3){
//            System.out.println(i);
//        }

        //without using Formula 2,5,8,11
//        int a = 2;
//        for(int i = 1;i<=n;i++){
//            System.out.println(a);
//            a+=3;
//        }

        //Negative Series like 5,3,1
        int a = 5 ,d=-4;
        for(int i =1;i<=n;i++){
            System.out.println(a);
            a+=d;
        }
    }
}
