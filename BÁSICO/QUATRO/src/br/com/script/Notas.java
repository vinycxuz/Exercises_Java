package br.com.script;
import java.util.Scanner;
public class Notas extends Aluno {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Aluno[] aluno = new Aluno[10];
		int i;	
		float soma = 0;
		for (i = 0; i<10; i++) {
			System.out.println("Digite seu nome: ");
			aluno[i].nome = in.next();
			System.out.println("Digite sua nota: ");
			aluno[i].nota = in.nextFloat();
			soma = soma + aluno[i].nota;
		
		}
		float media = soma/10;
		for(i = 0;i<10;i++) {
			if(aluno[i].nota > media)
				System.out.println(aluno[i].nome);
		
		}
		
	}

}
