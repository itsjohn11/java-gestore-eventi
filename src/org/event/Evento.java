package org.event;

public class Evento {

   public String titolo;
   public int data;
   private int[] postiTotali;
   private int postiPrenotati = 0;

   public Evento(String titolo, int data, int postiTotali, int postiPrenotati) {
      this.titolo = titolo;
      this.data = data;
      this.postiPrenotati = postiPrenotati;
   }

   // int dataAttuale = ;
   // boolean adesso = true;

   // for (int i = 0; i < data.length; i++){
   // int dataCorrente = data[i];
   // System.out.println(dataCorrente);

   // if(dataCorrente == dataAttuale){
   // adesso = true;
   // }else {
   // adesso = false;
   // }
   // }

   // metodi
   // public String Information() {
   //    return "La data dell'evento sarà: " + data + " si chiamerà " + titolo + " sarà a numero chiuso, quindi: "
   //          + postiTotali + " affrettatevi a prenotarvi! ";
   // }

   public String getTitolo() {
      return titolo;
   }

   public void setTitolo(String titolo) {
      this.titolo = titolo;
   }

   public int getData() {
      return data;
   }

   public void setData(int data) {
      this.data = data;
   }

   public void setPostiPrenotati(int postiPrenotati){
         this.postiPrenotati = postiPrenotati; 
       }

   public void setPostiTotali( int postiTotali){ 
      }

   

}
