package att3;
import java.util.Scanner;
public class questao16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite quantos numeros havera ");
		final int TAM=entrada.nextInt();
		int valor[] = new int[TAM];
		int maior = 0,soma=0, menor = 0; 
		
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = entrada.nextInt();
			
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor){
				menor = valor[j];
				soma=valor[j]+soma;
			}
		}
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
		System.out.println("soma = "+ soma);
	}


	}


