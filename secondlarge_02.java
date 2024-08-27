package Arrays;

public class secondlarge_02 {
    public static void main(String[] args) {
        int arr [] = {100,20,30,40,60};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = Math.max(arr[i],max);
            }
        }
        System.out.println("Max is :"+max);
        int smx = Integer.MIN_VALUE;
        for(int i =0; i<n;i++){
            if(arr[i] != max){
                smx = Math.max(arr[i],smx);
            }
        }
        System.out.println("Second largest Elemet is :"+smx);
    }
}
