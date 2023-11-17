package BJLCond.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        
        System.out.println("Insira um numero: ");
        Integer n = Integer.parseInt(scan.nextLine());

        if ( n%2 == 0 ) System.out.println(n + " é par");
        else System.out.println(n + " é ímpar");
        
        scan.close();
    }
}
