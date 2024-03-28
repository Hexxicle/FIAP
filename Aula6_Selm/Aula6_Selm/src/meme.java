import java.util.Scanner;

public class meme {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.print("Pense em um numero de 1 a 10!\nAgora, digite-o no console: ");
		numero = in.nextInt();
		if (numero < 1 || numero > 10) {
			System.err.println("nâo");
		}
		else {
			System.out.println("O numero que você está pensando é " + numero);
		}
		in.close();
	}
}
