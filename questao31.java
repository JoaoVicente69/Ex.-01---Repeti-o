package att3;

import java.util.Scanner;

public class questao31 {

public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	final int TAM=5;
	int f=0;
	double altura=0,maior=0,menor=0;
	int num=0,car=0,ass=0,maiortaxaass=0,taxaass=0,cod1=0,menortaxaass=0,cod2=0,meidiacar=0,mediaass=0;
	for(int i=0;i<=TAM;i++) {
		System.out.println("C�digo da cidade:");
		num=entrada.nextInt();
		System.out.println("N�mero de ve�culos de passeio (em 1999):");
		car=entrada.nextInt();
		System.out.println(" N�mero de acidentes de tr�nsito com v�timas (em 1999):");
		ass=entrada.nextInt();
		taxaass=((car-ass)/ass)*100;
		if(i==0) {
			maiortaxaass=taxaass;
			cod1=num;
		}else if(taxaass>maiortaxaass) {
			maiortaxaass=maiortaxaass;
			cod1=num;
			if(i==0) {
				menortaxaass=taxaass;
				cod2=num;
			}else if(taxaass<menortaxaass) {
				menortaxaass=maiortaxaass;
				cod2=num;
				meidiacar=meidiacar=car;
			if(car<2000) {
				mediaass=mediaass+ass;
				f=f+1;
			}
				
			
				
			}
	}
	}
	System.out.println("maior quatidade de acidentes acontece na cidade "+cod1+"com "+maiortaxaass);
	System.out.println("meor quatidade de acidentes acontece na cidade "+cod2+"com "+menortaxaass);
	System.out.println("media acidentes "+(meidiacar/5));
	System.out.println("m�dia de acidentes de tr�nsito nas cidades com menos de 2.000 ve�culos de passeio" +(mediaass/f));
}
}




