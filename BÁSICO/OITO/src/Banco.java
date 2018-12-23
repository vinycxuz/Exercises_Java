import java.util.Scanner;
public class Banco {
	public static void main (String[] args) {
		int saldoMedio;
		int credito = 0;
		int opcao = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o saldo médio: ");
		saldoMedio = in.nextInt();
			
		if(saldoMedio <= 200) {
			credito = 0;
			opcao = 0;
		}
		if(saldoMedio > 200 && saldoMedio < 401){
			credito = (saldoMedio*20)/100;
			opcao = 1;
		}
		if(saldoMedio > 400 && saldoMedio < 601) {
			credito = (saldoMedio*30)/100;
			opcao = 2;
		}
		if(saldoMedio > 601) {
			credito = (saldoMedio*40)/100;
			opcao = 3;
		}
		switch(opcao) {
		case 0:
			System.out.println(saldoMedio);
			System.out.println(credito);
			break;
		case 1:
			System.out.println(saldoMedio);
			System.out.println(credito);
			break;
		case 2:
			System.out.println(saldoMedio);
			System.out.println(credito);
			break;
		case 3:
			System.out.println(saldoMedio);
			System.out.println(credito);
			break;
		}
	}
		
}

