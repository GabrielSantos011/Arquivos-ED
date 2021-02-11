
public class Queue {

	private int length;
	private int[] datas;
	
	Queue(int i){
		this.length = 0;
		this.datas = new int [i];
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
			for(int i=0; i < length-1 ; i++){
				datas[i] = datas[i+1];
			}
		length --;
		}
	}
	
	public void showQueue(){
		String x = "Queue: ";
		if(empty()){
			return;
		} else {
			for(int i = 0; i < length; i++){
				x += datas[i] + ", ";
			}
			System.out.println(x);
		}
	}
	
	public int returnRemoved(){
		return datas[0];
	}
	
}
