package fundamentos;

public class Ternario {

  public static void main(String[] args) {
	
	double media = 8.6;
	 // Se a media for maior ou igual a 7.0,o aluno esta aprovado,caso contrario,estará em recuperação
	String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperaçao";
	
	System.out.println("O aluno está "+ resultadoFinal);
	
	double nota = 9.9;
	boolean bomComportamento = false;
	boolean passouPorMedia = nota >= 7;
	boolean temDesconto = bomComportamento && passouPorMedia;
	String resultado = temDesconto ? "Sim" : "Não";
	
	System.out.println("Tem Desconto?"+resultado);
  }
}
