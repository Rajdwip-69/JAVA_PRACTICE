import java.util.Scanner;

public class countoccurence {

    public static void main(String[] args) {
        int arr [] = {1,4,7,4,8};
        int count = 0;
        System.out.print("Check the Frequency of :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(x == arr[i]){
                count++;
            }
        }
       System.out.println("The Frequency of " + x + "is : " +count);

        
    }
    
}
