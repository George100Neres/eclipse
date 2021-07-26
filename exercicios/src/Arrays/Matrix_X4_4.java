/* Gere e imprima uma matriz M 4 x 4 com valores aleatorios entre 0-9.Após isso determine
 * o maior numero da matriz e a sua posicao (linh,coluna.
 * */
 

package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Matrix_X4_4 {
 
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int [] [] numerosAleatorios = new int [4] [4];
	// Gerando numeros aleatorios
	
	Random numeroRandom = new Random();
	 
	 // Leitura dos Dados
	for (int i=0; i < numerosAleatorios.length; i++) {
		for(int j=0; j < numerosAleatorios.length; j++) {

			// Gerar numeros de 0 a 100.
			numerosAleatorios [i] [j] = numeroRandom.nextInt(100);
		 }
	  }
	
	int maior =0;
	
	 
	}
}
