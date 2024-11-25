package com.mycompany.proiect_java;

public class Proiect_java {

    public static void main(String[] args) {
        Lampa l1= new Lampa();
        System.out.println(l1);
        LampaInterioara e1=new LampaInterioara();
        System.out.println(e1);
        Prelungitor s1=new Prelungitor();
        System.out.println(s1);
        
        LampaInterioara lampaInterioara = new LampaInterioara();
lampaInterioara.setTipBec("LED");
lampaInterioara.setAreAbajur(true);
lampaInterioara.setNivelLuminozitate(5);
System.out.println(lampaInterioara);

lampaInterioara.porneste();
System.out.println("Este pornită? " + lampaInterioara.ONsauOFF());
    }
    
    Prelungitor prelungitor = new Prelungitor();
prelungitor.setNumarPrize(4);
prelungitor.setLungimeCablu(3.5);
prelungitor.setProtectieSupratensiune(true);
prelungitor.setTipConector("Schuko");
prelungitor.setPutereMaxima(2500);
System.out.println(prelungitor);

if (prelungitor.getProtectieSupratensiune()) {
    System.out.println("Prelungitorul are protecție la supratensiune activată.");
  }
}
