package att3;

import java.util.Scanner;

public class questao27 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas temperaturas vao ser informadas:");
		final int TAM=entrada.nextInt();
		int temp=0,menort=0,maiort=0,media=0;
		
			for(int i=0;i<TAM;i++) {
			System.out.print("informe as temperaturas :");
			temp=entrada.nextInt();
				if(i==0) {
					menort=temp;
				}else if(temp<menort) {
					menort=temp;
				}
				if(i==0) {
					maiort=temp;
				}else if(temp>maiort) {
					maiort=temp;
				}
				media=media+temp;
		}
			media=media/TAM;
			System.out.println("a maoir temperatura foi de "+maiort+"°C");
			System.out.println("a menor temperatura foi de "+menort+"°C");
			System.out.println("a media temperatura foi de "+media+"°C");
	}
}
