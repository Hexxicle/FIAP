import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double valor, soma = 0, desc = 0, total;
		int totalProd = 1;
		String resp = "s";
		
		do {
			System.out.print("Digite o valor do seu produto: ");
			valor = in.nextDouble();
			
			soma += valor;
			
			System.out.println("Deseja digitar o valor de mais um produto? S = Sim e N = N�o");
			resp = in.next();
			
			if (resp.equalsIgnoreCase("n")) {
				break;
			} else {
				totalProd++;
			}
			
		} while (true);
		
		System.out.println("Voc� comprou " + totalProd + " Produtos, o valor total da sua compra �: R$" + soma);
		
		while (true) {
			System.out.println("Escolha a forma de pagamento: \n� vista com 10% de desconto: Digite 'Vista'\nEm duas vezes com 15,5% de acr�scimo: Digite 'Duas'");
			resp = in.next();
			
			if (resp.equalsIgnoreCase("vista")) {
				desc = 0.9;
				break;
			} else if (resp.equalsIgnoreCase("duas")) {
				desc = 1.115;
				break;
			} else {
				System.err.println("Resposta inv�lida! Digite novamente");
			}
		}
		in.close();
		
		total = soma * desc;
		System.out.println("O valor total das suas compras � R$" + String.format("%.2f", total));
	}

}
