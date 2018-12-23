
public class Baralho extends Carta{
	//O baralho irá possuir 56 cartas com os coringas.
	Carta[] baralho = new Carta[55];
	Baralho(String a, String b) {
		for(int i = 0; i<13; i++) {
			baralho[i].naipe = "COPAS";	
		}
		baralho[0].nome = "As";
		baralho[1].nome = "Dois";
		baralho[2].nome = "Tres";
		baralho[3].nome = "Quatro";
		baralho[4].nome = "Cinco";
		baralho[5].nome = "Seis";
		baralho[6].nome = "Sete";
		baralho[7].nome = "Oito";
		baralho[8].nome = "Nove";
		baralho[9].nome = "Dez";
		baralho[10].nome = "Dama";
		baralho[11].nome = "Valete";
		baralho[12].nome = "Rei";
		for(int i = 13; i<26; i++) {
			baralho[i].nome = baralho[i-13].nome;	
			baralho[i].naipe = "PAUS";
		}
		for(int i = 26; i<39; i++) {
			baralho[i].nome = baralho[i-13].nome;	
			baralho[i].naipe = "OURO";
		}
		for(int i = 39; i<52; i++) {
			baralho[i].nome = baralho[i-13].nome;	
			baralho[i].naipe = "ESPADA";
		}
		for(int i = 52; i<55; i++) {
			baralho[i].nome = "Coringa";	
			baralho[i].naipe = "CORINGA";
		}
		
	}
	public void embaralha() {
		for(int i = 0; i < 55; i++) {
            int rnd = (int) (1 + Math.random() * 55); // gera um valor randomico de 0.0 ate menores q 1.0, multiplica por 100 e soma 1. Convertendo o resultado para int.
            baralho[i].nome = baralho[rnd].nome;// atribui o valor a cada indice do vetor
            baralho[i].naipe = baralho[rnd].naipe;
        }
	}
	public void Imprime() {
		for(int i = 0; i < 55; i++) {
			System.out.println(baralho[i].nome);
			System.out.println(baralho[i].naipe);
		}
	}
	public void daCarta() {
		for(int i = 0; i < 55; i++) {
			baralho[55-i].nome = baralho[i].nome;
            baralho[55-i].naipe = baralho[i].naipe;
		}
	}
}	
