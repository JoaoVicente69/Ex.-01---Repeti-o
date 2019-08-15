package att3;

import java.util.Scanner;

public class questao20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite quantas notas a ");
		final int TAM=entrada.nextInt();
		double valor[] = new double[TAM];
		double soma=0;
		
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = entrada.nextDouble();
			soma=soma+valor[i];
		
		}
		soma=soma/TAM;
		System.out.print("média aritmética = " + soma);
	} 

}
