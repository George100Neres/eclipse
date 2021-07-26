/* Faça um programa que crie uma matriz 3x3x3x onde cada elemento da matriz seja
 * igual a soma dos seus indices (exemplo:M[1,2,1]=1+2+1=4).
 * *Obter a soma de todos elementos da matriz,e obtenha soma dos elementos cujos
 * valores sao pares e a soma dos elementos cujos valores sao pares e a soma 
 * dos cujos elementos valores imapres 
 * *Exibir na tela os valores da soma total, soma dos pares e a soma dos impares.
 */

package Arrays;

import java.util.Scanner;

public class Mtriz_Mult3x3x3x_igual_indice {
  
	public static void main(String[] args) {
		
    Scanner entrada = new Scanner(System.in);
      
    int [][][] matrizTridimensional = new int [3] [3] [3]; 
    		
    // Leitura dos Valores
    for(int i=0; i <matrizTridimensional.length; i++) {
    	for(int j=0; j < matrizTridimensional.length; j++) {
    		for(int k=0; k < matrizTridimensional[i][j].length; k++) {
    			// enquanto k for menor que linha i e menor que coluna j
    		  matrizTridimensional[i] [j] [k] = i +j +k;
    		  //EX: 0 + 0 +0 =0 0 + 0+ 1=1
    		}
    	}
      }
     // Soma total
    int soma =0;
    int somaPares =0;
    int somaImpares =0;
    
    for(int i=0; i <matrizTridimensional.length; i++) {
    	for(int j=0; j < matrizTridimensional.length; j++) {
    		for(int k=0; k < matrizTridimensional[i][j].length; k++) {
    		  matrizTridimensional[i] [j] [k] = i +j +k;
    		
    		  soma+= matrizTridimensional[i] [j] [k];
    		  // Verificação se o numero e par
    	 if (matrizTridimensional [i] [j] [k] % 2 == 0) {
    		 somaPares += matrizTridimensional [i] [j] [k];
    	 }
    	 else {
    		 somaImpares += matrizTridimensional [i] [j] [k];
    	 }
    		}
    	}
      }
    
    System.out.println("Soma total ="+soma);
    System.out.println("Soma pares ="+somaPares);
    System.out.println("Soma IMpares ="+somaImpares);
	}
}
