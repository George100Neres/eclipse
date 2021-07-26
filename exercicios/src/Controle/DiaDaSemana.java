package Controle;

import java.util.Scanner;

public class DiaDaSemana {

   public static void main(String[] args) {
	 
	   Scanner entrada = new Scanner (System.in);
		   
	   System.out.println("Digite o nome do dia:");
	   
	   String dia = entrada.next(); 
	   
	    // Comparação de String com a funcao "equalsIgnoreCase"
	   if("domingo".equalsIgnoreCase(dia)) { 
		   // Se for Domingo sera o dia 1 
		   System.out.println(1);
	   } else if ("segunda".equalsIgnoreCase(dia)) {
		   System.out.println(2);
	   }
	   else if ("terca".equalsIgnoreCase(dia)) {
		   System.out.println(3);
	   }
   }
}
