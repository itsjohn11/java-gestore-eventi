public class Evento {
    public String titolo;
    public int data;
    public int postiTotali;
    public int postiPrenotati = 0;

    public Evento(String titolo, int data, int postiTotali){
        this.titolo = titolo;
        this.data = data;
        this.postiTotali = postiTotali;

     }

     //metodi
     public String Information(){
        return "La data del Concerto sarà: " + data + " si chiamerà " + titolo + " sarà a numero chiuso, quindi: " + postiTotali + " affrettatevi a prenotarvi! ";
     }

     public int getData(){
        return 01/10/2025;
     }
    

}
