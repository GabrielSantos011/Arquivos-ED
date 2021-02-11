package fila;

import curso.Curso;
import fila.No;

public class Metodos {
	
	private No inicio;
	private No finalPilha;
	private int tamanho=0;
	
	public Metodos() {
		inicio = null;
		finalPilha=null;
	}
	
	public boolean vazia() {
		if(inicio==null)
			return true;
		else
			return false;
	}
	
	
	public void adicionaFinal(Curso curso) {
		No novo = new No(curso);
		
		if(vazia()) {
			inicio = novo;
			inicio.prox=null;
			finalPilha=inicio;
		} else {
			No aux = noFinal(inicio);
			aux.prox=novo;
			novo.prox=null;
			finalPilha=novo;
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
			
			
			tamanho--;
		}// end if
		return removido;
	}// end remove inicio
	
	public String percorre() {
		String pilha="";
		pilha = concatena(inicio,pilha);
		return pilha;
	}
	
	public String concatena(No aux, String pilha) {
		if(aux!=null) {
			pilha +="\n"+aux.curso;
			concatena(aux.prox,pilha);
		}
		
		return pilha;
	}
}