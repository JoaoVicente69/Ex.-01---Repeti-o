package att3;


import java.util.Scanner;

public class questao17 {

	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
	        System.out.print("Digite o numero: ");
	        int numero=entrada.nextInt();
	        double div=numero;
	        if ((div/div)==(numero/numero)){
	            if(div/2!=numero/2 || numero==2){
	                System.out.println("� primo!");
	            } else {
	                System.out.println("n�o � primo!");
	            }
	        } else {
	            System.out.println("n�o � primo!");
	        }
 }
		
		     	
}
		