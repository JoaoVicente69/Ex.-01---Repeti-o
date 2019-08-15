package att3;

import java.util.Scanner;

public class QUESTAO22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("quantas pessoas VOTARAM ");
		final int TAM=entrada.nextInt();
		int valor[] = new int[TAM];
		int mediaa = 0,mediab=0,mediac=0;
		int cant=0;
		int num=0;
		for(int i = 0; i < valor.length; i++){
			System.out.print("seu voto vai para o cantidato 1,2 ou 3 ?");
			cant=entrada.nextInt();
			switch (cant) {
			case 1:
				mediaa=mediaa+1;
				break;
			case 2:
				mediab=mediab+1;
				break;
			case 3:
				mediac=mediac+1;
				
				break;
			default:
				num=num+1;
				break;

			
			} 
		}
		System.out.println("cantidado 1 resebeu "+ mediaa+" votos");
		System.out.println("cantidado 2 resebeu "+ mediab+" votos");
		System.out.println("cantidado 3 resebeu "+ mediac+" votos");	
		System.out.println("votos em branco " +num);	
		
	}

}
