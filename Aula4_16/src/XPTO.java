import java.text.DecimalFormat;
import java.util.Scanner;

public class XPTO {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0");
		String cargo;
		double anos, salario = 0, aumento = 0, diff;
		
		System.out.print("Digite o seu cargo: ");
		cargo = in.next();
		
		if (cargo.equalsIgnoreCase("gerente")) {
			System.out.print("Digite o tempo trabalhado na empresa em anos: ");
			anos = in.nextDouble();
			if (anos >= 5) {
				aumento = 0.10;
			} else if (anos >= 3 || anos < 5) {
				aumento = 0.9;
			} else {
				aumento = 0.8;
			}
			
			System.out.print("Digite seu salário atual: ");
			salario = in.nextDouble();
			
			System.out.print("Seu antigo salário era de " + form.format(salario) + "R$\n");
			diff = aumento * salario;
			salario = salario + (aumento * salario);
			System.out.println("Seu novo salário é de " + form.format(salario) + "R$, você teve um aumento de " + form.format(diff) + "R$");
			
			
		} else if (cargo.equalsIgnoreCase("engenheiro")) {
			System.out.print("Digite o tempo trabalhado na empresa em anos: ");
			anos = in.nextDouble();
			if (anos >= 5) {
				aumento = 0.11;
			} else if (anos >= 3 || anos < 5) {
				aumento = 0.10;
			} else {
				aumento = 0.9;
			}
			
			System.out.print("Digite seu salário atual: ");
			salario = in.nextDouble();
			
			System.out.print("Seu antigo salário era de " + form.format(salario) + "R$\n");
			diff = aumento * salario;
			salario = salario + (aumento * salario);
			System.out.println("Seu novo salário é de " + form.format(salario) + "R$, você teve um aumento de " + form.format(diff) + "R$");
			
			
		} else if (cargo.equalsIgnoreCase("tecnico")) {
			System.out.print("Digite o tempo trabalhado na empresa em anos: ");
			anos = in.nextDouble();
			if (anos >= 5) {
				aumento = 0.12;
			} else if (anos >= 3 || anos < 5) {
				aumento = 0.11;
			} else {
				aumento = 0.10;
			}
			
			System.out.print("Digite seu salário atual: ");
			salario = in.nextDouble();
			
			System.out.print("Seu antigo salário era de " + form.format(salario) + "R$\n");
			diff = aumento * salario;
			salario = salario + (aumento * salario);
			System.out.println("Seu novo salário é de " + form.format(salario) + "R$, você teve um aumento de " + form.format(diff) + "R$");
			
			
		} else {
			System.err.println("cargo inválido!");
		}

		in.close();
	}

}
