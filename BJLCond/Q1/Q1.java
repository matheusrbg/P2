package BJLCond.Q1;

import java.util.Scanner;

public class Q1 {

     public static void main(String[] args) throws Exception
    {
 
        Scanner scan = new Scanner(System.in);  
        
        System.out.println("Insira o primeiro numero: ");
        Integer n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Insira o segundo numero: ");
        Integer n2 = Integer.parseInt(scan.nextLine());

        if (n1>n2) System.out.println("O maior é: " + n1.toString());
        else if (n1<n2) System.out.println("O maior é: " + n2.toString());
        else System.out.println("Os números são iguais");
        
        scan.close();
    }
}
