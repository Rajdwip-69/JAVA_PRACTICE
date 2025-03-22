public class deepcpoy {
    public static void main(String[] args) {
         int arr [] = new int[3];
         arr[0] = 1;
         arr[1] = 2;
         arr[2] = 3;
         for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
         }

         System.out.println("Deep Copy Example Change only Array2 not reflect Array1");

         int arr2[] = arr.clone();
          arr2[0] = 0;
          arr2[1] = 0;
         for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            
         }
    }
}
