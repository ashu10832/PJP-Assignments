import java.util.Scanner;


// Only uppercase conversion
public class PrimesAlgo{


    public static void main(String []args){
        
        Scanner input = new Scanner( System.in );
        System.out.print("Enter String to be encrypted: ");
        String inputString =input.nextLine();
        
        int PRIMES[] = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        
        String output = "";
        
        for(int i = 0;i<inputString.length();i++){
            int primeNum = PRIMES[inputString.charAt(i) - 'A'];
            String hexForm = Integer.toHexString(primeNum);
            output = output.concat(hexForm);
        }
        System.out.print("Encrypted String is: " + output + "\n");

    }
        
}