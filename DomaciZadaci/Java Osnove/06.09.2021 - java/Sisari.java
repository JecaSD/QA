public class Sisari extends Kicmenjaci {
 
     private String bojaDlake;
     private String nacinIshrane;
     private String covekovaPodela;
 
     public Sisari(String vrsta, String naziv, String hrana, String bojaDlake, String nacinIshrane,
             String covekovaPodela) {
         super(vrsta, naziv, hrana);
         this.bojaDlake = bojaDlake;
         this.nacinIshrane = nacinIshrane;
         this.covekovaPodela = covekovaPodela;
     }
 
     public String getBojaDlake() {
         return bojaDlake;
     }
 
     public void setBojaDlake(String bojaDlake) {
         this.bojaDlake = bojaDlake;
     }
 
     public String getNacinIshrane() {
         return nacinIshrane;
     }
 
     public void setNacinIshrane(String nacinIshrane) {
         this.nacinIshrane = nacinIshrane;
     }
 
     public String getCovekovaPodela() {
         return covekovaPodela;
     }
 
     public void setCovekovaPodela(String covekovaPodela) {
         this.covekovaPodela = covekovaPodela;
     }
 
     public void stampaj() {
         System.out.println("Vrsta: " + super.getVrsta() + " Naziv: " + super.getNaziv() + " Hrana: "
                 + super.getHrana() + " Boja dlake: " + this.bojaDlake + " Nacin ishrane: " + this.nacinIshrane
                 + " Covekova podela: " + this.covekovaPodela);
 
     }
 
 }