package Atividades;

public class TipoString {

  public static void main(String[] args) {
 		
  System.out.println("Ola pessoal".charAt(2)); // vai pegar aquela string que foi marcada a posicao
  
   String s = "Bom ida X!";

   System.out.println(s.concat("!!!"));
   System.out.println(s + "!!!"); // Vai concatenar a  String
   System.out.println(s.startWith("Boa")); // Verifica se a palabra inicial e Maiuscula
   System.out.println(s.toLowerCase().startsWith("boa")); // verifica se a palavra inicial e minuscula
   System.out.println(s.toUpperCase().endsWith("TARDE")); // verifica se a ultima letra da string e maiuscula
   System.out.println(s.lenght()); // mostra a quantidade de string que contem a palavra
   System.out.println(s.toLowerCase().equals("boa tarde"));// verifica se a string minuscula e igual
   System.out.println(s.equalsIgnoreCase("boa tarde")); // ignora a situação das strings iguais.
   
    var nome = "Pedro";
    var sobrenome = "Santos";
    var idade = 33;
    var salario = 12345.893;
    
    System.out.println("Nome " + nome + "\nSobrenome "+ sobrenome +"\nIdade: "+ idade +"\nSalario: "+salario);
	}
}
