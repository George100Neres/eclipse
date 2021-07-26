/* Programa que verifica se o sexo do usuario e Masculino ou Feminino. */
package IF_Else_Switch;

import java.util.Scanner;

public class F_FEM_M_MAS {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Entre com uma letra (F ou M):");
	String sexo = entrada.next();
	
	if(sexo.equalsIgnoreCase("f")) {
		System.out.println("F - feminino:");
	  }
	else if(sexo.equalsIgnoreCase("m")) {
		System.out.println("M - Masculino:");
	  }
	else {
		System.out.println("Sexo inválido:");
	  }
	}
}
