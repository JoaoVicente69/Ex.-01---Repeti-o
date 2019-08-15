package att3;

import java.util.Scanner;

public class questao23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("qunatos turmas tem?");
			final int TAM=entrada.nextInt();
			int media=0;

			for(int i = 0; i < TAM; i++){
				System.out.print("Digite a  quantidade de alunos da " +(i+1)+"º turma: ");
					int resposta1=entrada.nextInt();
						while (!(resposta1>0)&!(resposta1<=40)) {
							System.out.println("numero invalido");
							resposta1=entrada.nextInt();
							
							}	
							media=resposta1+media;
							
			}
							media=media/TAM;
							System.out.println(media);
				
	}

}
