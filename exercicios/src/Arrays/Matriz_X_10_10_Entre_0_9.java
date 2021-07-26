/* Gere e imprima uma matriz M 10 x 10 valares aleatorios entre 0-9.Após isso 
 * indique qual é o maior número da matriz e a sua posição (linha,coluna).
 */
package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Matriz_X_10_10_Entre_0_9 {
  
	public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  
	 int [] [] numerosAleatorios = new int[10] [10];
	 
	Random numeroRandom = new Random();
	 // Leitura matriz
	for(int i=0; i < numerosAleatorios.length; i++) {
		for(int j=0; j<numerosAleatorios[i].length; j++) {
			numerosAleatorios [i] [j] = numeroRandom.nextInt(100);
		}
	  }
	 int maior = 0;
	 int col =0;
	 int linha =0;
	 
	 //  
	 for(int i=0; i < numerosAleatorios.length; i++) {
		 for(int j=0; j<numerosAleatorios[i].length; j++) {
	        if(numerosAleatorios[i] [j] > maior) {
	          	maior = numerosAleatorios[i] [j];
	          }
			}
		  }
	 System.out.println("Maior entre = "+maior);
	 System.out.println("Linha = "+linha);
	 System.out.println("Colunae = "+col);
	 
	 
	}
}
