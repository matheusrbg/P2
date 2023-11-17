package BJLCond.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        
        System.out.println("Insira o primeiro numero: ");
        Integer n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Insira o segundo numero: ");
        Integer n2 = Integer.parseInt(scan.nextLine());

        Integer r;
        
        if (n1>n2) {
            r = n1-n2;
            System.out.println("Subtração: "+r);
        }
        else if (n1<n2){
            r = n1+n2;
            System.out.println("Soma: "+r);
        }
        else {
            r = n1*n2;
            System.out.println("Multiplicação: "+r);
        }

        scan.close();
    }
}
