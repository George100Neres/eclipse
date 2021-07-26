package fundamentos;

import java.util.Scanner;

public class Console {

	
 public static void main(String[] args) {
   Scanner entrada = new Scanner (System.in);
   
   System.out.print("Digite o seu nome: ");
   String nome = entrada.nextLine();
   
   System.out.print("Digite o seu Sobrenome: ");
   String Sobrenome = entrada.nextLine();
   
   System.out.print("Digite a idade: ");
   int idade = entrada.nextInt();
   
  System.out.printf("%s  %s  tem  %d anos.",nome,idade,Sobrenome);
    }
}
