package com.mycompany.proiect_java;

public class Proiect_java {

    public static void main(String[] args) {
        Lampa l1 = new Lampa();
        LampaInterioara lampain = new LampaInterioara("25f", 23, 15, "rosie", true, true, false, 2, "Textil", true);
        
        System.out.println(l1);
        LampaInterioara e1 = new LampaInterioara();
        System.out.println(e1);
        SursaIluminat s1 = new SursaIluminat();
        System.out.println(s1);

        LampaInterioara lampaInterioara = new LampaInterioara();
        lampaInterioara.setTipAbajur("Sticlă");
        lampaInterioara.setDimmable(true);
        System.out.println(lampaInterioara);

        lampaInterioara.setPornita(true);
        l1.setpornita(true);

        System.out.println("Este pornită? " + l1.ONsauOFF());
        System.out.println("Este pornită? " + lampaInterioara.ONsauOFF());

        
        Object[] lampi = new Object[30];
        for (int i = 0; i < 10; i++) {
            lampi[i] = new Lampa(10 + i, "Seria" + i, 23 + i, "Maro", true);
        }
        for (int i = 10; i < 20; i++) {
            lampi[i] = new LampaInterioara("25f", 13 + i, 1 + i, "rosie", true, true, false, 2, "Plastic", false);
        }
        for (int i = 20; i < 30; i++) {
            lampi[i] = new SursaIluminat("26f", 5 + i, 1 + i, 30 + i, "Serie" + i, 40 - i, "rosie", false, "Priza", "calda");
        }

        
        for (int i = 0; i <= 29; i++) {
            System.out.println(lampi[i]);
        }

    
        System.out.println(lampain);

        LampaInterioara lam1 = new LampaInterioara(lampain);
        System.out.println(lam1);

        System.out.println("---------------------------------------------------------------------");

    
        for (Object obj : lampi) {
            if (obj instanceof Lampa) {
                Lampa lampa = (Lampa) obj;
                if (lampa.getInaltime() > 10 && lampa.getcuBaterie()) {
                    System.out.println("Lampa: " + lampa);
                }
            } else if (obj instanceof LampaInterioara) {
                LampaInterioara lampaInterioaraObj = (LampaInterioara) obj;
                if (lampaInterioaraObj.isPornita() && lampaInterioaraObj.isDimmable()) {
                    System.out.println("LampaInterioara: " + lampaInterioaraObj);
                }
            } else if (obj instanceof SursaIluminat) {
                SursaIluminat sursaIluminat = (SursaIluminat) obj;
                if (sursaIluminat.getputere() > 50 && sursaIluminat.getdurata_lumina() > 100) {
                    System.out.println("SursaIluminat: " + sursaIluminat);
                }
            }
        }
    }
}
