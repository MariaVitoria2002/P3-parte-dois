package application2;


public class Questao1 {
    public static void main(String[]args){
      
        
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // matriz original
        int iTransposta = matrix.length; // linhas da matriz transposta
        int jTransposta = matrix[0].length; // colunas da matriz transposta
        int matrixTransposta[][] = new int[iTransposta][jTransposta]; // matriz transposta

        System.out.println("Matriz: "); // imprimir matriz
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
                System.out.println(" ");

        }

        for(int i = 0; i < matrix.length; i++){ ; // preenchendo matriz transposta
            for(int j = 0; j < matrix[0].length; j++){
              matrixTransposta[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("Matriz transposta:"); // imprimir matriz transposta

            for(int i = 0; i < matrixTransposta.length; i++){
                for(int j = 0; j < matrixTransposta[0].length; j++){
                     System.out.print(matrixTransposta[i][j] + " ");
                }
                System.out.println(" ");
            }
        
    }
}
//ok