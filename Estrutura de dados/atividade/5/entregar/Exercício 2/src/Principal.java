import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int opc = 0;
		Lista lista = new Lista();
		Curso curso = new Curso();
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("digite:\n"
					+ "1-Adicionar no final\n"
					+ "2-Remover do final\n"
					+ "3-mostrar\n"
					+ "9-finalizar"));
			
			switch(opc) {
			case 1:
				lista.adicionaFinal(curso.cadastro());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "O curso removido foi o de "+lista.removeFinal().getNome());
				break;
			case 3:
				String mostra=lista.percorre();
				JOptionPane.showMessageDialog(null, mostra);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "inválido");
			}
		}
		
	}
	
}
