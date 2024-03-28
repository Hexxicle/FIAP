import java.util.Scanner;

public class Exercicio3_A6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double valor, desconto;
		
		System.out.print("Digite o valor das suas compras: ");
		valor = in.nextDouble();
		
		if (valor >= 1000) {
			desconto = valor - (valor * 0.15);
			valor = valor - desconto;
			System.out.println("Voce ganhou 15% de desconto nas suas compras!\nEsse é o novo valor das compras: " + valor + "\nE esse é o valor descontado: " + desconto);
		}
		else {
			desconto = valor - (valor * 0.08);
			valor = valor - desconto;
			System.out.println("Voce ganhou 8% de desconto nas suas compras!\nEsse é o novo valor das compras: " + valor + "\nE esse é o valor descontado: " + desconto);
		}
		
		in.close();
	}

}
