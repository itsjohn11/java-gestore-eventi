package org.event;

// import java.time.LocalDate;

public class Evento {

   //valorizzo gli attrobuti 

   public String titolo; 
   public int data;
   public int[] postiTotali;
   public int postiPrenotati = 0;

   //Costruttore
   public Evento(String titolo, int data, int postiTotali) {
      this.titolo = titolo;
      this.data = data;
      this.postiTotali = postiTotali;
      
   }

   // int dataAttuale = ;
   // boolean adesso = true;

   // for (int i = 0; i < data.length; i++){
   // int dataCorrente = data[i];
   // System.out.println(dataCorrente); 

   // int i = 0;
   // while(i > postiTotali.length ){
   //    System.out.println(postiTotali[i]);
   //    i++;
   // }



   // LocalDate dateEvent = LocalDate.event();
   // LocalDate dateNow = LocalDate.now();

   // if()



   public String getTitolo() {
      return this.titolo;
   }

   public void setTitolo(String titolo) {
      this.titolo = titolo;  
   }

   public int getData() {
      return this.data;
   }

   public void setData(int data) {
      this.data = data;

   }

   public int[] getPostiTotali(){
      return this.postiTotali;
   }

   public int getPostiPrenotati(){
      return this.postiPrenotati;
   }

   public int getPostoSuccessivo(){
      if(hasAncoraPosti()){
         this.postiPrenotati = this.postiPrenotati +1;
         return this.postiTotali[this.postiPrenotati];
      }else{
         return 0;
      }
   }

   public void addTotale(int nuovoTotale){
      int[] nuoviTotali = new int [this.postiTotali.length + 1];
      nuoviTotali[0] = nuovoTotale;
      for(int i = 0; i < this.postiTotali.length; i++){
         nuoviTotali[i + 1] = this.postiTotali[i];
      }
      nuoviTotali[nuoviTotali.length -1] = nuovoTotale;
      this.postiTotali = nuoviTotali;
      // return this.postiTotali[++this.postiPrenotati] ;
   }


   public boolean hasAncoraPosti(){
      return this.postiPrenotati < this.postiTotali.length - 1;
   }


   @Override
   public String toString(){
      return String.format(this.titolo, "%d");
   }







   

}
