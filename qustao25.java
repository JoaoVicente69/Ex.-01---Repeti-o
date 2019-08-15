package att3;

import java.util.Scanner;

public class qustao25 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		float valor=(float)0;
		float taxa=(float)1.99;
		
		
		
		for(int i = 0; i < 50; i++){
			valor=taxa;
			System.out.printf((i+1)+ "- R$ R$%.2f %n", valor);
			taxa=(float) (taxa+1.99);
		}
	}
	

}
