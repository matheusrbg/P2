package BJLRep.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Integer n;
        Integer count=0;

        do {
            System.out.println("Insira um número");
            n = Integer.parseInt(scan.nextLine());

            if(n>0) count++;

        } while (n!=0);

        System.out.println("Quantidade de positivos: " + count);

        scan.close();
    }
}
