/*Faça um programa que pergunte quanto você ganha por hora e o número de horas 
 * trabalhadas no mês.Calcule e mostre o total do seu salário no referido mes,
 * sabendo-se que são descontados 11% para o Imposto de Renda,8% para o INSS e 5%
 * para o sindicato,faça um programa que nos dê:
 * salário bruto
 * a)quanto pagou o INSS
 * quanto pagou ao sindicato
 * c)o salário liquido
 * d) calcule os descontos e o salario líquido
 * 
   + Salario Bruto: RS - IR  (11%) : RS - INSS (%8) : RS - Sindicato (%5) :
   RS = Salario Líquido : RS 
 *  */
 
package Atividades;

import java.util.Scanner;

public class Calculo_INSS_Renda {

public static void main(String[] args) {
	 
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Entre com o valor/hora:");
    double valorHora = entrada.nextDouble();
    
    System.out.println("Entre com a quantidade de horas trabalhadas no mÊs:");
    double horas = entrada.nextDouble();
    // salario bruto
    double salario = valorHora * horas;
    //valor inss
    double inss = (salarioBruto /100) *8;
    // valor sindicato
    double sindicato = (salarioBruto /100) *5;
    
    //calculo Imposto de Renda
    double imprend = (salarioBruto /100) *11;
    
    //calculo total desconto
    double totalDescontos = inss + sindicato + imprend;
    double salarioLiquido = salarioBruto - totalDescontos;
    
    System.out.println("Salário bruto:"+ salarioBruto);
    System.out.println("INSS:"+ inss);
    System.out.println("Sindicato:"+ sindicato);
    System.out.println("Imposto de Renda:"+ imprend);
    System.out.println("Total Descontos::"+ totalDescontos);
    System.out.println("Salário líquido:"+ salarioLiquido);
    
    System.out.println("O salario é de: "+ salario);
   }
}
