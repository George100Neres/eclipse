/* Faça um programa que elia e valide as seguintes informaçoes:
 * a)Nome:maior que 3 caracteres
 * b)Idade:entre 0 e 150;
 * c)Salário:maior que zero
 * d)Sexo: 'f' ou 'm';
 * e)Estado Civil: 's','c','v','d';
 */
package Lista_While;

import java.util.Scanner;

public class Valida_Informacoes {
  
	public static void main(String[] args) {
		
    Scanner entrada = new Scanner();
    
    boolean infoValida = false;
    
   do{
	   
	 System.out.println("Entre com a idade:");
	 
	 nome = entrada.nextInt();
	 
	 if(idade >= 0 && idade <= 150) {
		 infoValida = true;
	 }
	 else {
		System.out.println("Idade precisa ser entre 0 e 150."); 
	  }
	 
	 
   }while(!infoValida);
   
   infoValida = false;
   
   
	}
}
