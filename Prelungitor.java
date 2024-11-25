package com.mycompany.proiect_java;

public class Prelungitor extends Lampa {
    private int numarPrize;
    private double lungimeCablu;
    private boolean protectieSupratensiune;
    private String tipConector;
    private int putereMaxima;

    public Prelungitor() {
        super();
        this.numarPrize = 0;
        this.lungimeCablu = 0.0;
        this.protectieSupratensiune = false;
        this.tipConector = "necunoscut";
        this.putereMaxima = 0;
    }

    public Prelungitor(int numarPrize, double lungimeCablu, boolean protectieSupratensiune, String tipConector, int putereMaxima, int marime_bec, String serie, int inaltime, String culoare, boolean cuBaterie) {
        super(marime_bec, serie, inaltime, culoare, cuBaterie);
        this.numarPrize = numarPrize;
        this.lungimeCablu = lungimeCablu;
        this.protectieSupratensiune = protectieSupratensiune;
        this.tipConector = tipConector;
        this.putereMaxima = putereMaxima;
    }

    public Prelungitor(Prelungitor obj) {
        super(obj);
        if (obj != null) {
            this.numarPrize = obj.numarPrize;
            this.lungimeCablu = obj.lungimeCablu;
            this.protectieSupratensiune = obj.protectieSupratensiune;
            this.tipConector = obj.tipConector;
            this.putereMaxima = obj.putereMaxima;
        }
    }

    public void setNumarPrize(int numarPrize) {
        this.numarPrize = numarPrize;
    }

    public int getNumarPrize() {
        return this.numarPrize;
    }

    public void setLungimeCablu(double lungimeCablu) {
        this.lungimeCablu = lungimeCablu;
    }

    public double getLungimeCablu() {
        return this.lungimeCablu;
    }

    public void setProtectieSupratensiune(boolean protectieSupratensiune) {
        this.protectieSupratensiune = protectieSupratensiune;
    }

    public boolean getProtectieSupratensiune() {
        return this.protectieSupratensiune;
    }

    public void setTipConector(String tipConector) {
        this.tipConector = tipConector;
    }

    public String getTipConector() {
        return this.tipConector;
    }

    public void setPutereMaxima(int putereMaxima) {
        this.putereMaxima = putereMaxima;
    }

    public int getPutereMaxima() {
        return this.putereMaxima;
    }

    @Override
    public String toString() {
        return "Prelungitor{" +
                "numarPrize=" + numarPrize +
                ", lungimeCablu=" + lungimeCablu +
                ", protectieSupratensiune=" + protectieSupratensiune +
                ", tipConector='" + tipConector + '\'' +
                ", putereMaxima=" + putereMaxima +
                ", " + super.toString() +
                '}';
    }
}
