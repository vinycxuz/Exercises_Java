import java.util.Scanner;
public class Carro {

	public static void main(String[] args) {
		float CustoFabrica, CustoDistribuidor, CustoImpostos, valorCarro;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor do carro: ");
		valorCarro = in.nextFloat();
		CustoDistribuidor = (28*valorCarro)/100;
		CustoImpostos = (45*valorCarro)/100;
		CustoFabrica = valorCarro - CustoDistribuidor - CustoImpostos;
		System.out.println("Valor de fábrica: "+CustoFabrica);
		
	}

}
