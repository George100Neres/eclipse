package Arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
		
    Scanner entrada = new Scanner (System.in);
    
   System.out.print("Quantos alunos:? ");
    int qtdeAlunos = entrada.nextInt();
    
    System.out.print("Quants notas por Aluno ?");
    int qtdNotas = entrada.nextInt();
    
    double [] [] notasDaTurma = new double [qtdeAlunos] [qtdNotas];
    
    for (int a=0; a< notasDaTurma.lenght; a++) { // a representa aluno
      for (int n = 0; n < notasDaTurma[a].lenght; n++) { // representa as notas do aluno
    	  
    	 System.out.printf("Informe a nota %d do aluno %d",n,a);
    	 notasDaTurma[a] [n] = entrada.nextDouble();
    	 total += notasDaTurma [a] [n];
       }
        
   }
    double media = total / (qtdeAlunos * qtdNotas);
    System.out.println("Média da Turma "+ media);
    
	}
}
