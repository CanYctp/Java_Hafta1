
public class Main {

	public static void main(String[] args) {
		int sayi1 =5248;
		int sayi2 =1516;
		int sayi3 =65165;
		
		if(sayi2<sayi1) {
		if(sayi3<sayi1) {
			System.out.println(sayi1);
		}
		}
		else if(sayi2>sayi1) {
		if(sayi3<sayi2) {
				System.out.println(sayi2);
		}
		}
		else {
		System.out.println(sayi3);
		}
		
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = "+enBuyuk);
}
}

		