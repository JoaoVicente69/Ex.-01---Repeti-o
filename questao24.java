package att3;

import java.util.Scanner;

public class questao24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("qunatos CDs Você compro?");
			final int TAM=entrada.nextInt();
			int media=0;

			for(int i = 0; i < TAM; i++){
				System.out.print("Digite  o valor de cada CDs " +(i+1)+"º valor: ");
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

