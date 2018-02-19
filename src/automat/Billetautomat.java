package automat;
import java.util.ArrayList; 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date; // Date-klassen er i pakken java.util

/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat {
	private int billetpris;    // Prisen for én billet.
	private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
	private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt
	private boolean montørtilstand;
        private ArrayList<String> Log_liste;         // opret liste-variabel
        private Date netopNu; // dato variabel
        private boolean debug = true;
	
        
           
	/**
	 * Opret en billetautomat der sælger billetter til 10 kr.
	 */
	public Billetautomat() {
		billetpris = 10;
		balance = 0;
		antalBilletterSolgt = 0;
                Log_liste = new ArrayList<String>(); // opret liste-objekt
                netopNu = new Date();
                Log_liste.add("Opsætning af automat gennemført.\nTimestamp: "+netopNu.toString());
                if(debug){
                    System.out.println(Log_liste.get(0));
                }
                
                
	}

	/**
	 * Giver prisen for en billet. 
	 */
	public int getBilletpris() {
		int resultat = billetpris;
		return resultat;
	}

	/**
	 * Modtag nogle penge (i kroner) fra en kunde.
	 */
	public void indsætPenge(int beløb) {
            if(beløb > 0){ // Tjek om der bliver indbetalt et gyldigt beløb
                balance = balance + beløb;
                Log_liste.add(netopNu.toString()+" Der blev indsat beløb: '"+beløb+"'");
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                }
            }else{
                System.out.println("Det indsatte beløb er ugyldigt.");
                Log_liste.add(netopNu.toString()+" Der blev forsøgt indbetalt beløb: '"+beløb+"' ,men det blev fanget af \"Tjek om gyldigt beløb\"");
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                }
            }
	}

	/**
	 * Giver balancen (beløbet maskinen har modtaget til den næste billet).
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * Udskriv en billet.
	 * Opdater total og nedskriv balancen med billetprisen
	 */
	public void udskrivBillet() {
		if (balance<billetpris) {
			System.out.println("Du mangler at indbetale nogle penge");
                        return;
		}
                Log_liste.add(netopNu.toString()+" Der blev udskrevet en billet");
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                }
                
                balance = balance - billetpris; // Udregner den nye balance EN gang
		System.out.println("##########B##T#########");
		System.out.println("# BlueJ Trafikselskab #");
		System.out.println("#                     #");
		System.out.println("#        Billet       #");
		System.out.println("#        " + billetpris + " kr.       #");
		System.out.println("#                     #");
		System.out.println("##########B##T#########");
		System.out.println("# Du har " + (balance) + " kr til gode#");
		System.out.println("##########B##T#########");
		System.out.println();

		antalBilletterSolgt = antalBilletterSolgt + 1;
		
	}


	public int returpenge() {
            int returbeløb;
            
            if(balance < 0){ // Hvis balancen er negativ
                returbeløb = 0;
            }else{ // Hvis balancen er positiv eller 0
                returbeløb = balance;
            }
            balance = 0;
            System.out.println("Du får "+returbeløb+" kr retur");
            
            Log_liste.add(netopNu.toString()+" Kunden fik "+returbeløb+" retur.");
            if(debug){
                System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
            }
            return returbeløb;
	}

	
	void montørLogin(String adgangskode) {
		if ("1234".equals(adgangskode)) {
			montørtilstand = true;
			System.out.println("Montørtilstand aktiveret");
			System.out.println("Du kan nu angive billetpris");
                        Log_liste.add(netopNu.toString()+" Succesfuld montørLogin registeret");
                        if(debug){
                            System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                        }
		} else {
			montørtilstand = false;
			System.out.println("Montørtilstand deaktiveret");
                        Log_liste.add(netopNu.toString()+" Ugyldigt montørLogin registeret med adgangskoden: '"+adgangskode+"'");
                        if(debug){
                            System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                        }
		}
                
	}


	public int getTotal() {
		if (montørtilstand) {
			return billetpris * antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
			return 0;
		}
	}

	public int getAntalBilletterSolgt() {
		if (montørtilstand) {
			return antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
			return 0;
		}
	}

	public void setBilletpris(int billetpris) {
            int billetpris_old = this.billetpris;
            if (this.montørtilstand) { // Billetprisen kan kun sættes som montør
                if(billetpris >= 0){ // Billetprisen kan ikke være negativ
                    this.billetpris = billetpris;
                    Log_liste.add(netopNu.toString()+" blev billetprisen ændret fra; '"+billetpris_old+"' til '"+billetpris+"'");
                    if(debug){
                        System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                    }
                }else{
                    System.out.println("Billetprisen kan ikke være negativ.");
                }
            }else {
                    System.out.println("Afvist - log ind først");
                    Log_liste.add(netopNu.toString()+" blev billetprisen forsøgt ændre fra; '"+billetpris_old+"' til '"+billetpris+"' af en der ikke var logget ind som montør");
                    if(debug){
                        System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                    }
            }
		
	}

	public void nulstil() {
		if (montørtilstand) {
		    antalBilletterSolgt = 0;
                    Log_liste.add(netopNu.toString()+" blev billetautomaten nulstillet af en montør");
                    if(debug){
                        System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                    }                        
		} else {
			System.out.println("Afvist - log ind først");
                        Log_liste.add(netopNu.toString()+" blev billetautomaten forsøgt nulstillet af en der ikke var logget ind som montør");
                        if(debug){
                            System.out.println(Log_liste.get(Log_liste.size()-1)); // Størrelsen af listen-1 er det nyeste element tilføjet til listen.
                        }
		}
	}

	public void setAntalBilletterSolgt(int antalBilletterSolgt) {
		if (montørtilstand) {
			this.antalBilletterSolgt = antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
		}
	}

	public boolean erMontør() {
		return montørtilstand;
                // nice meme
	}
        
        public void udskrivLog() {
            if (montørtilstand) {
                    
            } else {
                    System.out.println("Afvist - log ind først");
            }
	}
}