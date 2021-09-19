public class Glumci {
     public String imePrezime;
     public int godinaRodjenja;
     public char pol;
     
     private boolean uBraku; 
     private double prosecnaZarada;
     private int brojFilmova;
     
     public Glumci (String imePrezime, int godinaRodjenja, char pol, boolean uBraku, double prosecnaZarada, int brojFilmova) {
         this.imePrezime = imePrezime; 
         this.godinaRodjenja = godinaRodjenja; 
         this.pol = pol;
         this.uBraku = uBraku; 
         this.prosecnaZarada = prosecnaZarada;
         this.brojFilmova = brojFilmova;
     }
     public void odstampaj() {
         if (pol == 'z') {
             System.out.println("Ime i prezime: Mrs." + this.imePrezime);
         }
         else {
             System.out.println("Ime i prezime: Mr." + this.imePrezime);
         }
         System.out.println("Godina rodjenja je: " + this.godinaRodjenja);
         System.out.println("Pol je: " + this.pol);
         System.out.println("Da li je u braku: " + this.uBraku);
         System.out.println("Prosecna zarada je: " + this.prosecnaZarada);
         System.out.println("Broj snimljenih filmova je: " + this.brojFilmova);
         System.out.println("Ukupna zarada je: " + (this.prosecnaZarada * this.brojFilmova));
         System.out.println("U 2022. god. puni " + (2022 - this.godinaRodjenja) + " godine");
     }
 }