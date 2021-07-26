package Arrays;

public class Matrizes_Part1 {
  
	public static void main(String[] args) {
		//30 Alunos 4 notas
		double[][] notasAlunos = new double [30] [4];
		// 1 aluno
		notasAlunos[0][0] =10;
		notasAlunos[0] [1] = 7;
		notasAlunos[0] [2] = 9;
		notasAlunos [0] [3] = 9.5;
		
		// 2 aluno 
		notasAlunos[1][0] =20;
		notasAlunos[1] [1] = 6;
		notasAlunos[1] [2] = 8;
		notasAlunos [10] [3] = 15.4;
		
		for(int i =0; i<notasAlunos.length; i++) {
			// vai impmimir a linha
			for(int j =0; j<notasAlunos.length; j++) {
				System.out.println(notasAlunos[i][j]+ "-");
			}
			System.out.println();
		}
		
		
	}
}
