/*1. Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve osim prvog i poslednjeg unosa.
2. Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid), a program stampa gradove sve dok ne dodje do "Prag"-a.
Dva zadatka koje mozete pisati u istoj klasi ako zelite, kratki su zadaci, ali bitno je samo da se napise preko niza. */






import java.util.*;
 public class Zadatak {
 
     public static void main(String[] args) {
     
      String[] gradovi = {"Lisabon", "London", "Helsinki", "Prag", "Madrid"};
      for (String i : gradovi) {
          if (i.equalsIgnoreCase("Prag")) {
              break;
          }
          System.out.println(i);
          
      }
      
      for(int j = 0; j < gradovi.length; j++) {
         if (j == 0 || j == 4) {
             continue;}
         
          System.out.println(gradovi[j]); 
      
      }
   }
 }