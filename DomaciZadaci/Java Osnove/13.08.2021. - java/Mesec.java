import java.util.Scanner;

public class Mesec {

	public static void main(String[] args) {
		/*
		Napisati program gde kroz switch se unosi broj od 1 do 12 i program ispisuje koji je to mesec u godini. 
Ako korisnik unese drugi broj treba da se ispise poruka "Potrebno je uneti broj od 1 do 12"
		*/

		Scanner sc = new Scanner(System.in);
		int unos;
		
		while(true) {
		System.out.println("Unesite broj izmedju 1 i 12");
		unos = sc.nextInt();
		if (unos < 1 || unos > 12) {
		System.out.println("Izabrali ste pogresnu opciju, izaberite broj izmedju 1 i 12");}
		else {break;}
		}
		
		
		switch (unos) {
		case 1: System.out.println("Mesec je januar");break;			
		case 2: System.out.println("Mesec je februar");break;
		case 3: System.out.println("Mesec je mart");break;
		case 4: System.out.println("Mesec je april");break;
		case 5: System.out.println("Mesec je maj");break;
		case 6: System.out.println("Mesec je jun");break;
		case 7: System.out.println("Mesec je jul");break;
		case 8: System.out.println("Mesec je avgust");break;
		case 9: System.out.println("Mesec je septembar");break;
		case 10: System.out.println("Mesec je oktobar");break;
		case 11: System.out.println("Mesec je novembar");break;
		case 12: System.out.println("Mesec je decembar");break;
		default: System.out.println("Uneli ste pogresnu opciju");break;
			
		}

	}

}
