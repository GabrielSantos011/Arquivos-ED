
public class Pile {
	private int datas[];
	private int length;
	
	
	Pile(int i){
		datas = new int[i];
		length = 0;
	}
	
	public boolean full(){
		if(length == datas.length){
			System.err.println("A fila está cheia");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean empty(){
		if(length == 0){
			System.err.println("A fila está vazia");
			return true;
		} else {
			return false;
		}
	}
	
	public void addElement(int value){
		if(full()){
			return;
		} else {
			datas[length] = value;
			length += 1;
		}
	}
	
	public void removeElement(){
		if(empty()){
			return;
		} else {
			length --;
		}
	}
	
	public void showPile(){
		String x = "Pile: ";
		if(empty()){
			return;
		} else {
			for(int i = 0; i < length; i++){
				x += datas[i] + ", ";
			}
			System.out.println(x);
		}
	}
	
}
