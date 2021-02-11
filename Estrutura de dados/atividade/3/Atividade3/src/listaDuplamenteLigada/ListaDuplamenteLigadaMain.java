package listaDuplamenteLigada;

import javax.swing.JOptionPane;

import curso.Curso;

public class ListaDuplamenteLigadaMain {
	
public static void main(String[] args) {
		
int opc = 0;
	
	Metodos metodo = new Metodos();
	Curso curso= new Curso();
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - adicionar no início da lista\n"
					+ "2 - adicionar no final da lista\n"
					+ "3 - remover do início da lista\n"
					+ "4 - remover do final da lista\n"
					+ "5 - percorrer a lista concatenando os elementos em uma String\n"
					+ "9 - fim!"
					+ "Digite a opção desejada: "));
			
			
			switch(opc) {
			case 1:
				curso.id = Integer.parseInt(JOptionPane.showInputDialog("Qual o id do curso?"));
				curso.nome =JOptionPane.showInputDialog("Qual o curso?");
				curso.area = JOptionPane.showInputDialog("Qual a área do curso?");
				curso.quantidadeSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantos semestres?"));
				curso.periodo = (JOptionPane.showInputDialog("Qual o período do curso?"));
				metodo.adicionaInicio(curso);
				break;
				
			case 2:
				curso.id = Integer.parseInt(JOptionPane.showInputDialog("Qual o id do curso?"));
				curso.nome =JOptionPane.showInputDialog("Qual o curso?");
				curso.area = JOptionPane.showInputDialog("Qual a área do curso?");
				curso.quantidadeSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantos semestres?"));
				curso.periodo = (JOptionPane.showInputDialog("Qual o período do curso?"));
				metodo.adicionaFinal(curso);
				break;
				
			case 3:
				metodo.removeInicio();
				break;
				
			case 4:
				metodo.removeFinal();
				break;
				
			case 5:
				String tudo="";
				tudo = metodo.percorre();
				JOptionPane.showMessageDialog(null, tudo);
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null,"Obrigado por usar a aplicação!");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida");
				
			}
			
		}//end while
		
	}// end main

}
