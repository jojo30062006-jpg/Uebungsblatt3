package h3;

public class H3_main {
	public static void main(String[] args) { 
		
		int max = 5;
		int fix = 2;
		int wartend = 12;
		
		boolean istVoll;
			
		while (fix < max && wartend > 0) {
			fix ++;
			wartend --;
			}
		
		if (fix == max) {
			istVoll = true;
		}
		else {
			istVoll = false;
		}
		
		System.out.println("maximale Fixplätze: " + max);
		System.out.println("vergebende Fixplätze: " + fix);
		System.out.println("so viele warten noch: " + wartend);
		System.out.println("ist voll?: " + istVoll);
	}
}
