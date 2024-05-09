import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int valor, cont = 0, resultado;
		String menu;
		
		while (true) {
			
			System.out.print("Digite um valor: ");
			valor = in.nextInt();
			
			System.out.print("A tabuada do seu valor é: \n");
			while (cont <= 10) {
				resultado = valor * cont;
				System.out.println(valor + " * " + cont + " = " + resultado);
				cont++;
			}
			System.out.println("\nGostaia de digitar outro valor? S = Sim  N = Não");
			menu = in.next();
			
			if (menu.equalsIgnoreCase("n")) {
				System.out.println("Obrigado por usar o programa de multiplicação");
				break;
			}
				
			cont = 0;
		}
		
		in.close();
	}
}
