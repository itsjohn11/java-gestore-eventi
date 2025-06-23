package org.event;

import java.time.LocalDate;

import java.time.LocalDate;

public class Evento {

   //valorizzo gli attrobuti 

   private String titolo; 
   private LocalDate data;
   private int[] postiTotali;
   private int postiPrenotati = 0;

   //Costruttore
   public Evento(String titolo, LocalDate data, int[] postiTotali2) {
      this.titolo = titolo;
      this.data = data;
      this.postiTotali = postiTotali2;
      
   }

   int dataNow = 01/10/2025 ;
   boolean now = true;

   // for (int i = 0; i < data.length; i++){
   // int dataCorrente = data[i];
   // System.out.println(dataCorrente); 

   
   LocalDate dateNow = LocalDate.now();


   public String getTitolo() {
      return this.titolo;
   }

   public void setTitolo(String titolo) {
      this.titolo = titolo;  
   }

   public LocalDate getData() {
      return this.data;
   }

   public void setData(LocalDate data) {
      this.data = data;

   }

   public int[] getPostiTotali(){
      return this.postiTotali;
   }


   public int getPostiPrenotati(){
      return this.postiPrenotati;
   }

   //Aggiungi posto
   public void addPosto(int nuovoTotale){
      int[] nuovoPosto = new int [this.postiTotali.length + 1];
      
      for(int i = 0; i < this.postiTotali.length; i++){
         nuovoPosto[i] = this.postiTotali[i];
      }

      nuovoPosto[nuovoPosto.length] = nuovoTotale;
      this.postiTotali = nuovoPosto;
      // return this.postiTotali[++this.postiPrenotati] ;
   }

   //rimuovi posto
   public void removeTotale(int nuovoTotale){
      int[] nuoviTotali = new int [this.postiTotali.length - 1];
      
      for(int i = 0; i < this.postiTotali.length; i--){
         nuoviTotali[i] = this.postiTotali[i];
      }

      nuoviTotali[nuoviTotali.length] = nuovoTotale;
      this.postiTotali = nuoviTotali;
      // return this.postiTotali[++this.postiPrenotati] ;
   }


   public boolean hasAncoraPosti(){
      return this.postiPrenotati < this.postiTotali.length - 1;
   }


   @Override
   public String toString(){
      return String.format("%d, %s", this.data, this.titolo);
   }




 


   

}
