package com.br.script;
import java.util.Scanner;
public class Area  {

public int h;
public int c;
public int r;
Scanner in = new Scanner(System.in);
public String nome;
public String Geometrica(){
    return nome;
}
public static void main(String[] args) {
    // TODO code application logic here
    Quadrado quadrado = new Quadrado();
    Retangulo retangulo = new Retangulo();
    Circulo circulo = new Circulo();
    Triangulo triangulo = new Triangulo();
    Scanner in = new Scanner(System.in);
    System.out.println("Digite a altura: ");
    int h = in.nextInt();
    System.out.println("Digite o comprimento: ");
    int c = in.nextInt();
    System.out.println("Digite o raio: ");
    int r = in.nextInt();
    quadrado.area = h*c;
    retangulo.area = h*c;
    triangulo.area = (h*c)/2;
    circulo.area = (r*r)*3.14;
    System.out.println("A area do quadrado é "+quadrado.area);
    System.out.println("A area do triangulo é "+triangulo.area);
    System.out.println("A area do retnagulo é "+retangulo.area);
    System.out.println("A area do circulo é "+circulo.area);
    
	}
}  

