package exercicio3;

import javax.swing.JOptionPane;

public class Main {
		
	public static void main(String[] args) {
		
		Teste ex = new Teste();
		Ex2 e = new Ex2();
		
		int opc = 0;
		while(opc!=11) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("digite\n"
					+ "1-saber se a fila esta cheia\n"
					+ "2-saber se a fila est� vazia\n"
					+ "3-adicionar na fila\n"
					+ "4-remover da fila (e adicionar na pilha)\n"
					+ "5 - info de fila\n"
					+ "6-saber se a pilha esta cheia\n"
					+ "7-saber se a pilha est� vazia\n"
					+ "8-adicionar na pilha\n"
					+ "9-remover da pilha (e adicionar na fila)\n"
					+ "10 - info de pilha\n"
					+ "11-fim"));
			
			switch(opc) {
			case 1:
				e.filaCheia();
				break;
				
			case 2:
				e.filaVazia();
				break;
				
			case 3:
				e.adicionaFila(Integer.parseInt(JOptionPane.showInputDialog("que numero?")));
				break;
				
			case 4:
				e.removeFila();
				break;
				
			case 5:
				e.infoFila();
				break;
				
			case 6:
				ex.pilhaCheia();
				break;
				
			case 7:
				ex.pilhaVazia();
				break;
				
			case 8:
				ex.adicionaPilha(Integer.parseInt(JOptionPane.showInputDialog("que numero?")));
				break;
				
			case 9:
				ex.removePilha();
				break;
				
			case 10:
				ex.infoPilha();
				break;
				
			case 11:
				JOptionPane.showMessageDialog(null, "FIM");
				break;
			default:
				JOptionPane.showMessageDialog(null, "erro");
			}
			
		}
		
	}

}
