package att3;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			 final int VAR=50;
			 int impar=0;
			 int vetor[] = new int[VAR];
			impar=0;
			for(int i=0; i<VAR;i++) {
				vetor[i]=i;
			impar=vetor[i]%2;
			if(impar!=0) {
				System.out.println(vetor[i]);
			}
			
	}
	}
}
