package ex2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		TemperaturaLista listaTemp = new TemperaturaLista();

		int opc = 0;
		double temperatura = 0;
		int posicao = 0;
		double elementoRemovido = 0;
		
		//TESTES DE MESA
		
		//lista vazia
		JOptionPane.showMessageDialog(null, listaTemp.listaVazia());
		//retorna true
		
		
		
		//adiciona in�cio
		temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
		listaTemp.adicionarInicio(temperatura);
		JOptionPane.showMessageDialog(null, "Temperaturas\n" + listaTemp);
		//retorna a lista ap�s a inser��o
		
		
		
		//adiciona fim
		temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
		listaTemp.adicionarFinal(temperatura);
		JOptionPane.showMessageDialog(null, "Temperaturas\n" + listaTemp);
		//retorna a lista ap�s a inser��o
		
		
		
		//adiciona posi��o
		temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
		posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posi��o desejada:"));
		listaTemp.escolhePosicao(temperatura, posicao);
		JOptionPane.showMessageDialog(null, "Temperaturas\n" + listaTemp);
		//retorna a lista ap�s a inser��o
		
		
		//Remove posi��o 
		posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posi��o desejada:"));
		elementoRemovido = listaTemp.removePosicao(posicao);
		JOptionPane.showMessageDialog(null, "Temperaturas\n" + listaTemp);
		//retorna a lista ap�s a remo��o
		
		
		//remove in�cio
		elementoRemovido = listaTemp.removeInicio();

		if (elementoRemovido < -999) {
			JOptionPane.showMessageDialog(null, "A opera��o n�o pode ser realizada");
		} else {
			JOptionPane.showMessageDialog(null, elementoRemovido + "� foi removida do inicio da lista");
		}JOptionPane.showMessageDialog(null, "Temperaturas\n" + listaTemp);
		//retorna a lista ap�s a remo��o

		
		//remove final
		elementoRemovido = listaTemp.removeFinal();
		if (elementoRemovido < -999) {
			JOptionPane.showMessageDialog(null,
					"A opera��o n�o pode ser realizada");
		} else {
			JOptionPane.showMessageDialog(null, elementoRemovido + "� foi removida do final da lista");
		}
		JOptionPane.showMessageDialog(null, "Temperaturas\n" + listaTemp);
		//retorna a lista ap�s a remo��o
		
		//in�cio do programa
		
		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha a op��o desejada:\n "
							+ "1-Lista vazia?\n"
							+ "2-Adicionar no Inicio\n"
							+ "3-Adiciona no final\n"
							+ "4-Adiciona posi��o espec�fica\n"
							+ "5-Remove no Inicio\n"
							+ "6-Remover no final\n"
							+ "7-Remover posi��o espec�fica\n"
							+ "8-Mostrar lista atual\n"
							+ " 9-Finalizar\n"
							+ "digite:"));
			switch (opc) {
			case 1:
				
				if (listaTemp.listaVazia()) {
					JOptionPane.showMessageDialog(null, "A lista est� vazia.");

				} else {
					JOptionPane.showMessageDialog(null, "A lista n�o est� vazia.");
				}
				break;

			case 2:
				
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
				listaTemp.adicionarInicio(temperatura);
				break;

			case 3:
				
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
				listaTemp.adicionarFinal(temperatura);
				break;
				

			case 4:
				
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura desejada:"));
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posi��o desejada:"));
				listaTemp.escolhePosicao(temperatura, posicao);
				break;
				
				
			case 5:
				
				elementoRemovido = listaTemp.removeInicio();

				if (elementoRemovido < -999) {
					JOptionPane.showMessageDialog(null, "A opera��o n�o pode ser realizada");
				} else {
					JOptionPane.showMessageDialog(null, elementoRemovido + "� foi removida do inicio da lista");
				}

				break;

			case 6:
				
				elementoRemovido = listaTemp.removeFinal();
				if (elementoRemovido < -999) {
					JOptionPane.showMessageDialog(null,
							"A opera��o n�o pode ser realizada");
				} else {
					JOptionPane.showMessageDialog(null, elementoRemovido + "� foi removida do final da lista");
				}

				break;

				
				
			case 7:
				
				
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira a posi��o desejada:"));
				elementoRemovido = listaTemp.removePosicao(posicao);

				if (elementoRemovido == -1000) {
					JOptionPane.showMessageDialog(null, "A opera��o n�o pode ser realizada.");
				} else if (elementoRemovido == -2000)
					JOptionPane.showMessageDialog(null, "POSI��O INV�LIDA");
				else {
					JOptionPane.showMessageDialog(null, elementoRemovido + "� foi removida do final da lista");
				}
				break;

				
			case 8:
				JOptionPane.showMessageDialog(null, "Temperaturas\n" + listaTemp);
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "FIM");
				break;
			default:
				JOptionPane.showMessageDialog(null, "OP��O INV�LIDA");
				break;
			}
		}
		
	}

}
