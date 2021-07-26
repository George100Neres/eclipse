package Atividades;

import java.util.Scanner;

public class LeituraTeclado {
 
  public static void main(String[] args) {
		
	/* Scanner entrada = new Scanner (System.in);
	 String nomeCompleto = entrada.nextLine();
	 System.out.println("Seu nome completo e:" + nomeCompleto);
	 
	 System.out.println("Digite seu primeiro nome:");
	 String primeironome = entrada.next();
	 System.out.println("Seu primeiro nome é:"+ primeiroNOme);
	 
	 System.out.println("Digite a sua Idade:");
	 int idade = entrada.nextInt();
	 System.out.println("Sua idade é:"+ idade);
	 
	 System.out.println("Digite a sua altura: ");
	 double altura = entrada.nextDouble();
	 System.out.println("Sua altura é:"+ altura);
	 */
  System.out.println("Digite o sue primeiro nome,idade,quantidade de filhos,altura e se  tem Bicho de estimacao:");
  
  String primeiroNome = entrada.nextLine();
  int idade = entrada.next();
  byte  qtdFilhos = entrada.next();
  float  altura = entrada.nextFloat();
  boolean temPet = entrada.nextBoolean();
  
  System.out.println("Você digitou os seguintes valores:");
  System.out.println ("Primeiro nome"+primeiroNome);
  System.out.println ("Idadee"+idade);
  System.out.println ("Qtd de Filhos"+qtdFilhos);
  System.out.println ("Altura"+altura);
  System.out.println ("Tem bicho de estimacao?"+temPet);
	}
  
}
