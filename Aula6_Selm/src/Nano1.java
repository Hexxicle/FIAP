import java.util.Scanner;

public class Nano1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double n, soma = 0;
		
		System.out.println("O programa irá somar 10 números que o usuario provienciar.");
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			n = in.nextDouble();
			soma += n;
			
			}
		System.out.println("A soma dos seus 10 números é: " + soma);
		
		in.close();
	}
}	
