import java.text.DecimalFormat;
import java.util.Scanner;

public class Nano4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		double mediaS, mediaF, n1, n2, n3, nE, menorN, tolerancia = 0000000000.1;
		
		System.out.print("Bem-vindo ao sistema de calculo de médias!\nDigite a primeira nota do aluno: ");
		n1 = in.nextDouble();
		if (n1 >= 0 && n1 <= 10) {
			System.out.print("Digite a segunda nota do aluno: ");
			n2 = in.nextDouble();
			if (n2 >=0 && n2 <= 10) {
				System.out.print("Digite a tereira nota do aluno: ");
				n3 = in.nextDouble();
				if (n3 >= 0 && n3 <= 10) {
					menorN = n1;
					if (n2 < menorN) {
						menorN = n2;
					}
					if (n3 < menorN) {
						menorN = n3;
					}
					
					mediaS = ((n1 + n2 + n3 - menorN) + tolerancia) / 2;
					System.out.println("Sua média é " + form.format(mediaS));
					 if (mediaS < 4) {
						 System.err.println("Você foi reprovado.");
					 } else if (mediaS >= 4 && mediaS <= 6.9) {
						 System.out.println("Você está de exame\nDigite a nota do exame: ");
						 nE = in.nextDouble();
						 if (nE >= 0 && nE <= 10) {
							 mediaF = ((mediaS + nE) + tolerancia) / 2;
							 if (mediaF <5) {
								 System.err.println("Reprovado em exame, Média " + form.format(mediaF));
							 } else {
								 System.out.println("Aprovado com exame, Média " + form.format(mediaF));
							 }
						 } else {
							 System.err.println("A nota do exame: " + nE + " é inválida");
						 }
					 } else {
						 System.out.println("Você foi aprovado!");
					 }
					 
				} else { 
					System.err.println("A nota 3: " + n3 + " é inválida");
				}
			} else {
				System.err.println("A nota 2: " + n2 + " é inválida");
			}
		} else {
			System.err.println("A nota 1: " + n1 + " é inválida");
		}
		in.close();
	}

}
