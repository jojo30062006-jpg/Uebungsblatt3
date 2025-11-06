package p2;

public class H2_main {
	public static void main(String[] args) { 
		int a = 2;
		int b = 5;
		int c = 7;
		int d = 10;
		
		d = 0;
		
		if (a == b) {
			d ++;
		}
		if (a == b || a == c) {
			d ++;
		}
		if ((a + b) >= c) {
			d ++;
		}
		if ((a + b + c) >= 100) {
			d++;
		}
		
	System.out.println (" es treffen "+ d + " Eigenschaften zu!");
	}
}
