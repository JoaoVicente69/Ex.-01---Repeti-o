package att3;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1,num2=0;
		 System.out.println("escreva 2 numeros para ver o intervalo entre eles");
		 num1=entrada.nextInt();
		 num2=entrada.nextInt();
		 int soma=num2+num1;
		 if(num1>num2) {
			 for(int i=(1+num2); i<num1; i++) {
				 System.out.println(i);
			 }
		 }else {
			 for(int i=(1+num1); i<num2; i++) {
				 System.out.println(i);
		 }
		System.out.println("a soma dos dois numeros � "+ soma);
		}
	}

}
