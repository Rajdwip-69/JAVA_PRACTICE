package Arrays;

import java.util.ArrayList;

public class arraylist_01 {
    public static void main(String[] args) {
        // Declearation of Array List
        ArrayList<Integer> arr = new ArrayList<>(6);
        // Initilizing the array List
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        // Display using Index
//        System.out.println(arr.get(0));
       // Display using for  Loop
//        for (int i = 0; i <=5 ; i++) {
////            System.out.println(arr.get(i));
//
//        }
//        System.out.println(arr);
        // Upadate the array
//        arr.set(2,56);
//        System.out.println(arr);
        // Add the new element at the end of the array
         arr.add(70); // This process is called PUSH BACK
//        System.out.println(arr);
 // Size of the ArrayList
//        System.out.println(arr.size());

        //remove Item form array list is

        System.out.println(arr);
        arr.remove(3); // help the nameofarraylist.remove(Index_Value)
        System.out.println(arr);


    }
}
