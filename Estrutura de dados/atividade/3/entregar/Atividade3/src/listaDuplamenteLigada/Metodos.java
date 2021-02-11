package listaDuplamenteLigada;

import curso.Curso;

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
	
	public void adicionaInicio(Curso curso) {
		No novo = new No(curso);
		
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
	
	public void adicionaFinal(Curso curso) {
		No novo = new No(curso);
		
		if(vazia())
			adicionaInicio(curso);
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
	
	public Curso removeInicio() {
		Curso removido;
		
		if(vazia())
			removido = null;
		else {
			removido = inicio.curso;
			
			inicio=inicio.prox;
			
			if(inicio!=null)
				inicio.anterior=null;
			
			tamanho--;
		}// end if
		return removido;
	}// end remove inicio
	
	public Curso removeFinal() {
		Curso removido;
		
		if(vazia())
			removido = null;
		else {
			if(tamanho==1) {
				removido = inicio.curso;
				inicio=null;
			}else {
				No aux = noFinal(inicio);
				removido = aux.curso;
				No aux2 = aux.anterior;
				aux2.prox=null;
				aux=null;
			}
			tamanho--;
		}// end if
		return removido;
	}// end remove final
	
	public String percorre() {
		String lista="";
		lista = concatena(inicio,lista);
		return lista;
	}
	
	public String concatena(No aux, String lista) {
		if(aux!=null) {
			lista = lista + "\n"+aux.curso;
			concatena(aux.prox,lista);
		}
		
		return lista;
	}
}
