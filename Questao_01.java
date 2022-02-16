import javax.swing.JOptionPane;

public class Questao_01 {

	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Informe o número de degraus para formar a escada");
		
		for (int i = Integer.parseInt(n); i > 0 ; i--) {
			String star = "";
			for (int x = i; x > 1; x--) {
				star = star.concat(" ");
			}
			for (int j = 0; j <=-(i - Integer.parseInt(n)); j++) {
				star = star.concat("*");
				}
			System.out.println(star);
		}	
	}
}
