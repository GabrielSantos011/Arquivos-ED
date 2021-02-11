import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		MetodosString metodos = new MetodosString();

		int opc = 0, posicao = 0;
		String caractere;

		while (opc != 11) {

			opc = Integer.parseInt(JOptionPane
					.showInputDialog("Cadastro\n 1 - Adiciona Inicio\n 2 - Adiciona Final\n 3 - Adiciona posição "
							+ "específica\n 4 - Remove inicio\n 5 - Remove Final\n 6 - Remove em posição específica\n 7 - Percorre e concatena lista\n 8 - "
							+ "Verifica lista vazia\n 9 - Verifica lista cheia\n 10 - Mostra Lista\n 11 - Finaliza"));

			switch (opc) {

			case 1:

				caractere = JOptionPane.showInputDialog("Insira o texto desejada: ");
				metodos.adicionaInicio(caractere);
				break;

			case 2:
				caractere = JOptionPane.showInputDialog("Insira o texto desejado: ");
				metodos.adicionaFinal(caractere);
				break;

			case 3:
				caractere = JOptionPane.showInputDialog("Insira o texto desejado: ");
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição desejada: "));
				posicao = posicao - 1;
				metodos.adicionaPosicaoEspecifica(caractere, posicao);
				break;

			case 4:

				JOptionPane.showMessageDialog(null, "O conteúdo removido foi: " + metodos.removeInicio());

				break;

			case 5:

				JOptionPane.showMessageDialog(null, "O conteúdo removido foi: " + metodos.removeFinal());

				break;

			case 6:
				caractere = JOptionPane.showInputDialog("Insira o texto desejado: ");
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição desejada: "));

				JOptionPane.showMessageDialog(null,
						"O caractere removido foi: " + metodos.removePosicaoEspecifica(caractere, posicao));
				break;

			case 7:

				JOptionPane.showMessageDialog(null, "Textos concatenados: " + metodos.concatenaLista());
				break;

			case 8:
				if (metodos.listaVazia()) {
					JOptionPane.showMessageDialog(null, "Verdadeiro: A lista está vazia");
				} else {
					JOptionPane.showMessageDialog(null, "Falso: A lista não está vazia");
				}
				break;

			case 9:
				if (metodos.listaCheia()) {
					JOptionPane.showMessageDialog(null, "Verdadeiro: A lista cheia");
				} else {
					JOptionPane.showMessageDialog(null, "Falso: A lista não está cheia");
				}
				break;

			case 10:
				JOptionPane.showMessageDialog(null, metodos.percorre());

				break;

			case 11:
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				break;

			default:

				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;

			}
		}

	}

}
