import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double valor, cont = 1, fat = 1;
		
		System.out.print("Infome um valor: ");
		valor = in.nextInt();
		
		if (valor < 0) {
			System.err.println("Valor inválido");
		} else {
			while (cont <= valor) {
				fat = fat * cont;
				cont++;
			}
			System.out.println(fat);
		}
		in.close();
	}
}
