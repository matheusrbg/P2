package BJLSeq.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a base: ");
        Float base = Float.parseFloat(scan.nextLine());
        System.out.println("Insira a altura: ");
        Float altura = Float.parseFloat(scan.nextLine());

        Float r = (altura*base)/2;

        System.out.println("A área do triangulo é: " + r);

        scan.close();
    }
}
