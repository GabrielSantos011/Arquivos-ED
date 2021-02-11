package Exercicio_02;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		MergeSort merge = new MergeSort();

		int[] lista = { 11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78 };

		int fim = lista.length;

		System.out.println(Arrays.toString(lista));

		merge.mergeSortRecursivo(lista, 0, fim - 1);

		System.out.println(Arrays.toString(lista));

	}

	
}
