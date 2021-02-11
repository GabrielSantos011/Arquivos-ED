import javax.swing.JOptionPane;

public class Curso {
	private int id;
	private String nome;
	private String semestre;
	private int duracao;
	
	public  Curso() {
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSemestre() {
		return semestre;
	}



	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}



	public int getDuracao() {
		return duracao;
	}



	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}



	public Curso cadastro() {
		Curso curso = new Curso();
		curso.setId(Integer.parseInt(JOptionPane.showInputDialog("adicione o id")));
		curso.setNome(JOptionPane.showInputDialog("adiciona o nome"));
		curso.setSemestre(JOptionPane.showInputDialog("adiciona o semestre"));
		curso.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("adicione a duração")));
		return curso;
	}
}
