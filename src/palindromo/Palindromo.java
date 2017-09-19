package palindromo;

import java.util.*;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pilhas pilhaAux0 = new Pilhas();
        Pilhas pilhaAux1 = new Pilhas();
        Pilhas pillhaAux2 = new Pilhas();
        String continuar = "s";
        Pilhas metodos = new Pilhas();
        int j = 2;

        System.out.println("Informe uma primeira letra da palavra");
        while (continuar.equals("s")) {
            String i = scan.next(".");
            pilhaAux0.empilhar(i);
            pilhaAux1.empilhar(i);
            System.out.println("Deseja continuar?");
            continuar = scan.next();

            if (continuar.equals("s")) {
                System.out.println("Informe a :" + j + " letra da palavra");
                j++;
            }

        }
        //Imprimindo e ao mesmo tempo comparando o retorno booleano da função
        
        System.out.println(pillhaAux2.Palindromo(pilhaAux0, pilhaAux1, pillhaAux2) ? "Sim é palindromo" : "Não é palindromo");
        System.out.println("PilhaAux2");
        pillhaAux2.imprimepilha();
        System.out.println("PilhaAux0");
        pilhaAux0.imprimepilha();
        System.out.println("PilhaAux1");
        pilhaAux1.imprimepilha();
        

    }

}
