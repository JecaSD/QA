import java.util.ArrayList;
 
 public class Autobus {
     private String naziv;
     private Vozac sofer;
     private double cenaKarte;
     private ArrayList<Putnik> putnici;
     
     
     public Autobus (String naziv, Vozac sofer, double cenaKarte) {
         this.naziv = naziv;
         this.sofer = sofer;
         this.cenaKarte = cenaKarte;
         this.putnici = new ArrayList<Putnik>();
     }
     public void izbaciPutnika (Putnik p) {
         putnici.remove(p);
     }
     
     public Putnik dodajPutnika (String ime, String prezime, double novac) {
         Putnik p = new Putnik(ime, prezime, novac);
         putnici.add(p);
         return p;
     }
     
     public void dodajVozaca (Vozac a) {
         if (this.sofer == null) { 
         this.sofer = a;
         }
         else {
             System.out.println("Već imate vozača");
         }
         
     }
     
     public void ukloniVozaca (Vozac a) {
         if (this.sofer == null) { 
             System.out.println("Nemate vozača kojeg možete ukloniti");
         }
         else {
             this.sofer = null;
         }
     }
     
 
 }