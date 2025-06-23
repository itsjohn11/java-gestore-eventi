package org.event;


import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {
    private LocalTime ora;
    private float prezzo;

    public Concerto(String titolo, LocalDate data, int[] postiTotali, LocalTime ora, float prezzo) {
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
        
     }
     public LocalTime getOra(){
        return this.ora;
     }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }


    @Override
    public String toString(){
        return String.format(%d,%d, %s, %d, this.data, this.ora, this.titolo, this.prezzo);
    }


}
