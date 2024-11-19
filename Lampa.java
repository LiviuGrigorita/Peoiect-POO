 public class Lampa {
    private boolean estePornita;
    private int intensitateLumina;
    private String culoareLumina;
    private double consumEnergetic;
    private String tipLampa;
    
    //Constructor fara argumente
    public Lampa() {
        this.estePornita = false;
        this.intensitateLumina = 0;
        this.culoareLumina = "alb";
        this.consumEnergetic = 0.0;
        this.tipLampa = "necunoscut";
    }
   
    //Constructor cu toate argumentele
    public Lampa(boolean estePornita, int intensitateLumina, String culoareLumina, double consumEnergetic, String tipLampa) {
        this.estePornita = estePornita;
        this.intensitateLumina = intensitateLumina;
        this.culoareLumina = culoareLumina;
        this.consumEnergetic = consumEnergetic;
        this.tipLampa = tipLampa;
    }
    
    //constructor de copiere
    public Lampa(Lampa altaLampa) {
        this.estePornita = altaLampa.estePornita;
        this.intensitateLumina = altaLampa.intensitateLumina;
        this.culoareLumina = altaLampa.culoareLumina;
        this.consumEnergetic = altaLampa.consumEnergetic;
        this.tipLampa = altaLampa.tipLampa;
    }
     

    //Get si set
    public boolean isEstePornita() {
        return estePornita;
    }
    public void setEstePornita(boolean estePornita) {
        this.estePornita = estePornita;
    }
    public int getIntensitateLumina() {
        return intensitateLumina;
    }
    public void setIntensitateLumina(int intensitateLumina) {
        this.intensitateLumina = intensitateLumina;
    }
    public String getCuloareLumina() {
        return culoareLumina;
    }
    public void setCuloareLumina(String culoareLumina) {
        this.culoareLumina = culoareLumina;
    }
    public double getConsumEnergetic() {
        return consumEnergetic;
    }
    public void setConsumEnergetic(double consumEnergetic) {
        this.consumEnergetic = consumEnergetic;
    }
    public String getTipLampa() {
        return tipLampa;
    }
    public void setTipLampa(String tipLampa) {
        this.tipLampa = tipLampa;
    }
    
    //Metoda toString

    @Override
    public String toString() {
        return "Lampa{" + "estePornita=" + estePornita + ", intensitateLumina=" + intensitateLumina + ", culoareLumina=" + culoareLumina + ", consumEnergetic=" + consumEnergetic + ", tipLampa=" + tipLampa + '}';
    }
}