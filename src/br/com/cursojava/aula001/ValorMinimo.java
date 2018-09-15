package br.com.cursojava.aula001;



public class ValorMinimo {
	public static void main(String[] args){
		int numero1=10;
		int numero2=7;
		int numero3=20;
		int numero4=30;
		
		int min = Math.min(numero1, numero2);
		min = Math.min(min, numero3);
		min = Math.min(min, numero4);
		
		System.out.println("menor:"+ min);
	}
}
