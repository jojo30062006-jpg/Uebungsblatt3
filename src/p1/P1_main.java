package p1;

public class P1_main {
public static void main(String[] args) { 

	int wuerfel = 4;
	
	if (wuerfel == 1 || wuerfel == 4) {
		System.out.println ("sie haben gewonnen");
	}
	else if (wuerfel == 2) {
		System.out.println ("sie haben verloren");
	}
	else {
		System.out.println ("unentschieden");
	}	
	
}
}