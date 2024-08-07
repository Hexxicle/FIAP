import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[]x = new int[5];
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			x[i] = in.nextInt();
		}
		System.out.print("Você digitou os números: ");
		
		for (int i = 0; i < x.length;i++) {
			System.out.print(x[i] + " ");
		}
		in.close();
	}

}
