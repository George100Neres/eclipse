/* As organizações Tabajara resolveram dar um aumento de salario aos seus colaboradores
 * e lhe contaram para desenvolver o programa que calculará os reajustes.
 *   * Faça um programa que calcula o salario de um colaborador e o reajuste segundo
 *    o criterio,baseado no salario atual:
 *   * salarios ate 280(incluindo):aumento de 20%
 *   * salarios ate 280 e RS 700 aumento de 15%
 *   * salarios ate 700 e RS 1500 aumento de 10%
 *   * salarios ate 1500 em diante:  aumento de 5% apos o auemnto
 *   ser realizado,informe na tela:
 *   
 *   *o salario antes do reajuste;
 *   *o percentual de auemnto aplicado;
 *   *o valor do aumento;
 *   *o novo salario,apos o auemnto.
 *   
 */
package IF_Else_Switch;

import java.util.Scanner;

public class Reajuste_salario_colaborador {
  
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(SYstem.in);
	
	System.out.println("Digite o salario");
	double salario = entrada.nextDouble();
	
	int percentual =0;
	if(salario <= 280) {
		percentual = 20;
	 }
	else if(salario > 280 && salario < 700) {
		percentual =15;
	 }
	
	else if(salario > 700 && salario < 1500) {
		percentual =10;
	}
		else if(salario > 1500) {
			percentual =5;
		} 
	
	  //reajuste do salario
	double aumento =(salario/100) * percentual;
	double salarioAjustado = salario + aumento;
	
	System.out.println("Salario"+salario);
	System.out.println("Percentual"+percentual);
	System.out.println("Aumento"+aumento);
	System.out.println("Salario Reajustado"+salarioAjustado);
	
	}
}
