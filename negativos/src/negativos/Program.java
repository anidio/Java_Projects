package negativos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();
		
		int [] vet = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
			
			}
		
		
		for(int i = 0; i < 0; i++ ) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
				System.out.println("NUMEROS NEGATIVOS:");
			}
			
		}
		
		sc.close();
	}

}
