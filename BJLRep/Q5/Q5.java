package BJLRep.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número");
        Integer n = Integer.parseInt(scan.nextLine());

        int i=2;
        Boolean isPrime = true;

        while(i<=Math.sqrt(n)){
            if(n%i==0) isPrime = false;
            i++;
        }

        if(isPrime) System.out.println(n + " é primo.");
        else System.out.println(n + " não é primo.");

        scan.close();
    }
}
