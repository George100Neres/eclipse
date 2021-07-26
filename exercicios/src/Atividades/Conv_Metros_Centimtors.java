package Atividades;

import java.util.Scanner;

public class Conv_Metros_Centimtors {
  
   public static void main(String[] args) {
	
	try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("Entre com a quantidade de metros:");
		double metros = entrada.nextDouble();
		
		//  Conversao metros pra cent 1m = 100 cm
		
		double cm = metros * 100;
		
		System.out.println(metros+"mtrs e igual a "+cm +"cm");
	}
   }
}
