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
    private double pris;
    private String navn;
    private int zoner;
    private double prisPrZone;
    private int type;
    
    
    //class variables
    private static double voksenPris = 12;
    private static double voksenPrisPrZone = 7;
    
    private static double ungdomsPris = 10;
    private static double ungdomsPrisPrZone = 5;
    
    private static double barnePris = 7;
    private static double barnePrisPrZone = 4;
    
    private static double studenterPris = 10;
    private static double studenterPrisPrZone = 5;
    
    private static double cykelPris = 15;
    private static double cykelPrisPrZone = 9;
    
    //calculating variable
    public static final long HOUR = 3600*1000;
    
    Billet(int type, int z){
        if (type < 0 || z < 0 || type > 4){
            System.err.println("Forkert billet kald, en int parameter er under 0 eller over 4");
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
            
            case 2 : //børn billet
                this.pris = barnePris;
                this.navn = "Børne Billet";
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
    
    
    double getTotalPris(){
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
    
    static double getBilletPris(int type){
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
                System.out.println("Ugyldig billettype.");
                return -1;
        }
    }
    
    static void setBilletPris(int type, double value){
        if (value > 0){
            switch (type){
                case 0 : //voksen billet
                    voksenPris = value;
                    break;

                case 1 ://ungdoms billet
                    ungdomsPris = value;
                    break;

                case 2 : //barne billet
                    barnePris = value;
                    break;

                case 3 : //studenter billet
                    studenterPris = value;
                    break;

                case 4 : //cykel billet
                    cykelPris = value;
                    break;

                default:
                    System.out.println("Ugyldig billettype.");
                    break;
            }
        }
    }
    
    static double getBilletPrisPerZone(int type){
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
                System.out.println("Ugyldig billettype.");
                return -1;
        }
    }
    
    static void setBilletPrisPerZone(int type, double value){
        if (value > 0){
            switch (type){
                case 0 : //voksen billet
                    voksenPrisPrZone = value;
                    break;

                case 1 ://ungdoms billet
                    ungdomsPrisPrZone = value;
                    break;

                case 2 : //barne billet
                    barnePrisPrZone = value;
                    break;

                case 3 : //studenter billet
                    studenterPrisPrZone = value;
                    break;

                case 4 : //cykel billet
                    cykelPrisPrZone = value;
                    break;

                default:
                    System.out.println("Ugyldig billettype.");
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

    public double getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public double getPrisPrZone() {
        return prisPrZone;
    }
    
    public static double getVoksenPris() {
        return voksenPris;
    }

    public static void setVoksenPris(double voksenPris) {
        Billet.voksenPris = voksenPris;
    }

    public static double getVoksenPrisPrZone() {
        return voksenPrisPrZone;
    }

    public static void setVoksenPrisPrZone(double voksenPrisPrZone) {
        Billet.voksenPrisPrZone = voksenPrisPrZone;
    }

    public static double getUngdomsPris() {
        return ungdomsPris;
    }

    public static void setUngdomsPris(double ungdomsPris) {
        Billet.ungdomsPris = ungdomsPris;
    }

    public static double getUngdomsPrisPrZone() {
        return ungdomsPrisPrZone;
    }

    public static void setUngdomsPrisPrZone(double ungdomsPrisPrZone) {
        Billet.ungdomsPrisPrZone = ungdomsPrisPrZone;
    }

    public static double getBarnePris() {
        return barnePris;
    }

    public static void setBarnePris(double barnePris) {
        Billet.barnePris = barnePris;
    }

    public static double getBarnePrisPrZone() {
        return barnePrisPrZone;
    }

    public static void setBarnePrisPrZone(double barnePrisPrZone) {
        Billet.barnePrisPrZone = barnePrisPrZone;
    }

    public static double getStudenterPris() {
        return studenterPris;
    }

    public static void setStudenterPris(double studenterPris) {
        Billet.studenterPris = studenterPris;
    }

    public static double getStudenterPrisPrZone() {
        return studenterPrisPrZone;
    }

    public static void setStudenterPrisPrZone(double studenterPrisPrZone) {
        Billet.studenterPrisPrZone = studenterPrisPrZone;
    }

    public static double getCykelPris() {
        return cykelPris;
    }

    public static void setCykelPris(int cykelPris) {
        Billet.cykelPris = cykelPris;
    }

    public static double getCykelPrisPrZone() {
        return cykelPrisPrZone;
    }

    public static void setCykelPrisPrZone(int cykelPrisPrZone) {
        Billet.cykelPrisPrZone = cykelPrisPrZone;
    }

    public int getType() {
        return type;
    }
    
    
}
