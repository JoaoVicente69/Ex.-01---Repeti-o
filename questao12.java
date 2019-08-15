package att3;

import java.util.Scanner;

public class questao12 {
	 public static void main(String[] args){
		 
		 Scanner entrada = new Scanner(System.in);
	        
		 int num1 = 1, num2 = 0;
		 System.out.println("escreva quantos termos havera");
	        final int  ntermos=entrada.nextInt();
	        
	      
	        System.out.println(num1);
	        
	        for(int i = 0; i < ntermos; i++){
	            num1 = num1 + num2;
	            num2 = num1 - num2;
	            System.out.println(num1);
	        }
	    }
	    
	}

