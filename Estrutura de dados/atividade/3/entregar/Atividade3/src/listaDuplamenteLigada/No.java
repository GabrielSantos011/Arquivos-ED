package listaDuplamenteLigada;

import curso.Curso;

public class No {
	public Curso curso;
	public No prox;
	public No anterior;

	public No(Curso curso) {
		this.curso=curso;
		prox=null;
	}
}
