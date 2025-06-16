package org.event;

import java.math.BigDecimal;

public class Concerto extends Evento {
    public int ora;
    public BigDecimal prezzo;

    public Concerto(String titolo, int data, int postiTotali int ora, BigDecimal prezzo) {
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
        
     }
     public int getOra(){
        return this.ora;
     }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }





}
