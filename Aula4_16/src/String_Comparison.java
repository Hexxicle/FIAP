import java.util.Scanner;

public class String_Comparison {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String teste;
		
		System.out.print("Digite oq vc acha q a pessoa é: ");
		teste = in.next();
		
		in.close();
		
		if (teste.equalsIgnoreCase("viado")) {
			System.out.println("lucas.");
		} else {
			System.out.println("macho");
		}

	}

}
