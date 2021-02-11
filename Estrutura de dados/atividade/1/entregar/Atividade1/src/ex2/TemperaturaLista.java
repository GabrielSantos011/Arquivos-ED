package ex2;

import javax.swing.JOptionPane;

public class TemperaturaLista {
	
	private No inicio;

	public TemperaturaLista() {
		this.inicio = null;
	}

	public void adicionarInicio(double temperatura) {

		No novo = new No();
		novo.setTemperatura(temperatura);
		novo.setProximo(inicio);

		if (inicio == null) {
			inicio = novo;
			
		} else {
			No aux;
			aux = inicio;

			novo.setTemperatura(temperatura);
			novo.setProximo(inicio);
			inicio = novo;
			

		}

	}

	public void adicionarFinal(double temperatura) {

		if (inicio == null) {
			No novo = new No();
			novo.setTemperatura(temperatura);
			inicio = novo;

		} else {

			No aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}

			No novo = new No();
			novo.setTemperatura(temperatura);
			aux.setProximo(novo);

		}

	}

	public double removeInicio() {

		No aux = inicio;
		double elemento = -1000;

		if (inicio == null) {
			return elemento;

		} else {
			elemento = inicio.getTemperatura();
			inicio = inicio.getProximo();

		}

		return elemento;
	}

	public double removeFinal() {

		double elementoTemperatura = -1000;
		if (inicio == null) {
			return elementoTemperatura;
		} else {

			if (inicio.getProximo() == null) {
				elementoTemperatura = inicio.getTemperatura();
				inicio = null;
				return elementoTemperatura;

			} else {

				No aux = inicio;
				No aux2 = inicio;

				while (aux.getProximo() != null) {
					aux2 = aux;
					aux = aux.getProximo();
				}

				elementoTemperatura = aux.getTemperatura();
				aux2.setProximo(null);
			}

		}

		return elementoTemperatura;

	}

	public void escolhePosicao(double temperatura, int posicao) {

		No novo = new No();
		novo.setTemperatura(temperatura);

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "A operação não pode ser realizada");
		} else {

			if (posicao == 1) {
				adicionarInicio(temperatura);
			} else {

				No aux = inicio;
				int contador = 1;

				while (aux != null && contador < posicao - 1) {
					aux = aux.getProximo();
					contador++;
				}

				if (contador == posicao - 1) {
					novo.setProximo(aux.getProximo());
					aux.setProximo(novo);
					
				} else {

					JOptionPane.showMessageDialog(null, "Posição inválida!");
				}
			}
		}
	}

	public double removePosicao(int posicao) {

		No aux = inicio;
		double elementoTemperatura = -1000;
		int cont = 1;

		if (inicio == null) {

			return elementoTemperatura;
		} else {
			if (posicao == 1) {
				elementoTemperatura = removeInicio();
			} else {

				while (aux.getProximo() != null) {
					aux = aux.getProximo();
					cont++;
				}

				if (posicao > cont || posicao < 0 || posicao == 0) {
					elementoTemperatura = -2000;
					return elementoTemperatura;

				} else if (posicao == cont) {
					return removeFinal();

				} else {

					No auxInicio = aux;

					while (cont < posicao) {
						auxInicio = aux;
						aux = aux.getProximo();
						cont++;
					}

					elementoTemperatura = aux.getTemperatura();
					auxInicio.setProximo(aux.getProximo());

				}
			}
		}

		return elementoTemperatura;

	}

	public boolean listaVazia() {
		return (this.inicio == null);
	}

	public String toString() {

		String mostraLista = "";
		No auxiliar = inicio;


		if (inicio == null) {
			mostraLista = "A lista ainda não possui nenhum elemento.";
		} else {

			while (auxiliar != null) {

				mostraLista += auxiliar.getTemperatura() + "\n";
				auxiliar = auxiliar.getProximo();

			}

		}

		return mostraLista;
	
	}
}
