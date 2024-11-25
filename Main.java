package com.mycompany.proiect_java;

/**
 *
 * @author jh0nix
 */
public class Proiect_java {

    public static void main(String[] args) {
        Lampa l1= new Lampa();
        System.out.println(l1);
        LampaExterioara e1=new LampaExterioara();
        System.out.println(e1);
        SursaIluminat s1=new SursaIluminat();
        System.out.println(s1);
         LampaExterioara lampaExterioara = new LampaExterioara();
         lampaExterioara.setrezistent_apa(true);
         System.out.println(lampaExterioara);
         lampaExterioara.porneste();
         l1.porneste();
        System.out.println("este pornita? "+l1.ONsauOFF());
        System.out.println("este pornita? "+lampaExterioara.ONsauOFF());
    }
}
