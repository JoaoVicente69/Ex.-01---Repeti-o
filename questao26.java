package att3;
import java.util.Scanner;

public class questao26 {

	public static void main(String[] args) {

			
			Scanner entrada = new Scanner(System.in);
			double num=1;
			final int TAM=100;
			int i=0;
			double preco=0;
			double troco=0;
			
			
			
			
			while (!(num==0)) {
					preco=preco+num;
					System.out.printf ("Insira 0 para sair ou Insira o Preço do Produto" +(i+1)+": \n");
					num=entrada.nextDouble();
					i=i+1;
				}
			preco=preco-1;
			System.out.printf("Total a pagar: R$ %4.2f \n",preco);
				if(preco>0) {
				System.out.printf("infome o valor a receber : \n");
				troco=entrada.nextDouble();

				}
				if(troco>preco) {
					troco=troco-preco;
			System.out.printf("troco R$ %4.2f\n",troco);
				}
			
			
			
	}

}