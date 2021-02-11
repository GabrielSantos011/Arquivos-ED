import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {

		MetodosChar metodos = new MetodosChar();
		int opc = 0;

		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar \n 2- Mostra Lista \n 9- Sair"));

			switch (opc) {

			case 1:
				char valor = JOptionPane.showInputDialog("Insira o valor desejado: ").charAt(0);
				;
				int pos = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição desejado: "));
				metodos.metodoA(valor, pos);
				break;

			case 2:
				JOptionPane.showMessageDialog(null, metodos.percorre());
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;

			}

		}

	}

}
