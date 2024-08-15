import java.util.Iterator;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int qtd;
		
		System.out.print("Digite a quantidade de casas do vetor: ");
		qtd = in.nextInt();
		
		int x[] = new int[qtd];
		boolean status = true;
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			x[i] = in.nextInt();
		}
		
		if(qtd != 1) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] % 2 == x[i + 1] % 2) {
					status = false;
					break;
				}
			}
		}
		if (status) {
			System.out.println("Array especial");
		} else {
			System.out.println("Array normal");
		}
	}

}
