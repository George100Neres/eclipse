/*Faça um programa que peça 2 numeros inteiros e um numero real.Calcule e mostre:
 * a)O produto do dobro do primeiro com metade do segundo.
 * b)a soma do triplo do primeiro com o terceiro.
 * c)O terceiro elevado ao cubo.
 */
package Atividades;

import java.util.Scanner;

public class Calculo_Int_E_Float {
  
	public static void main(String[] args) {
	
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Entre com primeiro nuemro inteiro");
   int num1 = entrada.nextInt();
   
   System.out.println("Entre com segundo nuemro inteiro");
   int num2 = entrada.nextInt();
   
   System.out.println("Entre com terceiro nuemro inteiro");
   int num3 = entrada.nextDouble();
   
   int resultado1 = (num1 * 2) * (num2 / 2);
   double resultado = (num1 *3) + num3;
   double resultado = Math.pow (num3, 3);
	}
}
