import javax.swing.JOptionPane;

public class Exerc�cio2 {

	public static void main(String[] args) {
		int [] vt = new int[5];
		int [] vtFatorial = new int[5];
		
		for(int i=0;i<5;i++) {
			vt[i]=Integer.parseInt(JOptionPane.showInputDialog("digite"));
		}
		
		for(int i = 0; i<5; i++) {
			vtFatorial[i] = fatorial(vt[i]);
		}
		
		for(int i=0; i<5; i++) {
			JOptionPane.showMessageDialog(null, "fatorial de " + vt[i] + " � " + vtFatorial[i]);
		}
		
	}
	
	
	public static int fatorial(int a) {
		int fat=1;
		for(int i=1; i<a;i++) {
			fat*=(i+1);
		}
		return fat;
	}

}
