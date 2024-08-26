public class evenno {
    public static void main(String[] args) {
        //===============Even Number 1 to 100===============
        for(int i = 0; i<= 100; i+=2){ // Insted of i++ use i=i+2 for less time complexity
            if(i%2 == 0){
                System.out.println("Even no is :"+i);
            }
        }
        System.out.println("==========End of Even Nubers==============");
        // =============ODD numbers in 1 to 100=================
        for(int i = 0; i<= 100; i++){
            if(i%2 != 0){
                System.out.println("ODD no is :"+i);
            }
        }
    }
}
