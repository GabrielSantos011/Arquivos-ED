import javax.swing.JOptionPane;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		
		double [] vetor = new double[100];
		double mediaGeral=0, mediaEspecial=0;
		double somaNegativos=0, n=0;
		
		for (int i = 0; i < 100; i++) {
			vetor[i]=Double.parseDouble(JOptionPane.showInputDialog("digite"));
			mediaGeral+=vetor[i];
			
			if(vetor[i]>100 & vetor[i]<1000) {
				mediaEspecial+=vetor[i];
				n++;
			}else if(vetor[i]<0) {
				somaNegativos+=vetor[i];
			}//end if
			
		}//end for
		
		mediaGeral/=100;
		mediaEspecial/=n;
		
		System.out.println("A m�dia geral dos valores foi: " + mediaGeral+
				"\nA m�dia dos valores entre 100 e 100 (exclusivo) foi: "+ mediaEspecial+
				"\nA soma dos valores negativos foi: "+ somaNegativos);
		
	}//end main

}//end class