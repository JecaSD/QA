/*Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja) i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.
Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
Dodatni
Funkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima -> Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva
.Da li u nasoj klasi mozemo da imamo sledece funkcije i zasto?
public static void vrati() {
	System.out.println(“Vrati mi olovku”);
}


public static String vrati() {
	return “Vrati mi svesku”;
}
*/
import java.util.*;
 public class Zadatak {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Unesite prvi broj ");
         int x1 = sc.nextInt();
         System.out.println("Unesite drugi broj ");
         int x2 = sc.nextInt();
         System.out.println("Unesite treci broj ");
         int x3 = sc.nextInt();
         proizvod (x1, x2, x3);
         System.out.println("Proizvod 3 broja je: " + proizvod(x1, x2, x3));
         
     }
         public static int proizvod (int a, int b, int c) {
             return a*b*c;
         }
     }
	 
	 
	 import java.util.*;
 public class Zadatak {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Unesite prvi broj ");
         int x1 = sc.nextInt();
         System.out.println("Unesite drugi broj ");
         int x2 = sc.nextInt();
         System.out.println("Unesite treci broj ");
         int x3 = sc.nextInt();
         System.out.println("Zbir 3 broja je: " + zbir (x1, x2, x3));
         System.out.println("Najveci broj je: " + maksimum (x1, x2, x3));
         
         
         }
     public static int zbir (int a, int b, int c) {
         return (a+b+c);
     }
     
     public static int maksimum (int a, int b, int c) {
         int max = a; 
         if (b>max) {
             max = b;
         }
         if (c>max) {
             max = c;
         }
         return max;
     }
     }