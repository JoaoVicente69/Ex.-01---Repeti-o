package att3;

import java.util.Scanner;

public class questao30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int TAM=10;
		double altura=0,maior=0,menor=0;
		int num=0,cod1=0,cod2=0;
		
		for(int i=0;i<=TAM;i++) {
			System.out.println("numero do aluno + altura do aluno " +(i+1));
			num=entrada.nextInt();
			altura=entrada.nextDouble();
			
			if(i==0) {
				menor=altura;
				cod1=num;
			}else if(altura<menor) {
				menor=altura;
				cod1=num;
			}
			if(i==0) {
				maior= altura;
				cod2=num;
			}else if(altura>maior) {
				maior=altura;
				cod2=num;
			
		}
	}
		System.out.println("mais alto numero = "+cod2+" altura de "+ maior);
		System.out.println("mais baixo numero = "+cod1+" altura de "+ menor);

}}