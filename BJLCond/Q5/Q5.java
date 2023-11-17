package BJLCond.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        
        System.out.println("Digite 1 para  somar");
        System.out.println("Digite 2 para  subtrair");
        System.out.println("Digite 3 para  multiplicar");
        System.out.println("Digite 4 para  dividir");
        Integer cond = Integer.parseInt(scan.nextLine());

        System.out.println("Insira o primeiro numero: ");
        Integer n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Insira o segundo numero: ");
        Integer n2 = Integer.parseInt(scan.nextLine());

        Float r;

        switch (cond) {
            case 1:
                r = (float) n1+n2;
                System.out.println("Soma: " + r.toString());
                break;
            case 2:
                r = (float) n1-n2;
                System.out.println("Subtração: " + r.toString());
                break;
            case 3:
                r = (float) n1*n2;
                System.out.println("Multiplicação: " + r.toString());
                break;
            case 4:
                if (n2==0) System.out.println("Divisão por 0");
                else {
                    r = (float) n1/n2;
                    System.out.println("Divisão: " + r.toString());
                }
                break;
        
            default:
                System.out.println("Valor inválido de condição escolhido");
                break;
        }

        scan.close();
    }
}
