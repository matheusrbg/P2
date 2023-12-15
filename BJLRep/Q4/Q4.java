package BJLRep.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira valor de A");
        Integer a = Integer.parseInt(scan.nextLine());
        
        System.out.println("Insira valor de B");
        Integer b = Integer.parseInt(scan.nextLine());

        for(int i=a;i<=b;i++){  
            if(i%2==1) System.out.println("É ímpar " + i);
        }

        scan.close();
    }
}
