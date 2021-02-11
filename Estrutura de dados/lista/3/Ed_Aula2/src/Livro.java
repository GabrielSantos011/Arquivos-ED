
public class Livro {


	private String name;
	private int qtd;
	Livro(){
		this.name = "";
		this.qtd = 0;
	}
	
	public String getNome(){
		return this.name;
	}
	
	public void setNome(String i){
		this.name = i;
	}
	
	public int getQtd(){
		return this.qtd;
	}
	
	public void setQtd(int i){
		this.qtd = i;
	}
	
}
