package ex3;

import javax.swing.JOptionPane;

public class ListaDeAlunos {

	private Aluno inicio;

	public ListaDeAlunos() {
		this.inicio = null;
	}

	public void adicionaInicio(int ra, String nome, String turma, String semestre) {
		Aluno novo = new Aluno(ra, nome, turma, semestre);

		if (inicio == null) {
			inicio = novo;
			JOptionPane.showMessageDialog(null, nome + " foi adicionado no in�cio da lista");

		} else {

			Aluno aux;
			aux = inicio;

			novo.setProximo(inicio);
			inicio = novo;
			JOptionPane.showMessageDialog(null, nome + " foi adicionada no in�cio da lista");

		}
	}

	public void adicionaFinal(int ra, String nome, String turma, String semestre) {

		if (inicio == null) {
			Aluno novo = new Aluno(ra, nome, turma, semestre);
			inicio = novo;
		} else {

			Aluno aux = inicio;

			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}

			Aluno novo = new Aluno(ra, nome, turma, semestre);

			aux.setProximo(novo);
		}

	}

	public String removeInicio() {

		String aluno = null;

		if (inicio == null) {
			return aluno;
		} else {

			Aluno aux = inicio;
			aluno = aux.getNome();
			inicio = inicio.getProximo();
		}

		return aluno;
	}

	public String removeFinal() {

		String aluno = null;

		if (inicio == null) {
			return aluno;
		} else {

			if (inicio.getProximo() == null) {
				aluno = inicio.getNome();
				inicio = null;
			} else {

				Aluno aux = inicio;
				Aluno auxBackup = inicio;

				while (aux.getProximo() != null) {
					auxBackup = aux;
					aux = aux.getProximo();
				}

				aluno = aux.getNome();
				auxBackup.setProximo(null);
			}

		}

		return aluno;
	}

	public void adcionaMeio(int ra, String nome, String turma, String semestre) {

		Aluno novo = new Aluno(ra, nome, turma, semestre);
		Aluno aux = inicio;
		int tamanho = 0;
		int meio = 0;
		int comeca = 0;

		if (inicio == null) {
			inicio = novo;
		} else {
			if (inicio.getProximo() == null) {
				inicio.setProximo(novo);;

			}else {
				
				Aluno auxBackup = inicio;
				Aluno auxAluno = inicio;
				
				while (auxBackup != null) {
					auxBackup = auxBackup.getProximo();
					tamanho++;
				}
				
				meio = tamanho / 2;
				
				while (comeca < meio - 1) {
					auxAluno = aux;
					aux = aux.getProximo();
					comeca++;
				}


				if (comeca == meio - 1) {
					novo.setProximo(aux.getProximo());
					aux.setProximo(novo);
				} 
				
			}
			

		}
		
	}

	public String removeMeio() {

		Aluno aux = inicio;
		String aluno = null;
		int tamanho = 1;
		int comeca = 0;
		int meio = 0;

		if (inicio == null) {
			return aluno;
		} else {

			if (inicio.getProximo() == null) {
				aluno = inicio.getNome();
				inicio = null;

			} else {

				Aluno auxBackup = inicio;
				Aluno auxAluno = inicio;

				while (auxBackup != null) {
					auxBackup = auxBackup.getProximo();
					tamanho++;
				}

				meio = tamanho / 2;

				while (comeca < meio - 1) {
					auxAluno = aux;
					aux = aux.getProximo();
					comeca++;
				}


				if (comeca == meio - 1) {
					aluno = aux.getNome();
					auxAluno.setProximo(aux.getProximo());
				} else {
					aluno = " ";
				}

			}

		}

		return aluno;
	}

	public boolean listaVazia() {
		return (inicio == null);
	}

	public String toString() {


		String mostra = "";
		Aluno aux = inicio;


		if (inicio == null) {
			mostra = "A lista ainda n�o possui nenhum aluno.";
		} else {

			while (aux != null) {

				mostra += "RA: " 
				+ aux.getRa() + "\n";
				mostra += "Nome: " 
				+ aux.getNome() + "\n";
				mostra += "Turma: " 
				+ aux.getTurma() + "\n";
				mostra += "Semestre: " 
				+ aux.getSemestre() + "\n";
				mostra += "---"+"\n";
				aux = aux.getProximo();

			}

		}

		return mostra;

	}

}