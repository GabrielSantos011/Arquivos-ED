import javax.swing.JOptionPane;

public class MetodosString {

	private String dados[];
	private int tamanho;

	public MetodosString() {
		dados = new String[5];
		tamanho = 0;
	}

	public boolean listaVazia() {

		if (tamanho <= 0) {
			return true;
		}

		return false;
	}

	public boolean listaCheia() {

		if (tamanho > dados.length) {
			return true;
		}

		return false;
	}

	public void adicionaInicio(String caractere) {

		String mensagem = " ";

		if (tamanho < dados.length) {

			for (int i = tamanho; i > 0; i--) {
				dados[i] = dados[i - 1];
			}

			dados[0] = caractere;
			tamanho++;

			for (int i = 0; i < dados.length; i++) {
				if (dados[i] == caractere) {
					mensagem += "Indice: " + i + " - " + dados[i] + "\n";
				}

			}

			JOptionPane.showMessageDialog(null, "caractere adicionado: \n" + mensagem);
		} else {
			JOptionPane.showMessageDialog(null, "Erro, a lista está cheia!");
		}

	}

	public void adicionaFinal(String caractere) {

		String mensagem = " ";

		if (tamanho < dados.length) {
			dados[tamanho] = caractere;
			tamanho++;
			for (int i = 0; i < dados.length; i++) {
				if (dados[i] == caractere) {
					mensagem += "Indice: " + i + " - " + dados[i] + "\n";
				}
			}

			JOptionPane.showMessageDialog(null, "caractere adicionado: \n" + mensagem);
		} else {
			JOptionPane.showMessageDialog(null, "Erro, a lista está cheia!");
		}

	}

	public void adicionaPosicaoEspecifica(String caractere, int posicao) {

		int i;

		if ((tamanho < dados.length) && (posicao < tamanho + 1) && (posicao >= 0)) {

			for (i = tamanho; i != posicao; i--) {

				if (i != 0) {
					dados[i] = dados[i - 1];
				}

			}
			dados[i] = caractere;
			tamanho++;
			JOptionPane.showMessageDialog(null, "Caractere adicionado\n " + "Posição: " + posicao + " - " + caractere);

		} else {
			JOptionPane.showMessageDialog(null, "Erro, posição não encontrada ou a lista está cheia!");
		}
	}

	public String removeInicio() {

		String retorno = "0";

		if (tamanho >= 1) {

			retorno = dados[tamanho - 1];
			for (int i = 1; i < tamanho; i++) {
				dados[i - 1] = dados[i];
			}
			tamanho--;
		}
		return retorno;

	}

	public String removeFinal() {

		String retorno = "0";

		if (tamanho >= 1) {

			retorno = dados[tamanho - 1];
			for (int i = 0; i < tamanho; i++) {
				if (i == tamanho - 1)
					tamanho--;
			}

		}
		return retorno;

	}

	public String removePosicaoEspecifica(String caractere, int posicao) {

		String retorno = "0";

		if (posicao < tamanho && tamanho > 1) {
			retorno = dados[posicao];

			for (int i = posicao; i < tamanho - 1; i++) {
				dados[i] = dados[i + 1];
			}

			tamanho--;
		}

		return retorno;

	}

	public void metodoA(String valor, int pos) {

		String mensagem = " ";

		if (dados.length == tamanho) {
			JOptionPane.showMessageDialog(null, "ERRO!");
		} else {
			if (pos <= 0 || pos > tamanho + 1) {
				JOptionPane.showMessageDialog(null, "Posição inválida!");
			} else {
				if (pos == 1) {
					adicionaInicio(valor);
				} else {
					if (pos == tamanho) {
						adicionaFinal(valor);
					} else {
						for (int i = tamanho; i >= pos; i--) {
							dados[i] = dados[i - 1];
							dados[pos - 1] = valor;
							tamanho++;
						}

						JOptionPane.showMessageDialog(null, "Indice: " + (pos - 1) + " - " + valor + "\n");
					}

				}
			}
		}

	}

	public String percorre() {
		String mensagem = " ";

		for (int i = 0; i < tamanho; i++) {
			mensagem += "\n" + dados[i];
		}
		return mensagem;
	}

	public String concatenaLista() {

		String caracteres = " ";

		for (int i = 0; i < dados.length; i++) {

			if (dados[i] != null) {
				caracteres += dados[i];
			}

		}

		return caracteres;

	}

}
