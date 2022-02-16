
public class Questao_01 {

	public static void main(String[] args) {
		int n = 6;
		
		for (int i = n; i > 0 ; i--) {
			String star = "";
			for (int x = i; x > 1; x--) {
				star = star.concat(" ");
			}
			for (int j = 0; j <=-(i - n); j++) {
				star = star.concat("*");
				}
			System.out.println(star);
		}	
	}
}
