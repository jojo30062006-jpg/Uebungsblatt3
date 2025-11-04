package h1;

public class H1_main {
	public static void main(String[] args) { 
		double guthaben = -100;
		double monEingang = 200;
		
		int rating = -2;
		
		boolean warnhinweis = false;
		boolean negativ = false;
		
		if (guthaben < 0) {
			negativ = true;
		} else {
			negativ = false;
		}
		
		
		if (guthaben > 0) {
			rating = rating + 3;
		}
		
		if (guthaben == 0) {
			rating = rating + 2;
		}
		
		if (guthaben < 0) {
			if (Math.abs(monEingang) >= Math.abs(guthaben)) {
				rating = rating+1;
			}
		}

		if (guthaben < 0) {
			if (Math.abs(monEingang) <= Math.abs(guthaben)) {
				rating = rating-1;
			}
		}
		
		if (guthaben < 0) {
			if (Math.abs(monEingang) <= Math.abs(guthaben)) {
				if (rating < 0) {
					warnhinweis = true;
				}
			}
		}
				else {
					warnhinweis = false;
			
		}
		System.out.println(negativ);
		System.out.println("Das guthaben ist " + guthaben);	
		System.out.println("Der monatliche Eingang beträgt " + monEingang);
		System.out.println("Das rating ist bei " + rating);
		System.out.println(warnhinweis);
		
		
}
}