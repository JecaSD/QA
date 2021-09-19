/*Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
(Koristiti for petlju)
Na primer N: 5
*
**
***
****
*****

*/

 import java.util.*;
 
 public class test {
 
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
         System.out.println("Unesite jedan broj: ");
         int N = sc.nextInt();
         
         for (int i = 0; i<=N;i++) {
             System.out.print("");
             for (int j = 0; j<i;j++) {
                 System.out.print("");
             }
             System.out.println();
         }
         
     
     }
 
 }
