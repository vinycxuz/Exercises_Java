import java.util.Scanner;
public class ComparaNumero {
	int n1, n2;
	int Comparar(int n1, int n2) {
		System.out.println("Eles são iguais? ");
		if(n1 == n2) {
		System.out.println(n1 == n2);
		}
		else {
			System.out.println(n1 == n2);
		}
		if(n1 > n2) {
		return n1;
		}
		else {
			return n2;
		}
	}
	public static void main(String[] args) {
		ComparaNumero comparaNumero = new ComparaNumero();
		Scanner in = new Scanner(System.in);
		System.out.println("Digite n1: ");
		comparaNumero.n1 = in.nextInt();
		System.out.println("Digite n2: ");
		comparaNumero.n2 = in.nextInt();
		System.out.println(comparaNumero.Comparar(comparaNumero.n1, comparaNumero.n2));
		
	}
}
