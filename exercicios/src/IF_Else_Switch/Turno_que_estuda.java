package IF_Else_Switch;

import java.util.Scanner;

public class Turno_que_estuda {
 
  public static void main(String[] args) {
	
  Scanner entrada = new Scanner(System.in); 
	System.out.println("Digite o turno que vc estuda:");
	String turno = entrada.next();
	
	switch(turno) {
	case "m":
	case "M":
		System.out.println("Bom Dia");
		break;
	case "v":
	case "V":
		System.out.println("Boa Tarde");
		break;
	case "n":
	case "N":
		System.out.println("Boa Noite");
		break;
		default:
		System.out.println("Nao estuda em nehum dos Turnos!");
	}
  }
}
