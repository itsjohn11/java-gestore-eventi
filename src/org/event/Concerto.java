package org.event;

public class Concerto extends Evento {

    public Concerto(String titolo, int data, int postiTotali) {
        super(titolo, data, postiTotali, postiTotali);
        this.data = data;
    }

    int prenota = ();
    int disdici = ();

    public int prenota(){
        return this.prenota;
    }

    public int disdici(){
        return this.disdici;
    }
    
}
