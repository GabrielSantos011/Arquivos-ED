package ex3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		ListaDeAlunos listaAlunos = new ListaDeAlunos();

		int opc = 0;
		int ra;
		String nome, turma, semestre;
		String aluno = "";
		
		
		//TESTE DE MESA
		
		//adiciona inicio
		ra = Integer.parseInt(JOptionPane.showInputDialog("RA do aluno:"));
		nome = JOptionPane.showInputDialog("Nome do aluno: ");
		turma = JOptionPane.showInputDialog("Turma do aluno: ");
		semestre = JOptionPane.showInputDialog("Semestre: ");
		listaAlunos.adicionaInicio(ra, nome, turma, semestre);
		JOptionPane.showMessageDialog(null, "alunos\n" + listaAlunos);
		//mostra o valor adicionado
		
		
		//adiciona final
		ra = Integer.parseInt(JOptionPane.showInputDialog("RA do aluno:"));
		nome = JOptionPane.showInputDialog("Nome do aluno: ");
		turma = JOptionPane.showInputDialog("Turma do aluno: ");
		semestre = JOptionPane.showInputDialog("Semestre: ");
		listaAlunos.adicionaFinal(ra, nome, turma, semestre);
		JOptionPane.showMessageDialog(null, "alunos\n" + listaAlunos);
		//mostra o valor adicionado
		
		
		//adiciona meio
		ra = Integer.parseInt(JOptionPane.showInputDialog("RA do aluno:"));
		nome = JOptionPane.showInputDialog("Nome do aluno: ");
		turma = JOptionPane.showInputDialog("Turma do aluno: ");
		semestre = JOptionPane.showInputDialog("Semestre: ");
		listaAlunos.adcionaMeio(ra, nome, turma, semestre);
		JOptionPane.showMessageDialog(null, "alunos\n" + listaAlunos);
		//mostra o valor adicionado
		
		
		//remove meio
		aluno = listaAlunos.removeMeio();
		if (aluno == null) {
			JOptionPane.showMessageDialog(null,
					"Nenhum aluno foi removido, verifique a op��o 7 do menu de op��es.");
		} else if (aluno == " ") {
			JOptionPane.showMessageDialog(null, "Posi��o inv�lida!");
		}
		JOptionPane.showMessageDialog(null, "alunos\n" + listaAlunos);
		//mostra o valor removido
		
		//remove inicio
		aluno = listaAlunos.removeInicio();

		if (aluno == null) {
			JOptionPane.showMessageDialog(null,
					"Nenhum aluno foi removido");
		}
		JOptionPane.showMessageDialog(null, "alunos\n" + listaAlunos);
		//mostra o valor removido
		
		//remove final
		aluno = listaAlunos.removeFinal();
		if (aluno == null) {
			JOptionPane.showMessageDialog(null,
					"Nenhum aluno foi removido, verifique a op��o 7 do menu de op��es.");
		}
		JOptionPane.showMessageDialog(null, "alunos\n" + listaAlunos);
		//mostra o valor removido
		
		//esta vazia?
		if (listaAlunos.listaVazia()) {
			JOptionPane.showMessageDialog(null, "A lista est� vazia!");
		} else {
			JOptionPane.showMessageDialog(null, "A lista n�o est� vazia.");
		}
		
		

		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog("1-Adicionar no in�cio\n"
					+ "2-Adicionar no Final\n"
					+ "3-Remover no in�cio\n"
					+ "4-Remover no Final\n"
					+ "5-Remover do meio da lista\n"
					+ "6-Adicionar no meio da lista\n"
					+ "7-Verificar se lista est� vazia\n"
					+ "8-Mostrar lista atual\n"
					+ "9-Finalizar"));

			switch (opc) {
			case 1:
				ra = Integer.parseInt(JOptionPane.showInputDialog("RA do aluno:"));
				nome = JOptionPane.showInputDialog("Nome do aluno: ");
				turma = JOptionPane.showInputDialog("Turma do aluno: ");
				semestre = JOptionPane.showInputDialog("Semestre: ");
				listaAlunos.adicionaInicio(ra, nome, turma, semestre);
				break;

			case 2:
				ra = Integer.parseInt(JOptionPane.showInputDialog("RA do aluno:"));
				nome = JOptionPane.showInputDialog("Nome do aluno: ");
				turma = JOptionPane.showInputDialog("Turma do aluno: ");
				semestre = JOptionPane.showInputDialog("Semestre: ");
				listaAlunos.adicionaFinal(ra, nome, turma, semestre);
				break;

			case 3:
				aluno = listaAlunos.removeInicio();

				if (aluno == null) {
					JOptionPane.showMessageDialog(null,
							"Nenhum aluno foi removido");
				}
				break;

			case 4:
				aluno = listaAlunos.removeFinal();
				if (aluno == null) {
					JOptionPane.showMessageDialog(null,
							"Nenhum aluno foi removido, verifique a op��o 7 do menu de op��es.");
				}
				break;

			case 5:
				aluno = listaAlunos.removeMeio();
				if (aluno == null) {
					JOptionPane.showMessageDialog(null,
							"Nenhum aluno foi removido, verifique a op��o 7 do menu de op��es.");
				} else if (aluno == " ") {
					JOptionPane.showMessageDialog(null, "Posi��o inv�lida!");
				}

				break;
				
			case 6:
				ra = Integer.parseInt(JOptionPane.showInputDialog("RA do aluno:"));
				nome = JOptionPane.showInputDialog("Nome do aluno: ");
				turma = JOptionPane.showInputDialog("Turma do aluno: ");
				semestre = JOptionPane.showInputDialog("Semestre: ");
				listaAlunos.adcionaMeio(ra, nome, turma, semestre);
				break;


			case 7:
				if (listaAlunos.listaVazia()) {
					JOptionPane.showMessageDialog(null, "A lista est� vazia!");
				} else {
					JOptionPane.showMessageDialog(null, "A lista n�o est� vazia.");
				}
				break;

			case 8:
				JOptionPane.showMessageDialog(null, "alunos\n" + listaAlunos);
				break;

			default:
				break;
			}
		}

	}

}