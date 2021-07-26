package Arrays;

import java.util.Scanner;

public class Media_Aluno {

  public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	double [] [] notasAlunos = new double[30] [4];
	
	notasAlunos[1][0] =20;
	notasAlunos[1] [1] = 6;
	notasAlunos[1] [2] = 8;
	notasAlunos [10] [3] = 15.4;
	
	
	System.out.println("Calculando a média de cada aluno:");
	
	double soma;
	
	for(int i=0; i<notasAlunos.length; i++) {
		
	 soma =0;
	 for(int j=0; j < notasAlunos.length; j++) {
		 soma += notasAlunos[i] [j];
	 }
	 
	 System.out.println("Media do aluno: "+ i+ "e ="+(soma/4));
	}
  }
}
