import java.util.Scanner;

public class Nano2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n, i = 0;
		
		System.out.print("Digite um número e o programa irá te dizer a tabuada dele: ");
		n = in.nextInt();
		in.close();
		
		System.out.println("Imprimindo a tabuada do " + n);
		
		while (i < 10) {
			System.out.println(n + " x " + (i + 1) + " = " + (n * (i + 1)));
			i++;
		}
	}
}
