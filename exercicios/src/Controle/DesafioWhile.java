package Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
	  Scanner entrada = new Scanner (System.in);
	  
	  int quantidadeDeNotas = 0;
	  double nota =0;
	  double total =0;
	  
	  while(nota != -1) {
	  System.out.print("Informe a nota:");
		  nota = entrada.nextDouble();
		  
		  if(nota <= 10 && nota >=0) {
		  total += nota; // Nota total
		  quantidadeDeNotas++; // Quantidade de notas Digitadas
		  } 
	  }
	  
	  // Calcular a média
	  
	  double media = total / quantidadeDeNotas;
	  System.out.println("Media"+media);
	}
}
