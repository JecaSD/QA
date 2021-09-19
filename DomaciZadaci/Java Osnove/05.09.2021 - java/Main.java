/*Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol. 
Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova. 
Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko godina pune u 2022. godini, 
ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola. 
Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore ocenjenog filma
od tih pet (preko getera i setera).*/

import java.util.*;
 
 public class Zadatak {
 
     public static void main(String[] args) {
         
         Glumci gl = new Glumci("Emma Watson", 1990, 'z', false, 500000, 20); 
         gl.odstampaj();
             
         
         Scanner sc = new Scanner(System.in);
         ArrayList film = new ArrayList();
         
         for (int i = 0; i <= 4; i++) {
             System.out.print("Unesite ime filma i imdb ocenu: ");
             film.add(sc.next());
         }
     
     }
         
     
 