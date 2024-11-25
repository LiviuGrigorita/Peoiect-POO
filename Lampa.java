package com.mycompany.proiect_java;

public class Lampa extends OptiuniLampa {
     public   String serie;
  public  int marime_bec;
  int  inaltime; 
  private String culoare;
  private boolean cuBaterie;
    
   public Lampa (){
        this.serie="necunoscita";
        this.marime_bec=0;
        this.inaltime=0;
        this.cuBaterie=false;
        this.culoare="necunoscuta"; 
    }
   public Lampa(int marime_bec,String serie,int inaltime,String culoare,boolean cuBaterie){
       this.marime_bec=marime_bec;
       this.serie=serie;
       this.inaltime=inaltime;
       this.culoare=culoare;
       this.cuBaterie=cuBaterie;
       
}
    public Lampa(Lampa obj){
        this.marime_bec=obj.marime_bec;
        this.serie=obj.serie;
    }
    
    public void setInaltime(int inaltime){
        this.inaltime=inaltime;
   
    }
    public int getInaltime(){
        return this.inaltime;
    }
    
    public void setCuloare(String culoare){
        this.culoare=culoare;
    }
    public String getCuloare(){
        return this.culoare;
    }
    public void setcuBaterie(boolean cuBaterie){
        this.cuBaterie=cuBaterie;
    }
    public boolean getcuBaterie(){
        return this.cuBaterie;
    }
    @Override
    public void porneste(){
        this.setPornita(true);

    }
    @Override
    public void opreste(){
        this.setPornita(false);
    }
    
     @Override
    public String toString() {
        return "Lampa are seria "+this.serie+" si marimea becului de "+this.marime_bec+" cm"+" inaltimea de "+this.inaltime+" cm "+"are culoarea "+this.culoare+" are baterie: "+this.cuBaterie;
    }
}
