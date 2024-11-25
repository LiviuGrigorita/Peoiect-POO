package com.mycompany.proiect_java;

public class LampaInterioara extends Lampa {
    private boolean pornita;
    private boolean conectata;
    private String tipBec;
    private boolean areAbajur;
    private int nivelLuminozitate;

    public LampaInterioara() {
        super();
        this.conectata = false;
        this.pornita = false;
        this.tipBec = "necunoscut";
        this.areAbajur = false;
        this.nivelLuminozitate = 0;
    }

    public LampaInterioara(boolean pornita, boolean conectata, String serie, int marime_bec, int inaltime, String culoare, boolean cuBaterie, String tipBec, boolean areAbajur) {
        super(marime_bec, serie, inaltime, culoare, cuBaterie);
        this.conectata = conectata;
        this.pornita = pornita;
        this.tipBec = tipBec;
        this.areAbajur = areAbajur;
    }

    public LampaInterioara(LampaInterioara obj) {
        super(obj);
        if (obj != null) {
            this.conectata = obj.conectata;
            this.pornita = obj.pornita;
            this.tipBec = obj.tipBec;
            this.areAbajur = obj.areAbajur;
            this.nivelLuminozitate = obj.nivelLuminozitate;
        }
    }

    public void setTipBec(String tipBec) {
        this.tipBec = tipBec;
    }

    public String getTipBec() {
        return this.tipBec;
    }

    public void setAreAbajur(boolean areAbajur) {
        this.areAbajur = areAbajur;
    }

    public boolean getAreAbajur() {
        return this.areAbajur;
    }

    public void setNivelLuminozitate(int nivelLuminozitate) {
        this.nivelLuminozitate = nivelLuminozitate;
    }

    public int getNivelLuminozitate() {
        return this.nivelLuminozitate;
    }
