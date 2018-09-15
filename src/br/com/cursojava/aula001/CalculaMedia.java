package br.com.cursojava.aula001;

//*Criar programa que armazene 3 notas com valores 10,9,8 e em seguida, calcule e apresente o resultado da média das notas*/

public class CalculaMedia {
	public static void main (String[] args){
		double nota1=10;
		double nota2=9;
		double nota3=8;
		
		System.out.printf( "(%f + %f + %f) / 3 = %f", nota1, nota2, nota3, (nota1 + nota2 + nota3) / 3);
	
	}

}
