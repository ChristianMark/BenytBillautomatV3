/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import java.util.Date;

/**
 *
 * @author chris
 */
class Log_event {

    @Override
    public String toString() {
        // returner string af handling i tekst
        return tidspunkt+ "; "+ handling + "; Montoertilstand: "+montoer_tilstand;
       
       
    }
    
    private final Date tidspunkt;
    private final String handling;
    private final int paremetre;
    private final boolean montoer_tilstand;
    public static int antal_events;
    public final boolean sucess;
    public final int id_nr;
    
    /**
     * Konstruktør med 3 paremetre der opretter et objekt
     */
    public Log_event(int id, int paremetre, boolean sucess, boolean erMontoer) {
        this.tidspunkt = new Date();
        this.id_nr = id;
        this.paremetre = paremetre;
        this.sucess = sucess;
        this.montoer_tilstand = erMontoer;
        antal_events++;
        
        //switch statement som giver handlingen sin beskrivelse ud fra id_nr og sucess boolean
        switch(id_nr){
           case 1 : 
                //oprettelse af automaten
                if (this.sucess){
                    this.handling = "Opsaetning af automat gennemfoert";
                } else {
                    this.handling = "FEJL";
                }
                break;
                
           case 2 :
               //insæt penge
               if (this.sucess){
                   this.handling = "Der blev indsat beloebet: " +this.paremetre;
               }else{
                   this.handling = "Der blev forsøgt indsat det ugyldige beloeb: " +this.paremetre;
               }
               break;
               
           case 3 :
               //udskrivning af billet
               if (this.sucess){
                   this.handling = "Der blev udskrevet en billet";
               }else{
                   this.handling = "Der blev forsøgt udskrevet en billet, men dette fejlede";
               }
               break;
               
           case 4 :
               //retunerer penge
               if (this.sucess){
                   this.handling = "Der blev tilbagebetalt beloebet: "+ this.paremetre;
               }else {
                   this.handling = "Der blev forsøgt retuneret beløbet: "+this.paremetre;
               }
               break;
               
           case 5 :
               //montørloggin
               //Loggen kan ikke kende forskel på koden "0123" og "123" da en sting konverteres til int
               if (this.sucess){
                   this.handling = "Der blev logget ind som montoer med koden: "+this.paremetre;
               }else{
                   if (this.montoer_tilstand){
                       this.handling = "Der blev logget ud af montoertilstanden, med koden: " + this.paremetre;
                   }else{
                       this.handling = "Ugyldigt montoerlogin registreret med adgangskoden: "+this.paremetre;
                   }//end if..else - montoer_tilstand
               }//end if .. else sucess
               break;
               
           case 6:
               //ændring af billetpris
                if (this.sucess){
                   this.handling = "Billetprisen blev sucessfuldt ændret til: "+ this.paremetre;
                } else {
                   if (this.montoer_tilstand){
                       this.handling = "Billetprisen blev forsoegt aendret af montoeren til: "+this.paremetre;
                   } else {
                       this.handling = "Billetprisen blev forsoegt aendret af kunden til: "+this.paremetre;
                   }//end if..else - montoer_tilstand
                }//end if..else - sucess
                break;
               
           case 7:
               //Ændring i antal af biletter solgt
                if (this.sucess){
                   this.handling = "Antallet af solgte billetter blev aendret til: "+ this.paremetre;
                } else {
                    this.handling = "Antallet af solgte billetter blev forsoegt aendret af kunden til: "+this.paremetre;
                }//end if..else - sucess
                break;
                
           case 8:
               //udskriv loggen
               if (this.sucess){
                   this.handling = "Loggen er blevet udskrevet af montoeren";
               } else {
                   this.handling = "Loggen er blevet forsoegt udskrevet af kunden";
               }
               break;
               
           case 9:
               //nulstil maskinen
               if (this.sucess){
                   this.handling = "Automaten er blevet nulstillet af montoeren";
               } else {
                   this.handling = "Automaten er blevet forsoegt nulstillet af kunden";
               }
               break;
               
           default : 
               this.handling = "Ukendt id_nr. Dette er en fejl; se parameterher: "+this.paremetre;
               break;
               
       }
    }
    
    /**
     * Konstruktør med 2 paremetre der kalder konstruktøren med 4 paremetre
     */
    public Log_event(int id, boolean erMontoer) {
        this(id, -1, true, erMontoer);
    }
     public Log_event (int id, boolean sucess, boolean erMontoer){
         this(id, -1, sucess, erMontoer);
     }
    
    public Date getTidspunkt() {
        return tidspunkt;
    }

    public String getHandling() {
        return handling;
    }

    public int getParemetre() {
        return paremetre;
    }

    public boolean isMontoer_tilstand() {
        return montoer_tilstand;
    }

    public static int getAntal_events() {
        return antal_events;
    }

    
}
