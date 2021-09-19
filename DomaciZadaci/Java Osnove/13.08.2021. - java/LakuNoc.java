import java.util.*;

public class LakuNoc {

	public static void main(String[] args) {
		/*
		 Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesti koliko puta zelite da se ispise laku noc? : ");
		int broj = sc.nextInt();
		int brojac = 0;
		while(brojac <broj) {
			System.out.println("Laku noc");
			brojac ++;
		}
		
		

	}

}
