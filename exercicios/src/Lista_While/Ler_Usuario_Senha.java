/* Faça um programa que leia um nome do usuario e a sua senha e não aceite a senha
 * igual ao nome do usuario,mostrando uma mensagem de erro e voltando para pedir
 * as informaações
 */

package Lista_While;

import java.util.Scanner;

public class Ler_Usuario_Senha {
 
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	boolean infovalidas = false;
	do {
		
		System.out.println("Entre com o nome do usuario:");
		String nomeUser = entrada.next();
		
		System.out.println("Entre com a senha:");
		String senha = entrada.next();
		
		if (nomeUser.equalsIgnoreCase(senha)) { // se o nome do usario for igual senha
			infovalidas =  false; // se for valida e falso
			System.out.println("Senha igual ususario,digite novamente:");
		} else {
			infovalidas = true;
			System.out.println("Senha e usario valido:");
		}
	  }while(!infovalidas);
	
	}
}
