package att3;

import java.util.Scanner;

public class qustao26 {

	public static void main(String[] args) {
	
			
			Scanner entrada = new Scanner(System.in);
			float valor=(float)0;
			float taxa=(float)0.18;
			
			
			
			for(int i = 0; i < 50; i++){
				valor=taxa;
				System.out.printf("quantidade de pão "+(i+1)+ "- R$%.2f %n", valor);
				taxa=(float) (taxa+0.18);
			}
		}
		

	}

	