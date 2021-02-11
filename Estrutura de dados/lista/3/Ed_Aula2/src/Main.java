import javax.swing.JOptionPane;;


public class Main {
	
	public static void main(String args[]){
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila"));
		Queue queue= new Queue(i);
		Pile pile = new Pile(i);
		
		int opt = 0;
		int aux;
		while(opt != 9){
			opt = Integer.parseInt(JOptionPane.showInputDialog("Menuzinho show \n 1- Adicione um elemento a fila \n 2- Remova um elemento da fila\n 3- Mostre a fila"));
			switch(opt){
				case 1:
					queue = new Queue(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro")));
					break;
				case 2:
					queue.addElement(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro")));
				break;
				case 3:
					if(!queue.empty()){
						aux = queue.returnRemoved();
						queue.removeElement();
						pile.addElement(aux);
					}else{
						queue.removeElement();
					}
				break;
				case 4:
					queue.showQueue();
					pile.showPile();
				break;
				case 9:
					System.out.println("Sistema finalizado");
					break;
				default:
					break;
			}
		}
		
		
	}

}
