package exercicio3;
import javax.swing.JOptionPane;

public class Ex2 {
		
	public Ex2() {
		super();
	}
	
	private static int fila[]= new int[5];
	private static int inicio=0;
	private static int fim;
	private static int prox;
	private static int tamanho=0;
	
	public boolean filaVazia() {
		boolean a;
		if(tamanho == 0) {
			a=true;
	
		}else {
			a=false;
		}
		return a;
	}
	
	public boolean filaCheia() {
		boolean a;
		if(tamanho == 5) {
			a=true;
		}else {
			a=false;
		}
		
		return a;
	}
	
	
	public void infoFila() {
		if(filaVazia()) {
			JOptionPane.showMessageDialog(null, "Fila vazia");
		}else {
			JOptionPane.showMessageDialog(null, "O início da fila fica na posiçao: " + inicio + 
					"\nO primeiro elemento da fila é " + fila[inicio] + 
					"\nO fim da fila fica na posiçao: " + fim + 
					"\nO valor da posição final é: " + fila[fim]);
		}
	}
	
	
	public void adicionaFila(int numero) {
		if(filaCheia()) {
			JOptionPane.showMessageDialog(null, "ERRO - A fila está cheia");
		}else{
			fila[prox]=numero;
			tamanho++;
			prox++;
			fim=prox-1;
			if(prox==5){
				prox=0;
			}
			
		}
	}
	
	
	public void removeFila() {
		if(filaVazia()) {
			JOptionPane.showMessageDialog(null, "ERRO - A fila está Vazia");
		}else{
			Teste e = new Teste();
			int removido;
			removido = fila[inicio];
			e.adicionaPilha(removido);
			fila[inicio]=0;
			tamanho--;
			inicio++;
			if(inicio==5) {inicio = 0;}
			
		}
	}
	
	

}
