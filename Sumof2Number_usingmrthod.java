/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class algebra{
    int sum(int a, int b){
        int ans = a+b;
        return ans;
    }
}

public class Main{
    public static void main(String[] args){
        algebra a1 = new algebra();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number :");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number :");
        int b = sc.nextInt();
        int ans = a1.sum(a,b);
        System.out.println("Sum of 2 Number is :"+ans);
        
    
        
    }
}
