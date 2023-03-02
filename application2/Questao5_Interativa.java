package application2;
import java.util.Scanner;

public class Questao5_Interativa {
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt(); // lê o número 
        int fatorial = 1;

        for(int i = 1; i <= numero; i++){ // verifica seu fatorial
            fatorial *= i;
        }

        System.out.printf("O fatorial é: %d", fatorial);
        
        
    }
}
