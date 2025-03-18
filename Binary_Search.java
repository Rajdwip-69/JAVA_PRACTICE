/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int arr [] ={2,3,5,7,9,10,89,109};
	    int target = 7;
	    int ans = binarysearch(arr,target);
	    System.out.println("The index no is :"+ans);
 		
	}
	
	static int binarysearch(int [] arr , int target){
	    int start = 0;
	    int end = arr.length - 1;
	    while(start<=end){
	        int mid = start + (end-start)/2;
	        if(target<arr[mid]){
	            end = mid -1;
	        }
	        else if(target>arr[mid]){
	            start = mid+1;
	        }
	        
	        else{
	            return mid;
	        }
	    }
	    return -1;
	}
}
