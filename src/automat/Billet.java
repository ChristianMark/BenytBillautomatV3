/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import java.util.Date;

/**
 *
 * @author john
 */
public class Billet {
    private int pris;
    private String navn;
    private int zoner;
    private int prisPrZone;
    private int type;
    
    
    //class variables
    private static int voksenPris = 12;
    private static int voksenPrisPrZone = 7;
    
    private static int ungdomsPris = 10;
    private static int ungdomsPrisPrZone = 5;
    
    private static int barnePris = 7;
    private static int barnePrisPrZone = 4;
    
    private static int studenterPris = 10;
    private static int studenterPrisPrZone = 5;
    
    private static int cykelPris = 15;
    private static int cykelPrisPrZone = 9;
    
    //calculating variable
    public static final long HOUR = 3600*1000;
    
    Billet(int type, int z){
        if (type < 0 || z < 0 || type > 4){
            System.err.println("Forkert billet kald, en int parameter er under 0");
            System.out.println("Grundet fejl oprettes der en standard billet til 2 zoner");
            type = 0;       
        }
        
        switch (type){
            case 0 : //voksen billet
                this.pris = voksenPris;
                this.navn = "Voksen Billet";
                this.prisPrZone = voksenPrisPrZone;
                break;
            case 1 : //ungdoms billet
                this.pris = ungdomsPris;
                this.navn = "Ungdoms Billet";
                this.prisPrZone = ungdomsPrisPrZone;
                break;
            
            case 2 : //barne billet
                this.pris = barnePris;
                this.navn = "Barne Billet";
                this.prisPrZone = barnePrisPrZone;
                break;
            
            case 3 : //studenter billet
                this.pris = studenterPris;
                this.navn = "Studenter Billet";
                this.prisPrZone = studenterPrisPrZone;
                break;
                
            case 4 : //cykel billet
                this.pris = cykelPris;
                this.navn = "Cykel Billet";
                this.prisPrZone = cykelPrisPrZone;
                break;
            default:
                break;
                
                
        }

        this.type = type;
        this.zoner = z;
    }
    
    
    int getTotalPris(){
        if (zoner <= 2){
            return pris;
        } else {
            return pris + prisPrZone * (zoner-2);
        }
    }
    
    Date getUdløbstidspunkt(){
        Date udløb = new Date();
        if (zoner > 5){
            udløb = new Date(udløb.getTime() + 3 * HOUR);
        } else if (zoner > 2){
            udløb = new Date(udløb.getTime() + 2 * HOUR);
        } else {
            udløb = new Date(udløb.getTime() + 1 * HOUR);
        }
        return udløb;
    }
    
    static int getBilletPris(int type){
        switch (type){
            case 0 : //voksen billet
                return voksenPris;
                
            case 1 ://ungdoms billet
                return ungdomsPris;
            
            case 2 : //barne billet
                return barnePris;
            
            case 3 : //studenter billet
                return studenterPris;
                                
            case 4 : //cykel billet
                return cykelPris;
               
            default:
                return -1;
        }
    }
    
    static void setBilletPris(int type, int value){
        if (value > 0){
            switch (type){
                case 0 : //voksen billet
                    voksenPris = value;

                case 1 ://ungdoms billet
                    ungdomsPris = value;

                case 2 : //barne billet
                    barnePris = value;

                case 3 : //studenter billet
                    studenterPris = value;

                case 4 : //cykel billet
                    cykelPris = value;

                default:
                    break;
            }
        }
    }
    
    static int getBilletPrisPerZone(int type){
        switch (type){
            case 0 : //voksen billet
                return voksenPrisPrZone;
                
            case 1 ://ungdoms billet
                return ungdomsPrisPrZone;
            
            case 2 : //barne billet
                return barnePrisPrZone;
            
            case 3 : //studenter billet
                return studenterPrisPrZone;
                                
            case 4 : //cykel billet
                return cykelPrisPrZone;
               
            default:
                return -1;
        }
    }
    
    static void setBilletPrisPerZone(int type, int value){
        if (value > 0){
            switch (type){
                case 0 : //voksen billet
                    voksenPrisPrZone = value;

                case 1 ://ungdoms billet
                    ungdomsPrisPrZone = value;

                case 2 : //barne billet
                    barnePrisPrZone = value;

                case 3 : //studenter billet
                    studenterPrisPrZone = value;

                case 4 : //cykel billet
                    cykelPrisPrZone = value;

                default:
                    break;
            }
        }
    }

    public int getZoner() {
        return zoner;
    }

    public void setZoner(int z) {
        this.zoner = z;
    }

    public int getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public int getPrisPrZone() {
        return prisPrZone;
    }
    
    public static int getVoksenPris() {
        return voksenPris;
    }

    public static void setVoksenPris(int voksenPris) {
        Billet.voksenPris = voksenPris;
    }

    public static int getVoksenPrisPrZone() {
        return voksenPrisPrZone;
    }

    public static void setVoksenPrisPrZone(int voksenPrisPrZone) {
        Billet.voksenPrisPrZone = voksenPrisPrZone;
    }

    public static int getUngdomsPris() {
        return ungdomsPris;
    }

    public static void setUngdomsPris(int ungdomsPris) {
        Billet.ungdomsPris = ungdomsPris;
    }

    public static int getUngdomsPrisPrZone() {
        return ungdomsPrisPrZone;
    }

    public static void setUngdomsPrisPrZone(int ungdomsPrisPrZone) {
        Billet.ungdomsPrisPrZone = ungdomsPrisPrZone;
    }

    public static int getBarnePris() {
        return barnePris;
    }

    public static void setBarnePris(int barnePris) {
        Billet.barnePris = barnePris;
    }

    public static int getBarnePrisPrZone() {
        return barnePrisPrZone;
    }

    public static void setBarnePrisPrZone(int barnePrisPrZone) {
        Billet.barnePrisPrZone = barnePrisPrZone;
    }

    public static int getStudenterPris() {
        return studenterPris;
    }

    public static void setStudenterPris(int studenterPris) {
        Billet.studenterPris = studenterPris;
    }

    public static int getStudenterPrisPrZone() {
        return studenterPrisPrZone;
    }

    public static void setStudenterPrisPrZone(int studenterPrisPrZone) {
        Billet.studenterPrisPrZone = studenterPrisPrZone;
    }

    public static int getCykelPris() {
        return cykelPris;
    }

    public static void setCykelPris(int cykelPris) {
        Billet.cykelPris = cykelPris;
    }

    public static int getCykelPrisPrZone() {
        return cykelPrisPrZone;
    }

    public static void setCykelPrisPrZone(int cykelPrisPrZone) {
        Billet.cykelPrisPrZone = cykelPrisPrZone;
    }
    
}
