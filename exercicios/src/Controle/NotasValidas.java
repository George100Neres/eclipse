package Controle;

import java.util.Scanner;

public class NotasValidas {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite a nota:");
	
	double nota = entrada.nextDouble();
	
	if(nota > 10 || nota < 0) {
		System.out.println("Nota invalida");
	  } else if(nota >= 8.1) {
		  System.out.println("Concetiro A!");
	  }
	  else if(nota >= 6.5) {
		  System.out.println("Concetiro B!");
	  }
	  else if(nota >= 4.5) {
		  System.out.println("Concetiro C!");
	  }
	
	  else {
		  System.out.println("Conceito D");
	  }
	  
	  System.out.println("Fim ");
	  entrada.close();
	}

}
