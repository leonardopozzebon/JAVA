// Criar um vetor de 5 posições. Entrar com os valores para cadas posição via teclado e mostrar a
// soma dos valores digitados.

package com.pozzebon.projetojava;

import java.util.Scanner;
public class ForEach {

	public static void main(String[] args) {
		
		int[] numero = new int[5];
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int cont=0; cont<numero.length; cont++) {
			System.out.println ("Entre com o valor " +(cont+1));
			numero[cont] = scan.nextInt();
		}
		for (int numeros : numero) {
			soma += numeros;
		}
		System.out.println ("A soma dos numeros informados é: " + soma);
	}

}
