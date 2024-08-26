public class oddNumberusingContinue {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if(i%2 == 0){
                continue; // Skip the Even Number and Show the odd Numbers only
            }
            System.out.print(i+" ");
        }
    }
}
