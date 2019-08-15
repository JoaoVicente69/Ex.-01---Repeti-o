package att3;

import java.util.Scanner;

public class questao13 {
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva numero");
		
		 int fat =entrada.nextInt();
		 int aux=1;
		 
		while(!(fat==1)) {
			  aux=fat*aux;
			  
			  fat=fat-1;
		  
		}
			System.out.print(aux);
		     	
			}
		}

