package loopDemo;

public class Main {
	
	public static void main(String[] args) {
		// For Döngüsü
	for(int i=1; i<10; i+=2) {
		System.out.println(i);
	}
	System.out.println("Döngü bitti");
	
		// While Döngüsü
	
	int i =1;
	
	while (i<10) {
		System.out.println(i);
		i+=2;	
		}
	System.out.println("While Dögüsü Bitti!");
	
	// Do-While Döngüsü
	
	int j = 1;
    do {
    	System.out.println("Loglandı");
        System.out.println(j);
        j+=2;
    } while (j<10);
    
    System.out.println("Do-While Dögüsü Bitti!");
}
}