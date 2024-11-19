public class Prelungitor {
    private int numarPrize;
    private boolean areProtectieSupratensiune;
    
    //constructor fara argumente 
    public Prelungitor() {
        this.numarPrize = 0;
        this.areProtectieSupratensiune = false;
    }
    //constructor cu toate argumentele
    public Prelungitor(int numarPrize, boolean areProtectieSupratensiune) {
        this.numarPrize = numarPrize;
        this.areProtectieSupratensiune = areProtectieSupratensiune;
    }
    //constructor de copiere
    public Prelungitor(Prelungitor altPrelungitor) {
        this.numarPrize = altPrelungitor.numarPrize;
        this.areProtectieSupratensiune = altPrelungitor.areProtectieSupratensiune;
        }
    //rescrierea metodei toString

    @Override
    public String toString() {
        return "Prelungitor{" + "numarPrize=" + numarPrize + ", areProtectieSupratensiune=" + areProtectieSupratensiune + '}';
    }
    
}
