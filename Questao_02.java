
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Questao_02 {

	public static void main (String args[]) {
		int hits = 6;
		
		String password = JOptionPane.showInputDialog("Informe uma senha");
		
		boolean isDigit = false;
		boolean isCapital = false;
		boolean isTiny = false;
		boolean isSymbol = false;
		boolean isAny_1 = false;
		boolean isAny_2 = false;
		
		for(int i =0; i<password.toCharArray().length; i++) {
			String letter =  String.valueOf(password.toCharArray()[i]);
			
			if (!isDigit && Pattern.compile("[0-9]")
					.matcher(letter)
					.matches()
					) {
				hits--;
				isDigit = true;
				continue;
			}
			
			
			if (!isCapital && Pattern.compile("[A-Z]")
					.matcher(letter)
					.matches()
					) {
				hits--;
				isCapital = true;
				continue;
			}
		
			if (!isTiny && Pattern.compile("[a-z]")
					.matcher(letter)
					.matches()
					) {
				hits--;
				isTiny = true;
				continue;
			}
		 
			if (!isSymbol && Pattern.compile("[!@#$%^&*()-+]")
					.matcher(letter)
					.matches()
			) {
				hits--;
				isSymbol = true;
				continue;
			}
			
			if (!isAny_1 && Pattern.compile("[a-zA-Z0-9!@#$%^&*()-+]")
					.matcher(letter)
					.matches()
					) {
				hits--;
				isAny_1 = true;
				continue;
			}
			
			if (!isAny_2 && Pattern.compile("[a-zA-Z0-9!@#$%^&*()-+]")
					.matcher(letter)
					.matches()
					) {
				hits--;
				isAny_2 = true;
				continue;
			}
		}	
		
		System.out.println(hits);
	}
}
