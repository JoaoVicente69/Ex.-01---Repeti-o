package att3;
import java.util.Scanner;
public class questao18 {
	
		
	public static void main (String [] args){
			Scanner entrada = new Scanner(System.in);
		        System.out.print("Digite o numero: ");
		        int numero=entrada.nextInt();
		        double div=numero;
		        int var[]= new int[100];
		       
		        if ((div/div)==(numero/numero)){
		            if(div/2!=numero/2 || numero==2){
		                System.out.println("é primo!");
		            
		            } else {
		                System.out.println("não é primo!");
		                System.out.println("ele é divisivel por");
		             	    for(int k =1; k==numero;k++) {
		                	if((numero%k!=1)||(numero%k!=0)) {		  
		                	System.out.println( k + " - ");		                
		                	}
		                }
		            
		            }
		        } else {
		            System.out.println("não é primo!");
		            System.out.println("ele é divisivel por");
		            for(int j =1; j==numero;j++) {
	                	if ((numero%j!=1)||(numero%j!=0))
		                		System.out.println( j + " - ");
	                		}
	                	}
		            }
	                		
		        
	 }
			
			     	
	
			


