package att3;
import java.util.Scanner;


public class att2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome=" ";
		String senha=" ";
		do {
			System.out.println("escreva seu nome e sua senha diferentes");
			nome=entrada.nextLine();
			senha=entrada.nextLine();
			if(nome.equalsIgnoreCase(senha)) {
				
			}
			}while (nome.equalsIgnoreCase(senha));
		
		}
	}



