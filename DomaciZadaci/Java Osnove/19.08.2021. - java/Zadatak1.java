/*Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan broj prikaze mu se suma svih prethodno unetih brojeva i na kraju zakomentarisati koje ste brojeve sve unosili po testu
na primer:
//test 1 x, y, z
//test 2 x, y, z
//test 3 x, y, z
(Koristiti do while petlju)*/

import java.util.*;
 
 public class test {
 
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
         boolean condition = true;
         int sum = 0;
         int broj;
         
         do {
             
             System.out.println("Unesite jedan broj: ");
             broj = sc.nextInt();
             if (broj < 0) {
                 condition = false;
                 System.out.println("Zbir do sada unetih pozitivnih brojeva je : " + sum);
             }
             sum = sum + broj;
             
         }
         while (condition);
         sc.close();
 // test 1 : 10,50,0,-3
         // test 2 :  -10
         // test 3 : 0, 5, 10,15,-100
     
     }
 
 }
