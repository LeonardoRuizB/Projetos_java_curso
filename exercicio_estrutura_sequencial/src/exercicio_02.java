import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double pi, raio, A;
		
		pi = 3.14159;
		
		raio = sc.nextDouble();
		
		A = pi * raio * raio;
		
		System.out.printf("A= %.4f%n", A);
		
		sc.close();

	}

}
