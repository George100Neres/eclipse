 /* Tendo como dados de entrada a altura de uma pessoa,construa um algoritmo que
  * calcule seu peso ideal,usando a seguinte fórmula:(75.7*altura) -58
  */
package Atividades;

import java.util.Scanner;

public class Calculo_Peso_Ideal {
 
	Scanner entrada = new Scanner(System.in);
	double altura = entrada.nextDouble();
	// Formula do peso ideal
	double pesoIdeal = (72.7* altura)-58;
	
	System.out.println("O peso ideal e:"+pesoIdeal);

}
