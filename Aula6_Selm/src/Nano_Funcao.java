import java.util.Scanner;

public class Nano_Funcao {
	
	public static double maior (int n1, int n2) {
		int maior;
		if (n1 > n2 ) {
			maior = n1;
		} else {
			maior = n2;
		}
		return maior;
	}
	
	public static double PI () {

		return 3.14159265358979323846;
		
	}
	
	public static void belizario (String nome, int hora) {
		String msg;
		
		if (hora < 12) {
			msg = "Bom dia! ";
		} else if (hora < 18) {
			msg = "Boa tarde! ";
		} else {
			msg = "Boa noite! ";
		}
	System.out.println(msg + nome + ", voçê está logado");
	}
	
	public static void Ronaldetson () {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite o primeiro número: ");
		num1 = in.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = in.nextInt();
		in.close();
		
		Ronaldetson();
		belizario("Renato", 19);
		System.out.println("PI = " + PI());
		System.out.println(maior(num1, num2));
		
	}

}
