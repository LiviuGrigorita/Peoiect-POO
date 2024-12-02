package com.mycompany.proiect_java;

public class LampaInterioara extends Lampa {
    private boolean pornita;
    private boolean conectata;
    private int nivel_iluminare;
    private String tip_abajur; // Specific lămpilor de interior (ex: material, design)
    private boolean dimmable; // Dacă nivelul de iluminare este ajustabil

    public LampaInterioara() {
        super();
        this.conectata = false;
        this.pornita = false;
        this.nivel_iluminare = 0;
        this.tip_abajur = "necunoscut";
        this.dimmable = false;
    }

    public LampaInterioara(LampaInterioara obj) {
        super(obj);
        if (obj != null) {
            this.conectata = obj.conectata;
            this.pornita = obj.pornita;
            this.nivel_iluminare = obj.nivel_iluminare;
            this.tip_abajur = obj.tip_abajur;
            this.dimmable = obj.dimmable;
        }
    }

    public LampaInterioara(String serie, int marime_bec, int inaltime, String culoare, boolean cuBaterie, 
                           boolean conectata, boolean pornita, int nivel_iluminare, String tip_abajur, boolean dimmable) {
        super(marime_bec, serie, inaltime, culoare, cuBaterie);
        this.conectata = conectata;
        this.pornita = pornita;
        this.nivel_iluminare = nivel_iluminare;
        this.tip_abajur = tip_abajur;
        this.dimmable = dimmable;
    }

    public void setPornita(boolean pornita) {
        this.pornita = pornita;
    }

    public boolean isPornita() {
        return this.pornita;
    }

    public void setConectata(boolean conectata) {
        this.conectata = conectata;
    }

    public boolean isConectata() {
        return this.conectata;
    }

    public void setNivelIluminare(int nivel_iluminare) {
        this.nivel_iluminare = nivel_iluminare;
    }

    public int getNivelIluminare() {
        return this.nivel_iluminare;
    }

    public void setTipAbajur(String tip_abajur) {
        this.tip_abajur = tip_abajur;
    }

    public String getTipAbajur() {
        return this.tip_abajur;
    }

    public void setDimmable(boolean dimmable) {
        this.dimmable = dimmable;
    }

    public boolean isDimmable() {
        return this.dimmable;
    }

    @Override
    public String toString() {
        return "LampaInterioara{" +
                "conectata=" + conectata +
                ", pornita=" + pornita +
                ", nivel_iluminare=" + nivel_iluminare +
                ", tip_abajur='" + tip_abajur + '\'' +
                ", dimmable=" + dimmable +
                ", " + super.toString() +
                '}';
    }
}
