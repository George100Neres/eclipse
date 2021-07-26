package Atividades;

public class Ordem_Decrescente {

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
	    
	    if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
	    	//num1 e menor
	    	// num2  e maior
	    	// num1 < num3 < num2
	    	System.out.println(num3 + "-" + num2 + "-" +num1);
	    }
	    
	      
	    else if(num2 <= num1 && num2 <= num3 && num2 <= num1) {
	    	// num1 e menor
	    	//num2 e maior
	    	System.out.println(num2 + "-" + num3 + "-" +num1);
	    }
	    
	    	
	    if(num3 <= num1 && num3 <= num2 && num1<= num2) {
	    
	    	System.out.println(num1 + "-" + num2 + "-" +num3);
	      }
		}
	}

