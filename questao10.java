package att3;
import java.util.Scanner;


public class questao10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int base,espoente,resultado=0;
		System.out.println("escreva 2 numeros a base e o  espoente");
		base=entrada.nextInt();
		espoente=entrada.nextInt();
		resultado=base;
			for(int b=1;b<espoente;b++){
				resultado=resultado*base;
			}
		
		System.out.println("seu numero elevado é "+ resultado);

	}

}
