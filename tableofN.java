import java.util.*;
public class tableofN {
    public static void main(String[] args) {

        // Repetation is 170 times so high time complexity
//        for(int i =19;i<=190;i++){
//            if(i%19 == 0){
//                System.out.println("The table of 19 is :"+i);
//            }
//        }
        // Reduce the time complexity
         // Comparision only 10 Rounds
//        for(int i = 12; i<=120;i+=12){
//            if(i%12 == 0){
//                System.out.println("Table of 12 is :"+i);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table which you want :");
        int n = sc.nextInt();
        for(int i = n;i<=10*n;i=i+n){
            if(i%n == 0){
                System.out.println("The table of" + n + " is: "+i);
            }
        }

    }
}
