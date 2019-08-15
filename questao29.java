package att3;

import java.util.Scanner;

public class questao29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 int cod=0,cod1=0,cod2=0,cod3=0,cod4=0;
		 int i=0;
		 int altura=0,alturam=0,maiora=0,menora=0;
		 double peso=0,pesom=0,maiorp=0,menorp=0;
		do {
			System.out.println("Deseja Sair do Programa (0 - SIm / novo codigo - nao);");
			cod=entrada.nextInt();
			if(!(cod==0)) {
				System.out.println("altura");
				altura=entrada.nextInt();
				System.out.println("peso");
				peso=entrada.nextInt();
					
				if(i==0) {
					menorp=peso;
					cod1=cod;
				}else if(peso<menorp) {
					menorp=peso;
					cod1=cod;
				}
				if(i==0) {
					maiorp= peso;
					cod2=cod;
				}else if(peso>maiorp) {
					maiorp=peso;
					cod2=cod;
				}
				pesom=pesom+peso;
				
				if(i==0) {
					menora=altura;
					cod3=cod;
				}else if(altura<menora) {
					menora=altura;
					cod3=cod;
				}
				if(i==0) {
					maiora=altura;
					cod4=cod;
				}else if(altura>maiora) {
					maiora=altura;
					cod4=cod;
				}
				alturam=alturam+altura;
				
				i=1+1;
			}
			
			
		}while(!(cod==0));
		System.out.println("\n\nObrigado por utilizar nosso Software.");
		
		System.out.println("mais alto cod= "+cod4+" altura de "+ maiora);
		System.out.println("mais baixo cod= "+cod3+" altura de "+ menora);
		System.out.println("mais gordo cod= "+cod2+" peso de "+ maiorp);
		System.out.println("mais magro cod= "+cod1+" peso de "+ menorp);
		System.out.println("media altura= "+(alturam/i)+" media peso "+(pesom/i));
	
		}
	
	}


