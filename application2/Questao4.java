package application2;

import java.util.Scanner;

public class Questao4 { // INCOMPLETA

    public static int numerosPrimos(int limiteInferior, int limiteSuperior){
        for(int i = limiteInferior; i < limiteSuperior; i++){
            for (int j = 2; j < limiteSuperior && j > limiteInferior; j++) {
                if (limiteSuperior % j == 0)
                    return j;          
            }
            
        }
        
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número equivalente ao limite superior: ");
        int limiteSuperior = sc.nextInt();
        System.out.println("Digite o número equivalente ao limite inferior: ");
        int limiteInferior = sc.nextInt();

    }
}
//INCOMPLETA