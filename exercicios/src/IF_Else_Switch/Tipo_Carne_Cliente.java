/* O Hipermercado Tabajara esta com a tabela de promoção de carnes Confira:
 * 
 * 							Até 5 KG					Acima de 5 KG
 * *File Duplo				 4,90KG						5,80 KG
 * *Alcatra					 5,90KG						6,80Kg
 * Picanha					 6,90KG						7,80KG
 * 
 * Cada cliente poderá levar apenas um dos tipos de carne na promocao,porém não há
 * limites para a quantidade de carne por cliente.Se compra for feita no cartão Tabajara
 * o cliente recebe ainda um desconto de 5% sobre o total da compra.Faça o programa
 * que solicite o tipo e a quantidade de carne comprada pelo ususario e gere um cupom fiscal,
 * contendo as informacoes da compra: tipo e quantidade de carne,preco total,
 * tipo de pagamento,valor do desconto e valor a pagar.
 */
package IF_Else_Switch;

import java.util.Scanner;

public class Tipo_Carne_Cliente {
 
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Entre com o tipo de carne:");
	System.out.println("1 - file duplo:");
	System.out.println("2 - alcatra:");
	System.out.println("3 - picanha:");
	int tipo = entrada.nextInt();
	
	System.out.println("Entre com a quantidade de KG:");
	double qtd = entrada.nextDouble();
	
  double precoKG =0;
  
  if(tipo == 1) {
	  
	if(qtd <5) {
	 precoKG = 4.9;
	}
	else {
	 precoKG = 5.8;
	}
  }
  else if(tipo ==2) {
	  
	  if(qtd <5) {
			 precoKG = 5.9;
			}
	else {
			 precoKG = 6.8;
			} 
  }
	}
}
