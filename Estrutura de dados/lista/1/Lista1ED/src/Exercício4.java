import javax.swing.JOptionPane;

public class Exerc�cio4 {

	public static void main(String[] args) {
		
		double m[][] = new double [4][4];
		double soma=0;
		double impar=0;
		double div=0;
		double imparDiv=0;
		double fat=1;
		double maior=0;
		
		for(int i=0; i<4; i++) {
			for(int j=0;j<4;j++) {
				
				m[i][j]=Double.parseDouble(JOptionPane.showInputDialog("digite"));
				
				if(m[i][j]>1 & m[i][j]<100) {
					soma+=m[i][j];
				}if(m[i][j]>30 & m[i][j]<50 & m[i][j]%2==1) {
					impar+=1;
				}if(m[i][j]%8==0) {
					div+=1;
				}if(m[i][j]%2==1 & m[i][j]%3==0) {
					imparDiv+=1;
				}if(m[i][j]>maior || i==0) {
					maior = m[i][j];
				}
				
				
			}//end for j
		}//end for i
		
		
			for(int i=1; i<=maior; i++) {
				fat= fat*i;
			}
			
			JOptionPane.showMessageDialog(null, "Soma dos valores no intervalo de 1 a 100 == "+ soma+
					"\nQuantidade de n�meros �mpares entre 30 a 50 == "+ impar+
					"\nQuantidade de n�meros divis�veis por 8 == "+ div +
					"\nQuantidade de n�meros �mpares divis�veis por 3 == "+ imparDiv+
					"\nFatorial do maior n�mero informado na matriz == "+ fat);
		
	}//end main

}
