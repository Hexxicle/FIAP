import java.util.Scanner;

public class Exercicio5_A6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double l1, l2, l3;
		
		System.out.print("Digite o valor do primeiro lado: ");
		l1 = in.nextDouble();
		System.out.print("Digite o valor do segundo lado: ");
		l2 = in.nextDouble();
		System.out.print("Digite o valor do terceiro lado: ");
		l3 = in.nextDouble();
		
		in.close();
		
		if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l2 + l1) {
			System.out.println("Os valores entregues formam triângulo");
		} 
		else {
			System.err.println("Os valores entregues nao formam um triângulo");
		}
		
	}

}
