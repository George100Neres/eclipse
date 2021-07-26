package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
  
	public static void main(String[] args) {
		
	 Scanner entrada = new Scanner (System.in);
	 
	 System.out.print("Quantas notas:?");
	 
	 int qtdNotas = entrada.nextInt();
	 
	 double notas = new double [qtdNotas];
	 
	 // Irá mostrar todas as notas digitadas 
	 for(int i=0; i<notas.lenght; i++) {
		System.out.print("Informe a nota" + (i + 1)+ ":");
		notas[i] = entrada.nextDouble();
		
	 }
	 
    double total = 0;
    for(double nota: notas) {
    	total += nota;
      }
    double media = total /notas.lenght;
    System.out.println("A média e" + media +  "!");
	}
}
