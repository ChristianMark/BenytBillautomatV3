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
       // return "Log_event{" + "tidspunkt=" + tidspunkt + ", handling=" + handling + ", paremetre=" + paremetre + ", montoer_tilstand=" + montoer_tilstand + '}';
       if(paremetre != -1){
           return tidspunkt+ "; "+ handling + "; Kaldet med paremeteren: "+paremetre+ "; Montoertilstand: "+montoer_tilstand;
       }else{
           return tidspunkt+ "; "+ handling + "; Montoertilstand: "+montoer_tilstand;
       }
       
    }
    
    private final Date tidspunkt;
    private final String handling;
    private final int paremetre;
    private final boolean montoer_tilstand;
    public static int antal_events;
    
    /**
     * Konstruktør med 3 paremetre der opretter et objekt
     */
    public Log_event(String string, int paremetre, boolean erMontoer) {
        this.tidspunkt = new Date();
        this.handling = string;
        this.paremetre = paremetre;
        this.montoer_tilstand = erMontoer;
        antal_events++;
    }
    
    /**
     * Konstruktør med 2 paremetre der kalder konstruktøren med 4 paremetre
     */
    public Log_event(String string, boolean erMontoer) {
        this(string, -1, erMontoer);
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
