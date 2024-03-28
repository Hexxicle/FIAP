import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio2_A6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		NumberFormat form = new DecimalFormat("#0.00");
		double p1, p2, t1, t2, t3, media, tolerancia = 0.00000000001;
		
		System.out.print("Digite a nota da primeira prova que aluno realizou: ");
		p1 = in.nextDouble();
		System.out.print("Digite a nota da segunda prova que aluno realizou: ");
		p2 = in.nextDouble();
		System.out.print("Notas atualizadas\nAgora digite a nota do aluno no primeiro trabalho realizado: ");
		t1 = in.nextDouble();
		System.out.print("Digite a nota do segundo trabalho que aluno realizou: ");
		t2 = in.nextDouble();
		System.out.print("Digite a nota do terceiro trabalho que aluno realizou: ");
		t3 = in.nextDouble();
		
		media = (((p1 + p2) / 2) * 0.7) + (((t1 + t2 + t3) / 3)* 0.3);
		if (media >= 6 - tolerancia) {
			System.out.println("O aluno foi aprovado com a média " + (form.format(media)));
		}
		else {
			System.err.println("O aluno foi reprovado com a média " + (form.format(media)));
		}
		in.close();
	}

}
