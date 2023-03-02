package application2;
import java.util.Scanner;

public class Questao2 {

    public static int maiorNumero(int vetor[]){

        if(vetor[0] > vetor[1]){
            return vetor[1];
        } else {
            return vetor[0];
        }
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int vetor[] = new int[2];
        vetor[0] = sc.nextInt();
        vetor[1] = sc.nextInt();
        System.out.printf("O menor número é: %d ", maiorNumero(vetor));

    }
}
//ok