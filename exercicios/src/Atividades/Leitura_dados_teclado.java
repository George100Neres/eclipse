package Atividades;

import java.util.Scanner;

public class Leitura_dados_teclado {

	public static void main(String args[]) {
		
	 Scanner scan = new Scanner(System.in);
	 
	 /*
	System.out.println("Digite seu Nome Completo:");
	String nomeCompleto = scan.nextLine();
	System.out.println("Seu nome COmpleto é: "+ nomeCompleto); */
	/* 
	System.out.println("Digite a sua idade:");
	int idade = scan.nextInt();
	System.out.println("Sua idade: e:"+ idade);
	
	System.out.println("Digite a sua altura:");
	double altura = scan.nextDouble();
	System.out.println("A sua altura e:"+ altura); */
	 
	 System.out.println("Digite o seu primeiro nome,idade,quantidade de filhos,altura,e se tem filhos.");
	String primeiroNome = scan.next();
	int idade = scan.nextInt();
	byte qtdFilhos = scan.nextByte();
	float altura = scan.nextFloat();
	boolean temPet = scan.nextBoolean();
	
	System.out.println("Voce Digitou os segiuntes valores:");
	System.out.println("Primeiro nomne:"+ primeiroNome);
	System.out.println("Idade: "+idade);
	System.out.println("Idade"+ idade);
	System.out.println("Quantidade de filhos: "+qtdFilhos);
	System.out.println("Altura"+ altura);
	System.out.println("Tem bichinho de estimação?"+ temPet);
	}
}
