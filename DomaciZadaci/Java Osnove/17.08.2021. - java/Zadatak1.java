/*Napisati program koji oponasa kviz za pogadjanje glavnog grada.
 Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz iz programa.
    1. Francuska
    2. Italija
    3. Srbija
    4. Izlaz- Nakon odabira drzave, potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?'
- Ako korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan'
- Ako korisnik odgovori netacno, ispisuje se poruka 'Odgovor nije tacan'
- Nakon davanja odgovora (bilo da je tacan ili netacan), ponovo treba da se postave
sve pocetne opcije i ponudi korisniku da odabere neku od njih.
- Program se zavrsava kad korisni odabere 4. opciju 'Izlaz'
- Program uraditi koriscenjem dosad naucenog + do-while petlje*/

import java.util.*;
 public class Zadatak {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         do {
         System.out.println("Izaberite opciju: " + "\n1.) Francuska" + "\n2.) Italija"
         + "\n3.) Srbija" + "\n4.) Izlaz");
         String glavniGrad;
         
         int izbor = sc.nextInt();
         
         if (izbor == 1) {
                 System.out.println("Koji je glavni grad Francuske?  ");
                 glavniGrad = sc.next();
                 if (glavniGrad.equals("Pariz")) {
                     System.out.println("Odgovor je tacan, Pariz je glavni grad Francuske");
                 } else {System.out.println("Odgovor nije tacan, " + glavniGrad + " nije glavni grad Francuske");}
                 continue;}
         else if (izbor == 2) {
                 System.out.println("Koji je glavni grad Italije?  ");
                 glavniGrad = sc.next();
                 if (glavniGrad.equals("Rim")) {
                     System.out.println("Odgovor je tacan, Rim je glavni grad Italije");
                 } else {System.out.println("Odgovor nije tacan, " + glavniGrad + " nije glavni grad Italije");}
                 continue;}
         else if (izbor == 3) {
                 System.out.println("Koji je glavni grad Srbije?  ");
                 glavniGrad = sc.next();
                 if (glavniGrad.equals("Beograd")) {
                     System.out.println("Odgovor je tacan, Beograd je glavni grad Srbije");
                 } else {System.out.println("Odgovor nije tacan, " + glavniGrad + " nije glavni grad Srbije");}
                 continue;}
         else if (izbor == 4) { 
                 //System.out.println("Program je zavrsen");
                 break;}            
         
         } while(true);
         System.out.println("Program je zavrsen");
         
  }
     
 }
