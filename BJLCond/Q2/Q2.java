package BJLCond.Q2;

import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) throws Exception
    {
 
        Scanner scan = new Scanner(System.in);  
        
        System.out.println("Insira o primeiro numero: ");
        Integer n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Insira o segundo numero: ");
        Integer n2 = Integer.parseInt(scan.nextLine());

        System.out.println("Insira o terceiro numero: ");
        Integer n3 = Integer.parseInt(scan.nextLine());

        if (n1>n2 && n1>n3) System.out.println("Condição satisfeita");
        else System.out.println("Erro");
        
        scan.close();
    }
}
