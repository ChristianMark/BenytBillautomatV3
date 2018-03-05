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
    private Date dato;
    
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
                this.pris = 12;
                this.navn = "Voksen Billet";
                this.prisPrZone = 7;
                break;
            case 1 :
                this.pris = 10;
                this.navn = "Ungdoms Billet";
                this.prisPrZone = 5;
                break;
            
            case 2 : //barne billet
                this.pris = 7;
                this.navn = "Barne Billet";
                this.prisPrZone = 4;
                break;
            
            case 3 : //studenter billet
                this.pris = 10;
                this.navn = "Studenter Billet";
                this.prisPrZone = 5;
                break;
                
            case 4 : //cykel billet
                this.pris = 15;
                this.navn = "Cykel Billet";
                this.prisPrZone = 9;
                break;
            default:
                break;
                
                
        }

        this.type = type;
        this.zoner = z;
        this.dato = new Date();
    }
    
    
    int getTotalPris(){
        if (zoner < 2){
            return pris;
        } else {
            return pris + prisPrZone * zoner;
        }
    }
    
    Date getUdløbstidspunkt(){
        Date udløb;
        if (zoner > 5){
            udløb = new Date(dato.getTime() + 3 * HOUR);
        } else if (zoner > 2){
            udløb = new Date(dato.getTime() + 2 * HOUR);
        } else {
            udløb = new Date(dato.getTime() + 1 * HOUR);
        }
        return udløb;
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
    
    
    
}
