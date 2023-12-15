package BJLRep.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String serie="";
        
        System.out.println("Insira valor de A");
        Integer a = Integer.parseInt(scan.nextLine());
        
        System.out.println("Insira valor de B");
        Integer b = Integer.parseInt(scan.nextLine());

        for(int i=a+1;i<b;i++){
            serie+=i+" ";
        }

        System.out.println("Série numérica:\n" + serie);

        scan.close();
    }
}
