package att3;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	final int TAM=10;
	int vetor[]= new int[TAM];
	int divisao,impar = 0,par=0;
	System.out.println("escreva 10 numeros");
	for (int x=0; x < TAM; x++) {
		System.out.println("-->");
		vetor[x]=entrada.nextInt();
	}
	for (int x=0; x < TAM; x++) {
		 divisao=0;
		 divisao=vetor[x]%2;
		 	if(divisao==0) {
		 	par=par+1;
		 }else {
			 impar=impar+1;
		 }
	}
	System.out.println("possui "+ impar+" numeros imapar");
	System.out.println("possui "+ par+" numeros pares");
	}

}
