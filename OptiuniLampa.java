package com.mycompany.proiect_java;

public  abstract class OptiuniLampa {
    private boolean pornita;
    
    public OptiuniLampa(){ //Constructor fara argumente
        this.pornita=false;
    }
    public boolean ONsauOFF(){ //getter
        return this.pornita;
    }
    public void setPornita(boolean pornita){ //setter
        this.pornita=pornita;
    }
    //metode
    public abstract void porneste();
    public abstract void opreste();
    
}
