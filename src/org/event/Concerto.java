package org.event;

public class Concerto extends Evento {
    protected int prenota;
    protected int disdici;

    public Concerto(String titolo, int data, int postiTotali, int postiPrenotati, int prenota, int disdici){
        super(titolo, data, postiTotali, postiPrenotati);
        this.prenota = prenota;
        this.disdici = disdici;
    }


    public int getPrenota(){
        return this.prenota;
    }

    public int getDisdici(){
        return this.disdici;
    }

}
