package Arrays;

public class secondLargest {
    public static void main(String[] args) {

        int [] arr = {10,20,4,6,30,60};
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 1; i<n;i++) {
            if(arr[i]>max){
//                max = arr[i];
                max = Math.max(arr[i],max);
            }
        }

        int smx = Integer.MIN_VALUE;
        for (int i = 1; i<n; i++) {
            if(arr[i] != max){
                smx = Math.max(arr[i],smx);
            }
        }
        System.out.println("Max is :"+max);
        System.out.println("Second Max is :"+smx);

    }
}
