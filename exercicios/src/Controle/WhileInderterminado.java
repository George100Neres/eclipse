package Controle;

import java.util.Scanner;

public class WhileInderterminado {

  public static void main(String[] args) {
	
	 Scanner entrada = new Scanner (System.in);
	 
	 String valor = ""; // String vazia.
	 
	 while(!valor.equalsIgnoreCase("sair")) { // Vai ser executado quando o valor for diferente de sair.
		 
		 System.out.print("Voce diz:");
		 valor = entrada.nextLine();
	 }
  }
}
