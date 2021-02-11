package Exercicio_01;

import java.util.Arrays;

public class QuickSort {

	private int iteracao;

	public QuickSort() {
		iteracao = 0;

	}

	public void quickSort(int vet[], int ini, int fim) {
		int divisao;

		if (ini < fim) {
			divisao = particao(vet, ini, fim);
			quickSort(vet, ini, divisao - 1);
			quickSort(vet, divisao + 1, fim);

		}

	}

	public int particao(int vet[], int ini, int fim) {

		int i = ini;
		int f = fim;
		int pivo = vet[(i+f)/2];
		int aux;

		while (i < f) {
			while (i < f && vet[i] < pivo) {
				i++;

			}

			while (pivo < vet[f]) {
				--f;

			}

			if (i < f) {
				aux = vet[i];
				vet[i] = vet[f];
				vet[f] = aux;

			}
		}

		return f;
	}

}
