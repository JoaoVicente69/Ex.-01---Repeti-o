package att3;
import java.util.Scanner;

public class att3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		String nome=" ";
		int idade=0;
		double salario=0;
		String sexo,estado_civil=" ";
		
		System.out.println("Escreva seu nome com mais de 3 caracte, sua idade, seu salario, sexo e estado civil");
		
		
		
		
		
		do{ 
			System.out.println("nome");
		nome=entrada.nextLine();
		
		} while(nome.length()<=3);
		do {System.out.println("Idade");
		idade=entrada.nextInt();
		}while((idade<0)&(idade<150));
		do {
			System.out.println("Salario");
			salario=entrada.nextDouble();
		
		} while (salario<=0);
		entrada.nextLine();
		do {
			System.out.println("Sexo");
			sexo=entrada.nextLine();
		
			
		} while (!"f".equalsIgnoreCase(sexo) & !"M".equalsIgnoreCase(sexo));
		
		do {System.out.println("estado Civil");
		estado_civil=entrada.nextLine();	
		} while ((!"s".equalsIgnoreCase(estado_civil))&(!"c".equalsIgnoreCase(estado_civil))&(!"v".equalsIgnoreCase(estado_civil))&(!"D".equalsIgnoreCase(estado_civil)));
	
System.out.println("ok");
	}

}
