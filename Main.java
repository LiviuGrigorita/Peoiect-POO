public class Main {
    public static void main(String[] args) {
        //obiect Lampa
        Lampa lampa = new Lampa(true, 75, "galben", 12.5, "LED");
        System.out.println(lampa);
        
        //obiect LampaSmartInterior
        LampaSmartInterior lampaSmart = new LampaSmartInterior(true, 90, "RGB", 15.0, "Smart LED", true, "Phillips");
        System.out.println(lampaSmart);
        
        //Obiect Prelungitor
        Prelungitor prelungitor = new Prelungitor(5, true);
        System.out.println(prelungitor);
    }
}