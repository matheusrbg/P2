package BJLSeq.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quatro números, em sequencia");
        Integer n1 = Integer.parseInt(scan.nextLine());
        Integer n2 = Integer.parseInt(scan.nextLine());
        Integer n3 = Integer.parseInt(scan.nextLine());
        Integer n4 = Integer.parseInt(scan.nextLine());

        Integer r = n1+n2+n3+n4;

        System.out.println("O resultado da soma é: " + r);

        scan.close();
    }
}
