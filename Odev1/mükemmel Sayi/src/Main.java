
public class Main {

	public static void main(String[] args) {
		// Mükemmel sayı kendinden önceki bölenlerin toplamı o sayıyı vermeli örn 6

		int number = 28;
		int ilkSayi = 0;

		for (int i = 1; i < number; i++) {
			int remainder = number % i;
			if (remainder == 0) {
				
				ilkSayi = ilkSayi + i;
			}
		}
				
				if (ilkSayi == number) {
					System.out.println("Bu bir mükemmel sayıdır.");
					
				} 
				
				else {
					System.out.println("Bu bir mükemmel sayı değildir.");
					
				}
			}

}
