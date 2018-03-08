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
    private final int argument;
    private final boolean montoer_tilstand;
    public static int antal_events;
    private final boolean sucess;
    private final int id_nr;
    public static int hojestID = 19;
    
    /**
     * Konstruktør med 3 paremetre der opretter et objekt
     */
    public Log_event(int id, int argument, boolean sucess, boolean erMontoer) {
        if(0 > id || id > hojestID){
            System.err.println("Ugyldigt id: Mangler at blive talt med i hojestID");
        }
        this.tidspunkt = new Date();
        this.id_nr = id;
        this.argument = argument;
        this.sucess = sucess;
        this.montoer_tilstand = erMontoer;
        antal_events++;
        
        
        // This testning af søgekriterier efter dato
        //Date test = new Date();
        //this.tidspunkt = new Date(test.getTime() - (60*60*1000)); // Time
        //this.tidspunkt = new Date(test.getTime() - (60*60*1000*24)); // Dag
        //this.tidspunkt = new Date(test.getTime() - (60*60*1000*24*7)); // Uge
        //this.tidspunkt = new Date(test.getTime() - (60*60*1000*24*14)); // 14 dage      
        
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
                   this.handling = "Der blev indsat beloebet: " +this.argument;
               }else{
                   this.handling = "Der blev forsøgt indsat det ugyldige beloeb: " +this.argument;
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
                   this.handling = "Der blev tilbagebetalt beloebet: "+ this.argument;
               }else {
                   this.handling = "Der blev forsøgt retuneret beløbet: "+this.argument;
               }
               break;
               
           case 5 :
               //montørloggin
               //Loggen kan ikke kende forskel på koden "0123" og "123" da en sting konverteres til int
               if (this.sucess){
                   this.handling = "Der blev logget ind som montoer med koden: "+this.argument;
               }else{
                   if (this.montoer_tilstand){
                       this.handling = "Der blev logget ud af montoertilstanden, med koden: " + this.argument;
                   }else{
                       this.handling = "Ugyldigt montoerlogin registreret med adgangskoden: "+this.argument;
                   }//end if..else - montoer_tilstand
               }//end if .. else sucess
               break;
               
           case 6:
               //ændring af billetpris
                if (this.sucess){
                   this.handling = "Billetprisen blev sucessfuldt ændret til: "+ this.argument;
                } else {
                   if (this.montoer_tilstand){
                       this.handling = "Billetprisen blev forsoegt aendret af montoeren til: "+this.argument;
                   } else {
                       this.handling = "Billetprisen blev forsoegt aendret af kunden til: "+this.argument;
                   }//end if..else - montoer_tilstand
                }//end if..else - sucess
                break;
               
           case 7:
               //Ændring i antal af biletter solgt
                if (this.sucess){
                   this.handling = "Antallet af solgte billetter blev aendret til: "+ this.argument;
                } else {
                    this.handling = "Antallet af solgte billetter blev forsoegt aendret af kunden til: "+this.argument;
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
           
           case 10:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Der er blevet udskrevet en Voksen billet på:" + this.argument + "zoner";
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 11:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Der er blevet udskrevet en Ungdoms Billet på:" + this.argument + "zoner";
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 12:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Der er blevet udskrevet en Børne Billet på:" + this.argument + "zoner";
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 13:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Der er blevet udskrevet en Studenter Billet på:" + this.argument + "zoner";
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 14:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Der er blevet udskrevet en Cykel Billet på:" + this.argument + "zoner";
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
           
           case 15:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Antallet af Voksen Billetter solgt er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
           
           case 16:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Antallet af Ungdoms Billetter solgt er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 17:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Antallet af Børne Billetter solgt er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
           
           case 18:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Antallet af Studenter Billetter solgt er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 19:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Antallet af Cykel Billetter solgt er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
            
           case 20:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen på Voksen Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
           
           case 21:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen på Ungdoms Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 22:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen på Barne Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
           
           case 23:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen på Studenter Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 24:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen på Cykel Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 25:
               //Per zone for voksen billet er ændret
               if (this.sucess){
                   this.handling = "Prisen per zone for Voksen Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
           
           case 26:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen per zone for Ungdoms Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 27:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen per zone for Barne Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
           
           case 28:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen per zone for Studenter Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
               
           case 29:
               //Udskrevet voksen billet
               if (this.sucess){
                   this.handling = "Prisen per zone for Cykel Billetter er ændret til: " + this.argument;
               } else {
                   this.handling = "Der er sket en fejl";
               }
               break;
            
               
           default : 
               this.handling = "Ukendt id_nr. Dette er en fejl; se parameterher: "+this.argument;
               
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

    public int getArgument() {
        return argument;
    }

    public boolean isMontoer_tilstand() {
        return montoer_tilstand;
    }

    public static int getAntal_events() {
        return antal_events;
    }
    public boolean isSucess() {
        return sucess;
    }

    public int getId_nr() {
        return id_nr;
    }
    
}
