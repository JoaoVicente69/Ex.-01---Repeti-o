package att3; //15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37. 
import java.util.Scanner;

import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva numero");
		 int a = 37;
		 int g = 37;
		 int b= 38;
		 int k=1;
		 int resul=0;
		 resul= (a*b)/k;
		
		 System.out.print("S = ("+a+"*"+b+")/"+k+"+"); 
		while(!(1==g)) {
				a=a-1;
				b=b-1;
				k=k+1;
				resul= resul= (a*b)/k;
				System.out.print("("+a+"*"+b+")/"+k+"+ ");  
				
		  g=g-1;
		}
		System.out.println("Resultado "+ resul); 
		
			}
		}

	