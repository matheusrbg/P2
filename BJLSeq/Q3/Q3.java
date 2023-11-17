package BJLSeq.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o salário: ");
        Float salario = Float.parseFloat(scan.nextLine());

        System.out.println("Novo salário: " + salario*1.25);

        scan.close();
    }
}
