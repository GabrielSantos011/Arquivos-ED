package Exercicio_02;

public class MergeSort {

	private int iteracao;

	public MergeSort() {
		iteracao = 0;
	}

	public void mergeSortRecursivo(int lista[], int inicio, int fim) {

		if (inicio >= fim) {
			return;
		}

		int meio = (inicio + fim) / 2;
		mergeSortRecursivo(lista, inicio, meio);
		mergeSortRecursivo(lista, meio + 1, fim);
		mesclar(lista, inicio, meio, meio + 1, fim);

	}

	public void mesclar(int lista[], int inicioA, int fimA, int inicioB, int fimB) {
		int i1 = inicioA;
		int i2 = inicioB;
		int iAux = inicioA;
		int listaAux[] = new int[lista.length];

		while (i1 <= fimA && i2 <= fimB) {
			if (lista[i1] <= lista[i2]) {
				listaAux[iAux++] = lista[i1++];
			} else {
				listaAux[iAux++] = lista[i2++];
			}
		}

		while (i1 <= fimA) {
			listaAux[iAux++] = lista[i1++];
		}

		while (i2 <= fimB) {
			listaAux[iAux++] = lista[i2++];
		}

		for (int i = inicioA; i <= fimB; i++) {
			lista[i] = listaAux[i];

		}

	}

}
