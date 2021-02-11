public class Aluno {
	
	private int id;
	private String nome;
	private String curso;
	
	public  Aluno(int id, String nome, String curso) {
		this.id=id;
		this.nome=nome;
		this.curso=curso;
	}
	
	public String getNome() {
		return nome;
	}
	
}
