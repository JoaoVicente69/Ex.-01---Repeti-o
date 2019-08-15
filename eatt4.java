package att3;
import java.util.Scanner;


public class eatt4 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double paisA=80000, paisB=200000;
	double cresA=0.03, cresB= 0.015;
	int ano=0;
	
	while(paisA<paisB) {
		paisA=paisA+(paisA*cresA);
		paisB=(paisB*(paisB*cresB));
		ano=ano+1;
	}
	System.out.println("ano "+ano);
	entrada.close();
	
	}

}
