package att3;


import java.util.Scanner;

public class questao19 {

	public static void main(String[] args) {
	    
		Scanner entrada= new Scanner(System.in);

	    float num = 0;
	    System.out.print("Informe número: ");
	    num = entrada.nextFloat();
	    while (num != (int)num)
	    	num = entrada.nextFloat();

	    System.out.println("\nResutaldo");
	    for (int i = 1; i <= num; i++) {
	      if ((i % 2 != 0 && i % 3 != 0 && i != 0)
	          || (i == 2 || i == 3)) {
	        System.out.printf("%d  ", i);
	      	}
	    }
	    entrada.close();
	}
}
