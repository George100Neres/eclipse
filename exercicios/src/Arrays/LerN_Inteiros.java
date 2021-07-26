/* Programa que ler um numero inteiro N(máximo = 10),depois ler N numeros quaisquer
 * e armazená-los em um vetor.Em seguinda, mostrar na tela todos elementos do vetor. */
 */
package Arrays;

import java.util.Scanner;

public class LerN_Inteiros {
 
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quantos numeros voce vai digitar?");
     N = sc.nextInt();
	
     double[] vet = new double[N];
    
    for (int i=0; i < N; i++) {
    	System.out.println("Digite um numero: ");
    	vet[i] = sc.nextDouble();
      }
     System.out.println();
     System.out.println("Numeros Digitados:");
     for(int i=0; i < N; i++) {
    	 System.out.println(String.format("%.1f",vet[i]));
     }
    
    sc.close();
	}
}
