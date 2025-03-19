/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]  = {3,6,1,7,9};
	    bubblesort(arr);
	  System.out.println(Arrays.toString(arr));
		
	}
	
	static void bubblesort(int [] arr){
	    for(int i=0;i<arr.length;i++){
	        for(int j=1;j<arr.length-1;j++){
	            if(arr[j]<arr[j-1]){
	                int temp = arr[j];
	                arr[j] = arr[j-1];
	                arr[j-1] = temp;
	            }
	        }
	    }
	}
}
