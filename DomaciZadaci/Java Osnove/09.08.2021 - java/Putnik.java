public class Putnik extends Covek {
     private double novac;
     
     public Putnik(String ime, String prezime, double novac) {
         super(ime, prezime);
         this.novac = novac;
     }
     
     public void oduzmiNovac(double iznos) {
         this.novac -= iznos;
         if (iznos > this.novac) {
             System.out.println("Greška, nemate dovoljno novca!");
         }
         else {
             System.out.println("Novac je uspešno skinu sa Vašeg računa!");
         }
     }
     
     public void dodajNovac(double iznos) {
         this.novac += iznos;
     }
 }