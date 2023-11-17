package BJLSeq.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe três números, em sequencia");
        Float n1 = Float.parseFloat(scan.nextLine());
        Float n2 = Float.parseFloat(scan.nextLine());
        Float n3 = Float.parseFloat(scan.nextLine());

        Float r = (n1+n2+n3)/3;

        System.out.println("A soma aritmética é: " + r);

        scan.close();
    }
}
