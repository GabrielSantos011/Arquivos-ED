import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		MetodosChar metodos = new MetodosChar();

		int opc = 0, posicao = 0;
		char caractere;

		while (opc != 11) {

			opc = Integer.parseInt(JOptionPane
					.showInputDialog("Cadastro\n 1 - Adiciona Inicio\n 2 - Adiciona Final\n 3 - Adiciona posição "
							+ "específica\n 4 - Remove inicio\n 5 - Remove Final\n 6 - Remove em posição específica\n 7 - Percorre e concatena lista\n 8 - "
							+ "Verifica lista vazia\n 9 - Verifica lista cheia\n 10 - Mostra Lista\n 11 - Finaliza"));

			switch (opc) {

			case 1:

				caractere = JOptionPane.showInputDialog("Insira o caractere desejado: ").charAt(0);
				metodos.adicionaInicio(caractere);
				break;

			case 2:
				caractere = JOptionPane.showInputDialog("Insira o caractere desejado: ").charAt(0);
				metodos.adicionaFinal(caractere);
				break;

			case 3:
				caractere = JOptionPane.showInputDialog("Insira o caractere desejado: ").charAt(0);
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição desejada: "));
				posicao = posicao - 1;
				metodos.adicionaPosicaoEspecifica(caractere, posicao);
				break;

			case 4:

				JOptionPane.showMessageDialog(null, "O caractere removido foi: " + metodos.removeInicio());

				break;

			case 5:

				JOptionPane.showMessageDialog(null, "O caractere removido foi: " + metodos.removeFinal());

				break;

			case 6:
				caractere = JOptionPane.showInputDialog("Insira o caractere desejado: ").charAt(0);
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição desejada: "));

				JOptionPane.showMessageDialog(null,
						"O caractere removido foi: " + metodos.removePosicaoEspecifica(caractere, posicao));
				break;

			case 7:

				JOptionPane.showMessageDialog(null, "Caracteres concatenados: " + metodos.concatenaLista());
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
