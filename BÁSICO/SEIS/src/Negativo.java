import java.util.Random;
public class Negativo {
	
	int[] n = new int[100];
	int soma = 0;
	int retorno(int n[]) {
	for (int i = 0; i<100; i++) {
		Random g = new Random();
		n[i] = g.nextInt();
		if(n[i] < 0)
			soma = soma + 1;
		}
	return soma;
	}
}