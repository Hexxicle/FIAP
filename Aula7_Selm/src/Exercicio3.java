import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double v1, v2, v3, menorV;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = in.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = in.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		v3 = in.nextDouble();
		
		in.close();
		
		if (v1 == v2 && v2 == v3) {
			System.out.println("Todos os valores são iguais");
		} else {
			if (v1 < v2) {
				menorV = v1;
			} else if (v2 < v3) {
				menorV = v2;
			} else {
				menorV = v3;
			} 
			System.out.println("O menor valor é: " + menorV);
		}
	}

}
