package BJLSeq.Q5;

import java.util.Scanner;
import java.lang.Math;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        Double n1 = Double.parseDouble(scan.nextLine());
        System.out.println("Insira o segundo numero: ");
        Double n2 = Double.parseDouble(scan.nextLine());

        if(n1>0 && n2>0){
            Double r = Math.pow(n1, n2);
            System.out.println("Resultado: " + r);
        }


        scan.close();
    }
}
