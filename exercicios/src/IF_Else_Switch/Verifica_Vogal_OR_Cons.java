package IF_Else_Switch;

import java.util.Scanner;

public class Verifica_Vogal_OR_Cons {

	 public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Entre com uma letra:");
   String letra = entrada.next();
   
   switch(letra) {
   case "a":
   case "e":
   case "i":
   case "o":
   case "u":
   case "A":
   case "E":
   case "I":
   case "O":
   case "U":
	   System.out.println("vogal");
	   break;
	  default: 
		 System.out.println("consoante");
     }
	}
}
