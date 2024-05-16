import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int valor, mult = 0;
		
		System.out.print("Digite um valor inteiro e positivo: ");
		valor = in.nextInt();
		
		in.close();
		
		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				mult++;
				break;
			}
			
		}
		System.out.println(mult == 0 ? "Primo" : "Nao primo");
	}
}
