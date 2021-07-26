/* Fazer um programa que armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas,
 * onde para cada 24 horas podemos associar uma tarefa especifica(compromisso agendado).O programa deve ter um menu onde o usuario deve
 * ter um menu onde o usuario indica o dia do mês que deseja alterar a hora,entrada em seguida com o compromisso, ou então,o usuario
 * pode também consultar a agenda, fornecendo o dia e a hora para obter o  compromissao armazenado. 
 */

package Arrays;

import java.util.Scanner;

public class Agend_Pessoal {

public static void main(String[] args) {
	 
	Scanner entrada = new Scanner(System.in);
	
	String [] [] compromissos = new String[31] [24];
	
	boolean sair = false;
	int opcao;
	while(!sair) {
		
	System.out.println("Digite 1 para compromissos");
	System.out.println("Digite 2 para verificar compromissos");
	System.out.println("Digite 0 para sair:");
	
	opcao = entrada.nextInt();
	
	if(opcao == 1) { // adicionaro compromissos
	
	boolean diaValido = false;
	int hora;
	while(!diaValido) {
	 System.out.println("Entre com a hora do compromisso:");
	 hora = entrada.nextInt();
	 int dia = entrada.nextInt();
	 if (dia > 0 && dia <= 24) {
		 diaValido = true;
	 } 
	 else {
		 // Matriz dia e hora Dia 31 e a Hora 24
	System.out.println("Hora invalida,Digite novamente:");
		compromissos[dia] [hora] = entrada.next();
	 }
	     }
	  }
	
	--dia; // se o usuario digitar o dia 20,tera que tirar -1 valor por causa da posicao do vetor que sera 19
	else if (opcao == 2) { // verificar compromisso
		
	  }
	else if (opcao == 0) { // sair do loop
	  sair = true;	
	 }
	else {
	System.out.println("Opcao invalida,Digite novamente.");
	  }
	}
  }
}
