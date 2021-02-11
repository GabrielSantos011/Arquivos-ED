package pilhaDinamica;

import curso.Curso;

public class No {
	public Curso curso;
	public No prox;
	No anterior;

	public No(Curso curso) {
		this.curso=curso;
		prox=null;
	}
}
