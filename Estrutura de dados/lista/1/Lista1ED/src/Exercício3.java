import javax.swing.JOptionPane;

public class Exerc�cio3 {

	public static void main(String[] args) {
		int []vt = new int [100];
		
		for(int i=0; i<100; i++) {
			vt[i]=Integer.parseInt(JOptionPane.showInputDialog("digite o " +(i+1)+ " n�mero"));
		}//end for
		
		for(int i=0; i<99;i++) {
			for(int j=i+1;j<100;j++) {
				int aux;
				
				if(vt[i]>vt[j]) {
					aux = vt[i];
					vt[i]=vt[j];
					vt[j]=aux;
				}//end if
				
			}//end for j
		}//end for i
		
		JOptionPane.showMessageDialog(null,"O vetor em Ordem ficou");
		for(int i=0;i<100;i++) {
			JOptionPane.showMessageDialog(null,vt[i]);
		}
		
	}//end main

}