package fundamentos;

public class Relacionais {

  public static void main(String[] args) {
	  
	double nota = 6.3;
	boolean bomComportamento = true;
	boolean passouPorMedia = nota >= 7;
	boolean temDesconto = bomComportamento &&  passouPorMedia;
	
    System.out.println("Tem desconto" + temDesconto);
    
  }
}
