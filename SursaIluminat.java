package com.mycompany.proiect_java;

public class SursaIluminat extends Lampa{
    private String tip_bec;
    private int putere;
    private int durata_lumina;
    private String alimentare;
    private String tip_lumina;
    
    public  SursaIluminat(){
        super();
        this.tip_bec="necunoscut";
        this.putere=0;
        this.durata_lumina=0;
    }
    public SursaIluminat(String tip_bec, int putere, int durata_lumina, int marime_bec, String serie, int inaltime, String culoare, boolean cuBaterie, String alimentare, String tip_lumina) {
    super(marime_bec, serie, inaltime, culoare, cuBaterie); // Apelăm constructorul din Lampa
    this.tip_bec = tip_bec;
    this.durata_lumina = durata_lumina;
    this.putere = putere;
    this.alimentare = alimentare;
    this.tip_lumina = tip_lumina; 
}
   public SursaIluminat(SursaIluminat obj){
       super(obj);
        this.durata_lumina=obj.durata_lumina;
        this.putere=obj.putere;
        this.tip_bec=obj.tip_bec;
    }
   
   public void setalimentare(String alimentare){
       this.alimentare=alimentare;
   }
   public String getalimentare(){
       return this.alimentare;
   }
   public void settip_lumina(String tip_lumina){
       this.tip_lumina=tip_lumina;
   }
   public String gettip_lumina(){
       return this.tip_lumina;
       }
   public void settip_bec(String tip_bec){
       this.tip_bec=tip_bec;
       
   }
   public String gettip_bec(){
       return this.tip_bec;
   }
   public void setputere(int putere){
       this.putere=putere;
   }
   public int getputere(){
       return this.putere;
   }
   
   public void setdurata_lumina(int durata_lumina){
       this.durata_lumina=durata_lumina;
       
   }
   public int getdurata_lumina(){
       return this.durata_lumina;
   }
   
    @Override
    public String toString() {
        return "SursaIluminat{" +
                "tip_bec='" + tip_bec + '\'' +
                ", putere=" + putere +
                ", durata_lumina=" + durata_lumina +
                ", " + super.toString() +
                '}';
    }
}
