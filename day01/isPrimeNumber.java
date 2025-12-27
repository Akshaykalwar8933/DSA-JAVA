import java.util.*;

public  class isPrimeNumber{

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Lower Number");
        int lower = scn.nextInt();
        System.out.println("Enter Higher Number");
        int Higher = scn.nextInt();


        for(int i = lower; i<= Higher;i++){
            if(i<=1){
                continue;
            }

            boolean isPrimeNumber = true;

            for(int j = 2; j * j <= i; j++){
                if(i%j == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber){
                System.err.println(i);
            }
            
        }
        

    }
}
