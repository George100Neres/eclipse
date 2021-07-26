package IF_Else_Switch;

import java.util.Scanner;

public class Verificavao_Tres_Numeros {
 
	public static void main(String[] args) {
		
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Entre com primeiro numero:");
    int num1 = entrada.nextInt();
    
    System.out.println("Entre com segundo numero:");
    int num2 = entrada.nextInt();
    
    System.out.println("Entre com terceiro numero:");
    int num3 = entrada.nextInt();
    
    if(num1 >= num2 && num1 >= num3) {
    	System.out.println("num1 e maior: "+ num1);
      }
    else if(num2 >= num1 && num2 >= num3) {
    	System.out.println("num2 e maior: "+ num2);
      }
    if(num3 >= num1 && num3 >= num2) {
    	System.out.println("num3 e maior: "+ num3);
      }
	}
}
