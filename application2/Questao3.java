package application2;

import java.util.Scanner;

public class Questao3 {
    
    public static boolean numeroPrimo(int numero){

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0){
                return false;
            }  
        }
        return true;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if(numeroPrimo(numero)){
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }
    }
}
//ok