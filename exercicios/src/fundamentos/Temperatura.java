package fundamentos;

public class Temperatura {

  public static void main(String[] args) {
	//Desafio (F - 32) * 5/9 = C
	  
	final double Fator = 5.0/9.0;
	double Ajuste = 32;
	
	double fahreint = 86;
	double celsius = (fahreint  - Ajuste)* Fator;
	
	System.out.println("O resultado e"+celsius +"C");
   }
}
