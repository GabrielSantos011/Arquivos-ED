package exerc�cios;

import javax.swing.JOptionPane;

public class ex4 {
	
	static int tamanho = 0;
	static String lista[] = new String[5];
	
	public static void main(String[] args) {
		
		int opc = 0;
		
		while(opc!=10) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - verificar se a lista est� vazia\n"
					+ "2 - verificar se a lista est� cheia\n"
					+ "3 - adicionar string no in�cio da lista\n"
					+ "4 - adicionar string no final da lista\n"
					+ "5 - adicionar string em determinada posi��o da lista\n"
					+ "6 - remover string do in�cio da lista\n"
					+ "7 - remover string do final da lista\n"
					+ "8 - remover string de determinada posi��o da lista\n"
					+ "9 - percorrer a lista concatenando os elementos em uma String\n"
					+ "10 - fim!"
					+ "Digite a op��o desejada: "));
			
			
			switch(opc) {
			case 1:
				JOptionPane.showMessageDialog(null, listaVazia());
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, listaCheia());
				break;
				
			case 3:
				adicionaInicio();
				break;
				
			case 4:
				adicionaFinal();
				break;
				
			case 5:
				adicionaPosicao();
				break;
				
			case 6:
				JOptionPane.showMessageDialog(null, "o valor retornado foi de <"+removeInicio()+">");
				break;
				
			case 7:
				JOptionPane.showMessageDialog(null, "o valor retornado foi de <"+removeFinal()+">");
				break;
				
			case 8:
				JOptionPane.showMessageDialog(null, "o valor retornado foi de <"+removePosicao()+">");
				break;
				
			case 9:
				String tudo="";
				tudo = concatena(tudo);
				JOptionPane.showMessageDialog(null, tudo);
				break;
				
			case 10:
				JOptionPane.showMessageDialog(null,"Obrigado por usar a aplica��o!");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida");
				
			}
			
		}//end while
		
	}// end main
	
	public static boolean listaVazia() {
		boolean be;
		
		if(tamanho==0) {
			be=true;
		}else {
			be=false;
		}
		return be;
	}
	
	
	public static boolean listaCheia() {
		boolean be;
		
		if(tamanho==5) {
			be=true;
		}else {
			be=false;
		}
		return be;
	}
	
	public static void adicionaInicio() {
		if(listaCheia()==true) {
			JOptionPane.showMessageDialog(null, "LISTA CHEIA");
		}else {
			for (int i=tamanho;i>0;i--) {
				lista[i] = lista[i-1];
				
			}
			String add = JOptionPane.showInputDialog("Que string deseja adicionar?");
			lista[0] = add;
			tamanho++;
		}
		
	}
	
	
	public static void adicionaFinal() {
		if(listaCheia()==true) {
			JOptionPane.showMessageDialog(null, "LISTA CHEIA");
		}else {
			String add = JOptionPane.showInputDialog("Que string deseja adicionar?");
			lista[tamanho] = add;
			tamanho++;
		}
		
	}
	
	public static void adicionaPosicao() {
		String add = JOptionPane.showInputDialog("Que string deseja adicionar?");
		int pos = Integer.parseInt(JOptionPane.showInputDialog("em qual posi��o deseja adicionar?"));
		
		if(listaCheia()==true) {
			JOptionPane.showMessageDialog(null, "LISTA CHEIA");
		}else if(pos<=tamanho & pos>=0) {
			for (int i=tamanho;i>pos;i--) {
				lista[i] = lista[i-1];
			}
			lista[pos]=add;
			tamanho++;
		}else{
			JOptionPane.showMessageDialog(null, "voc� digitou uma posi��o invalida");
		}
		
	}
	
	
	public static String removeInicio() {
		String retorno= "";
		if(listaVazia()==true) {
			JOptionPane.showMessageDialog(null, "A LISTA EST� VAZIA, o retorno sera vazio");
			return retorno;
		}else {
			
			retorno = lista[0];
			
			if(tamanho==1) {
				lista[0]="";
			}
			for (int i=1;i<tamanho;i++) {
				lista[i-1] = lista[i];
			}
			tamanho--;
			
			return retorno;
			
		}
	}
	
	
	public static String removeFinal() {
		String retorno= "";
		if(listaVazia()==true) {
			JOptionPane.showMessageDialog(null, "A LISTA EST� VAZIA, o retorno ser� vazio");
			return retorno;
		}else {
			
			retorno = lista[tamanho-1];
			
			}
			for (int i=0;i<tamanho;i++) {
				if(i==tamanho-1) {lista[i]="";}
			}
			tamanho--;
			
			return retorno;
			
	}
	
	
	public static String removePosicao() {
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Que posi��o deseja remover?"));
		String retorno= "";
		
		if(listaVazia()==true) {
			JOptionPane.showMessageDialog(null, "A LISTA EST� VAZIA, o retorno ser� vazio");
			
		}else if(pos>=tamanho){
			
			JOptionPane.showMessageDialog(null, "POSI��O AINDA N�O ADICIONADA, o retorno ser� vazio");
			
		}else if(pos>=0) {
			retorno = lista[pos];
			lista[pos]="";
			for(int i=pos; i<tamanho-1;i++) {
				lista[i]=lista[i+1];
			}
			
		}
		return retorno;
	}
	
	public static String concatena(String tudo) {
		for(int i = 0; i<tamanho;i++) {
			tudo+=lista[i]+"  /  ";
		}
		return tudo;
	}
}