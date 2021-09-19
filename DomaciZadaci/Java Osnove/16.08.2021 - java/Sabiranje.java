import java.util.*;

public class SabiranjeBrojeva {

	public static void main(String[] args) {
		/*
		  Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
		
		 */
		
		int suma = 0;
		int broj;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Unesite jedan broj");
			broj = sc.nextInt();
			if (broj < 0) {break;};
			suma+=broj;
		}
		System.out.println("Ukupna suma unesenih brojeva je : " + suma);

	}

}
