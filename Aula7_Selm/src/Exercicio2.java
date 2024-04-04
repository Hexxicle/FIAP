import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		double a, b, c, delta, r1, r2;
		
		System.out.print("Digite o valor de a: ");
		a = in.nextDouble();
		if (a == 0) {
			System.out.println("Valor inválido, não é uma equação do segundo grau");
		} else {
		System.out.print("Digite o valor de b: ");
		b = in.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = in.nextDouble();
		
		in.close();
		
		delta = b * b - 4 * a * c;
		
		r1 = (- b + Math.sqrt(delta)) / (2 * a);
		r2 = (- b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("Raiz 1 = " + form.format(r1) + "\nRaiz 2 = " + form.format(r2));
		}
	}

}
