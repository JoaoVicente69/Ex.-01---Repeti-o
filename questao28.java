package att3;

import java.util.Scanner;

public class questao28 {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			int numTab,tabuada=0;
			int k=0;


			
			System.out.println("Você quer a tabuada de ?");
			numTab=entrada.nextInt();
			
			System.out.println("iniciada em ?");
			int pri=entrada.nextInt();
			System.out.println("teminada em ?");
			int  ultimo=entrada.nextInt();
			
			while (!(pri<ultimo)) {
				System.out.println("ultimo digito menor que o primeiro");
				System.out.println("iniciada em ?");
				 pri=entrada.nextInt();
				System.out.println("teminada em ?");
				ultimo=entrada.nextInt();
				
			}
			k=pri;
			while (k<=ultimo) {
				tabuada=numTab*k;
					System.out.println(numTab+" X "+k+" = "+tabuada);
					k=k+1;
			}
			}

	

}
