package application2;
import java.util.Scanner;

public class Questao5_Recursiva {
    
    public static int fatorial(int numero){

        if(numero == 0){
            return 1; // fatorial de 0 é 1
        } else{
            return numero * fatorial(numero - 1); // fatorial caso numero != 0
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        System.out.printf("O fatorial é: %d", fatorial(numero));

    }
}
