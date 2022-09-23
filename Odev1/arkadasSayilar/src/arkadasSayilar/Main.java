package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		int sayi=50;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				toplam1 = toplam1 + i;
				
			}
		}
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2 = toplam2 + i;
				
			}
		}
		if(sayi==toplam2 && sayi2==toplam1) {
			System.out.println("bu iki sayı arkadastır.");
		}
		else{
			System.out.println("bu iki sayı arkadas değildir.");
		}

	}

}
