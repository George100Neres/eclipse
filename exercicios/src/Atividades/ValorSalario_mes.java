/*  Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e
 * mostre o total do seu salário no referido mês.
 */
package Atividades;

import java.util.Scanner;

public class ValorSalario_mes {
 
	public static void main(String[] args) {
	
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Entre com o valor/hora:");
    double valorHora = entrada.nextDouble();
    
    System.out.println("Entre com a quantidade de horas trabalhadas no mÊs:");
    double horas = entrada.nextDouble();
    
    double salario = valorHora * horas;
    
    System.out.println("O salario é de: "+ salario);
	}
}
