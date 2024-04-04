import java.util.Scanner;

public class Exercicio1 {
	
	public static void custo (double x) {
		System.out.println("Seu custo de dispesas do hotel é: " + String.format("%.00f", x) + "R$");
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double custo;
		int dias;
		
		System.out.print("Digite o numero de dias que você passou no hotel: ");
		dias = in.nextInt();
		
		in.close();
		
		if (dias > 15) {
			custo = (dias * 15.50) + 250.00;
		} else if (dias == 15) {
			custo = (dias * 36.00) + 250.00;
		} else {
			custo = (dias * 58.00) + 250.00;
		}
		custo(custo);
	}

}
