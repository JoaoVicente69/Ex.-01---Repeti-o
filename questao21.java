package att3;

import java.util.Scanner;

public class questao21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.print("quantas pessoas serao intrevistadas ");
		final int TAM=entrada.nextInt();
		int valor[] = new int[TAM];
		int media = 0; 
		
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite a " +(i+1)+"º idade: ");
			valor[i] = entrada.nextInt();
			media=media+valor[i];
		}
		media=media/TAM;
		
		if((media>0)&&(media<=25)) {
			System.out.println("turma jovem "+ media);
			}else if((media>=26)&&(media<=60)) {
			System.out.println("turma adulta " + media);
				}else{
					System.out.println("turma idosa " + media);
		}

	}

}
