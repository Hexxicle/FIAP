import java.util.Scanner;

public class Exercicio4_A6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double x, y;
		
		System.out.println("Digite o valor de X que será usado na equação y = 8 / √x² -25");
		x= in.nextDouble();
		
		if (x >= -5 || x <= 5) {
			System.err.println("Não foi possível realizar a equação com esse número");
		}
		else {
			y = 8 / Math.sqrt((Math.pow(x, 2) - 25));
			System.out.println("O resultado da sua equação é: " + String.format("%.2f", y));
		}
		
		in.close();
	}

}
