public class LampaSmartInterior extends Lampa  {
    private boolean areWifi;
    private String aplicatieControl;
    
    //constructor fara argumente
    public LampaSmartInterior() {
        super();
        this.areWifi = false;
        this.aplicatieControl = "necunoscuta";
    }
    
    //constructor cu toate argumentele
    public LampaSmartInterior(boolean estePornita, int intensitateLumina, String culoareLumina, double consumEnergetic, String tipLampa, boolean areWifi, String aplicatieControl) {
        super(estePornita, intensitateLumina, culoareLumina, consumEnergetic, tipLampa);
        this.areWifi = areWifi;
        this.aplicatieControl = aplicatieControl;
    }
    
    //constructor de copiere
    public LampaSmartInterior(LampaSmartInterior altaLampaSmart) {
        super(altaLampaSmart);
        this.areWifi = altaLampaSmart.areWifi;
        this.aplicationControl = altaLampaSmart.aplicatieControl;
    }

    @Override
    public String toString() {
        return "LampaSmartInterior{" + "areWifi=" + areWifi + ", aplicatieControl=" + aplicatieControl + '}';
    }
    
}

