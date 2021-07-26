/* Programa que calcula a area de um quadrado,em seguida mostre o dobro desta área para o usuário.  */

package Atividades;

import java.util.Scanner;

public class Area_Quad {

  public static void main(String[] args) {
	 
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Entre com o tamanho do lado do quadrado:");
	 double lado = entrada.nextDouble();
	 
	 // area = lado * lado
	 double area = Math.pow(lado, 2);
	 
	System.out.println("A area do quadrado e:"+ area);
	System.out.println("O dobro da area do quadrado e:"+ (area * 2));
  }
}
