package Exercicio_01;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		QuickSort quick = new QuickSort();

		int[] vetor = { 11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78 };

		int fim = vetor.length;

		System.out.println(Arrays.toString(vetor));

		quick.quickSort(vetor, 0, fim - 1);

		System.out.println(Arrays.toString(vetor));

	}

}
