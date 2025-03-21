/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class basic{
    void onedimentionalarray(){
        int [] arr = {1,2,3,4,5};
        for(int i =0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main (String [] args){
        basic b1 = new basic();
        b1.onedimentionalarray();
        
    }
}
