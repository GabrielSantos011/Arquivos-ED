import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		
		
		MetodosChar metodos = new MetodosChar();
		
		metodos.adicionaFinal('W');
		JOptionPane.showMessageDialog(null, "O caractere removido foi: " + metodos.removeFinal());


	}

}
