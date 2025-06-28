package org.event;


public class Concerto extends Evento {
    private double ora;
    private double prezzo;

    public Concerto(String titolo, int data, int postiTotali, double ora, double prezzo) {
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
        
     }
     public double getOra(){
        return this.ora;
     }

    public void setOra(double ora) {
        this.ora = ora;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        // String prezzoFormattato = prezzo.
        this.prezzo = prezzo;
    }

    @Override
    public String toString(){
        return super.toString() + ", ora: " + this.ora + ", prezzo: " + this.prezzo;
    }


}
