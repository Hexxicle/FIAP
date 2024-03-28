import java.util.Scanner;

public class Exercicio1_A6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = in.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = in.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = in.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
			if (media >= 6) {
			System.out.println("O aluno está aprovado com media: " + String.format("%.2f", media));
			}
			else
				System.err.println("O aluno está reprovado com a média: " + String.format("%.2f", media));
		
		in.close();
	}

}
