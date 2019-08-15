package att3;
import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	int numTab,tabuada=0;

	
	System.out.println("Você quer a tabuada de ?");
	numTab=entrada.nextInt();
	
	for(int k =1; k<=10; k++){
		tabuada=numTab*k;
			System.out.println(numTab+" X "+k+" = "+tabuada);
	}
	}
}
