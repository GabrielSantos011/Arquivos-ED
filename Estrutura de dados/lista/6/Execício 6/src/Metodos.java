import javax.swing.JOptionPane;

public class Metodos {
	
	private No inicio;
	private int tamanho=0;
	
	public Metodos() {
		inicio = null;
	}
	
	public boolean vazia() {
		if(inicio==null)
			return true;
		else
			return false;
	}
	
	public void adicionaInicio(Aluno aluno) {
		No novo = new No(aluno);
		
		if(vazia()) {
			inicio = novo;
			inicio.anterior=null;
			inicio.prox=null;
		}else {
			novo.anterior=null;
			novo.prox=inicio;
			inicio.anterior=novo;
		}//end if
		tamanho++;
	}//end adiciona inicio
	
	public void adicionaFinal(Aluno aluno) {
		No novo = new No(aluno);
		
		if(vazia())
			adicionaInicio(aluno);
		else {
			No aux = noFinal(inicio);
			aux.prox=novo;
			novo.anterior=aux;
			novo.prox=null;
		}// end if
		tamanho++;
	}//end adiciona Final
	
	public No noFinal(No aux) {
		if(aux.prox!=null)
			return noFinal(aux.prox);
		
		return aux;
	}// end no final
	
	public Aluno removeInicio() {
		Aluno removido;
		
		if(vazia())
			removido = null;
		else {
			removido = inicio.aluno;
			
			inicio=inicio.prox;
			
			if(inicio!=null)
				inicio.anterior=null;
			
			tamanho--;
		}// end if
		return removido;
	}// end remove inicio
	
	public Aluno removeFinal() {
		Aluno removido;
		
		if(vazia())
			removido = null;
		else {
			if(tamanho==1) {
				removido = inicio.aluno;
				inicio=null;
			}else {
				No aux = noFinal(inicio);
				removido = aux.aluno;
				No aux2 = aux.anterior;
				aux2.prox=null;
				aux=null;
			}
			tamanho--;
		}// end if
		return removido;
	}// end remove final
	
	//AQUI VEM O BUBBLE SORT RECURSIVO
	
	public Aluno buscaSequencial(String nome) {
		Aluno achado;
		
		if(vazia())
			achado=null;
		else {
			achado = busca(inicio,nome);
		}
		return achado;
	}//end busca sequencial
	
	public Aluno busca(No aux, String nome) {
		Aluno aluno = aux.aluno;
		if(aluno.getNome()!=nome) {
			aluno =null;
			if(aux.prox!=null)
				return busca(aux.prox, nome);
		}
		
		return aluno;
	}// end busca
	
	public String percorre() {
		String lista="";
		lista = concatena(inicio,lista);
		return lista;
	}
	
	public String concatena(No aux, String lista) {
		if(aux!=null) {
			lista = lista + "\n"+aux.aluno;
			concatena(aux.prox,lista);
		}
		
		return lista;
	}
}
