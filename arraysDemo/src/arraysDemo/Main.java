package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Ralph";
		String ogrenci3="Can";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Can";
		ogrenciler[2]="İso";
		
		System.out.println("-----------------");
		
		for(int i=0 ;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
