import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x[] = new int[10];
		int temp = 0, j = x.length - 1;
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			x[i] = in.nextInt();
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("----------------");
		
		for (int i = 0; i < x.length / 2; i++, j--) {
			temp = x[i];
			x[i] = x[j];
			x[j] = temp;
		}
		
//		for (int i = 0; i < x.length / 2; i++) {
//			temp = x[i];
//			x[i] = x[x.length - 1 - i]; 
//			x[x.length - 1 - i] = temp;
//		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		in.close();
	}

}
