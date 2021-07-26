package Controle;

import java.util.Scanner;

public class Vetor {

  public static void main(String[] args) {
	
	 Scanner entrada = new Scanner (System.in);
		 
	 int N;
	 System.out.print("Quantos numeros voce vai digiar:?");
	 N = entrada.nextInt();
	 
	double[] vet = new double[N];
	
	for(int i=0; i < N; i++) {
		System.out.print("Digite um nuemro:");
		vet[i] = entrada.nextDouble();
	   }
     printf("Nuemros Digitados:");
     for(int i=0; i < N; i++) {
    	 
     System.out.println(String.format(".1f",vet[i]));
     }
	 
  }
}
