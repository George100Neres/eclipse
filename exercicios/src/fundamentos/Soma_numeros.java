package fundamentos;

import java.util.Scanner;

public class Soma_numeros {

 public static void main(String[] args)
 {
	 // cria um Scanner parar obter entrada a partir da janela de comando
  Scanner input = new Scanner(System.in);
  
  int number1; // primeiro numero a somar 
  int number2; //segundo numero a somar
  int sum;   //soma de number1 e number2
  
  System.out.print("Enter fist integer :"); //prompt
  number1 = input.nextInt(); //lê o primeiro número fornecido pelo usuário
  
  System.out.print("Enter second integer :"); //prompt
  number2 = input.nextInt(); //lê o segundo número fornecido pelo usuário
  
  sum = number1 + number2; //soma os números,depois armazena o total em sum
  
  System.out.printf("Sum is %d%n", sum); //exibe a soma
  
 } // fim do método main
} //fim da classe Addition
