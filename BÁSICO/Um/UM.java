
import java.util.Scanner;
//COMO O ALGORITMO � APENAS A OBSERVA��O DA L�GICA, N�O FOI COLOCADO VALORES A SEREM ADICIONADOS NAS VARI�VEIS.
class Cartao{
	public int idade; 
	public char sexo;
	public char olhos;
	public char cabelo;
	int IdadeSuprema(int n) {
		int maior = 0;
			for(int i = 0; i>n;i++) {
			if (idade > maior)
				maior = idade;
	}
	return maior;
}
}
public class UM {
	public static void main(String[] args){
		Cartao cartao = new Cartao();
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Digite a quantidade de habitantes: ");
		n = in.nextInt();
		System.out.println(cartao.IdadeSuprema(n));
		int qntd = 0;
		float p = 0;
		for(int i = 0; i<n; i++) {
			if(cartao.sexo == 'F') {
				if(cartao.olhos == 'V') {
					if(cartao.cabelo == 'L') {
						if(cartao.idade >= 18 && cartao.idade <= 35) {
							qntd = qntd + 1;
						}
					}
				}
			}
		}
	p = (qntd*100)/n;
	}	
}

