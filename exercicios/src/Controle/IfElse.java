package Controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args ) {
		
	 String valor = JOptionPane.showDialog("Informe o numero");
	  // Converter a string para o numero inteiro
	 
	  int numero = Integer.parseInt(valor);
	  
	  if(numero % 2 == 0)
	  {
		System.out.println("Numero par!");
	  }
	  else {
		  System.out.println("Numero ímpar!");
	  }
	  
	}
}
