package fila;

import curso.Curso;

public class No {
	Curso curso;
	No prox;
	No anterior;

	public No(Curso curso) {
		this.curso=curso;
		prox=null;
	}
}
