package pilhaDinamica;

import javax.swing.JOptionPane;

import curso.Curso;

public class PilhaDinamicaMain {

	public static void main(String[] args) {

		int opc = 0;
		
		Metodos metodo = new Metodos();
		Curso curso= new Curso();
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
				
					"1 - adicionar no final da pilha\n"
					+ "2 - remover do final da pilha\n"
					+ "3 - percorrer a lista concatenando os elementos em uma String\n"
					+ "9 - fim!"
					+ "Digite a op��o desejada: "));
			
			
			switch(opc) {
			case 1:
				curso.id = Integer.parseInt(JOptionPane.showInputDialog("Qual o id do curso?"));
				curso.nome =JOptionPane.showInputDialog("Qual o curso?");
				curso.area = JOptionPane.showInputDialog("Qual a �rea do curso?");
				curso.quantidadeSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantos semestres?"));
				curso.periodo = (JOptionPane.showInputDialog("Qual o per�odo do curso?"));
				metodo.adicionaFinal(curso);
				break;
				
			case 2:
				metodo.removeFinal();
				break;
				
			case 3:
				String tudo="";
				tudo = metodo.percorre();
				JOptionPane.showMessageDialog(null, tudo);
				
			case 9:
				JOptionPane.showMessageDialog(null,"Obrigado por usar a aplica��o!");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida");
				
			}
			
		}//end while
		
	}// end main
		
}