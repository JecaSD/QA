/*Domaći 12.08.2021
Napisati program gde deklarisete vase ime, prezime kao string, pol kao char i odstampajte adekvatno sva tri unosa. 
Nakon toga preko skenera treba da unesete ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama i ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama, 
na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja. */


import java.util.*;
 
 
 public class Zadatak {
 
     public static void main(String[] args) {
         
         String ime = "Jelena";
         String prezime = "Dimitrijevic";
         char pol = 'z';
         
         System.out.println("Moje ime je : " + ime + " \nPrezivam se : " + prezime + "\nMoj pol je : " + pol);
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Unesite broj medalje koje je Srbija osvojila : ");
         int brojMedalja = sc.nextInt();
         
         System.out.println("Broj medalja koje je Srbija osvojila je : " + brojMedalja);
         System.out.println("Unesite broj zlatnih medalja koje je Srbija osvojila : ");
         int brojZlatnihMedalja = sc.nextInt();
         System.out.println("Procenat zlatnih medalja u odnosu na ukupan broj medalja je : " + (double)100*brojZlatnihMedalja
                 /brojMedalja + " %");
 
     }
 
 }
