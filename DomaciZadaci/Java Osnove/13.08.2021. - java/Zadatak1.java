	/*Napisati program gde preko skenera unesete broj, ako je broj manji od 10 onda ga pomnoziti sa 100, ako je broj veci od 100 onda ga podeliti sa 10. 
	Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.*/
	
	
	import java.util.*;
 
 
 public class Zadatak {
 
     public static void main(String[] args) {
             
         Scanner sc = new Scanner(System.in);
         System.out.println("Unesite broj:  ");
         double broj = sc.nextDouble();
         System.out.println(broj);
         if (broj < 10) {
         System.out.println("Rezultat je : " + broj*100);    
         } else if ( broj > 100) {
             System.out.println("Rezultat je : " + broj/10);            
         } else {
             System.out.println("Not defined... Check with system administrator :)");
         }
 
     }
 
 }
 
 // 10, 100, 103, -5, 100.2, 9, 11, 99, 101