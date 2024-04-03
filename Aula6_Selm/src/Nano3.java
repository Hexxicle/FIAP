import java.util.Scanner;

public class Nano3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n, soma = 1;
		
		System.out.print("O programa irá te dizer o fatorial do número digitado: ");
		n = in.nextInt();
		in.close();
		
		while (n > 1) {
			soma = soma * n;
			n--;
		}
		System.out.println("O fatorial do seu número é: " + soma);
	}

}
