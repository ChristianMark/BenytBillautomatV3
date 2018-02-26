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
	private boolean montoertilstand;
        private ArrayList<String> Log_liste;         // opret liste-variabel
        private ArrayList<Log_event> event_liste;         // opret liste-variabel
        private Date netopNu; // dato variabel
        private boolean debug = false;
	
        
           
	/**
	 * Opret en billetautomat der saelger billetter til 10 kr.
	 */
	public Billetautomat() {
		billetpris = 10;
		balance = 0;
		antalBilletterSolgt = 0;
                Log_liste = new ArrayList<String>(); // opret liste-objekt
                event_liste = new ArrayList<Log_event>(); // opret liste-array af "Log_event" objekter
                
                netopNu = new Date();
                
                Log_liste.add(netopNu.toString()+" Opsaetning af automat gennemfoert."); // Timestamp på hvornår automaten er blevet sat op
                event_liste.add(new Log_event("Opsaetning af automat gennemfoert",erMontoer())); // Tilføj "Log_event" objekt til event_listen
                
                
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
	public void indsaetPenge(int beloeb) {
            netopNu = new Date(); // Hent et nyt Date objekt
            if(beloeb > 0){ // Tjek om der bliver indbetalt et gyldigt beloeb
                balance = balance + beloeb;
                Log_liste.add(netopNu.toString()+" Der blev indsat beloeb: '"+beloeb+"'"); // Timestamp på hvornår der er blevet indsat 'beløb' antal penge
                event_liste.add(new Log_event("Der blev indsat beloeb", beloeb, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                }
            }else{
                System.out.println("Det indsatte beloeb er ugyldigt.");
                // Timestamp på hvornår et ugyldigt beløb er forsøgt indkastet
                Log_liste.add(netopNu.toString()+" Der blev forsoegt indbetalt beloeb: '"+beloeb+"' ,men det blev fanget af \"Tjek om gyldigt beloeb\"");
                event_liste.add(new Log_event("Der blev forsoegt indbetalt et udgyldigt beloeb", beloeb, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                }
            }
	}

	/**
	 * Giver balancen (beloebet maskinen har modtaget til den naeste billet).
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
                netopNu = new Date(); // Hent et nyt Date objekt
                Log_liste.add(netopNu.toString()+" Der blev udskrevet en billet");// Timestamp på hvornår automaten har udskrevet en billet
                event_liste.add(new Log_event("Der blev udskrevet en billet", erMontoer())); // Tilføj "Log_event" objekt til event_listen
                
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
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
            int returbeloeb;
            
            if(balance < 0){ // Hvis balancen er negativ
                returbeloeb = 0;
            }else{ // Hvis balancen er positiv eller 0
                returbeloeb = balance;
            }
            balance = 0;
            System.out.println("Du faar "+returbeloeb+" kr retur");
            
            netopNu = new Date(); // Hent et nyt Date objekt
            Log_liste.add(netopNu.toString()+" Kunden fik "+returbeloeb+" retur."); // Timestamp på hvornår og hvor mange returnpenge der er blevet givet tilbage
            event_liste.add(new Log_event("Der er blevet tilbagebetalt beloeb: ", returbeloeb, erMontoer())); // Tilføj "Log_event" objekt til event_listen
            if(debug){
                System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
            }
            return returbeloeb;
	}

	
	void montoerLogin(String adgangskode) {
            netopNu = new Date(); // Hent et nyt Date objekt
            if ("1234".equals(adgangskode)) {
                    montoertilstand = true;
                    System.out.println("Montoertilstand aktiveret");
                    System.out.println("Du kan nu angive billetpris");
                    Log_liste.add(netopNu.toString()+" Succesfuld montoerLogin registeret"); // Timestamp på hvornår montøren har logget succesfuldt ind
                    event_liste.add(new Log_event("Succesfuld montoerLogin registeret", erMontoer())); // Tilføj "Log_event" objekt til event_listen
                    if(debug){
                        System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                    }
            } else {
                    if(montoertilstand = true){ // Hvis montoeren bare logger ud
                        System.out.println("Montoertilstand deaktiveret");
                        Log_liste.add(netopNu.toString()+" Montoeren har logget ud."); // Timestamp på hvornår Montøren har logget ud
                        event_liste.add(new Log_event("Montoeren har logget ud ", erMontoer())); // Tilføj "Log_event" objekt til event_listen
                        if(debug){
                            System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                        }                           
                    }else{
                        
                        System.out.println("Montoertilstand deaktiveret");
                        // Timestamp på hvornår et ugyldigt montørlogin er prøvet
                        Log_liste.add(netopNu.toString()+" Ugyldigt montoerLogin registeret med adgangskoden: '"+adgangskode+"'");
                        event_liste.add(new Log_event("Ugyldigt montoerLogin registeret med adgangskoden '"+adgangskode+"'", erMontoer())); // Tilføj "Log_event" objekt til event_listen
                        if(debug){
                            System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                        }
                    }
                    montoertilstand = false;
            }
                
	}


	public int getTotal() {
		if (montoertilstand) {
			return billetpris * antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind foerst");
			return -1;
		}
	}

	public int getAntalBilletterSolgt() {
		if (montoertilstand) {
			return antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind foerst");
			return -1;
		}
	}

	public void setBilletpris(int billetpris) {
            netopNu = new Date(); // Hent et nyt Date objekt
            int billetpris_old = this.billetpris;
            if (this.montoertilstand) { // Billetprisen kan kun saettes som montoer
                if(billetpris >= 0){ // Billetprisen kan ikke vaere negativ
                    this.billetpris = billetpris;
                    // Timestamp på hvornår billetprisen er blevet ændret og til hvad
                    Log_liste.add(netopNu.toString()+" blev billetprisen aendret fra; '"+billetpris_old+"' til '"+billetpris+"'");
                    event_liste.add(new Log_event("Blev billetprisen aendret fra; '"+billetpris_old+"'",billetpris, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                    if(debug){
                        System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                    }
                }else{
                    System.out.println("Billetprisen kan ikke vaere negativ.");
                }
            }else {
                    System.out.println("Afvist - log ind foerst");
                    // Timestamp på ugyldigt forsøg på ændring af billetpris
                    Log_liste.add(netopNu.toString()+" blev billetprisen forsoegt aendre fra; '"+billetpris_old+"' til '"+billetpris+"' af en der ikke var logget ind som montoer");
                    event_liste.add(new Log_event("Blev billetprisen forsoegt aendret fra: '"+billetpris_old+"'",billetpris, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                    if(debug){
                        System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                    }
            }
		
	}

	public void nulstil() {
            netopNu = new Date(); // Hent et nyt Date objekt
            if (montoertilstand) {
                antalBilletterSolgt = 0;
                Log_liste.add(netopNu.toString()+" blev billetautomaten nulstillet af en montoer."); // Timestamp på hvornår automaten er blevet nulstillet
                event_liste.add(new Log_event("Blev billetautomaten nulstillet af en montoer", erMontoer())); // Tilføj "Log_event" objekt til event_listen
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                }                        
            } else {
                    System.out.println("Afvist - log ind foerst");
                    // Timestamp på hvornår automaten er forsøgt nulstillet
                    Log_liste.add(netopNu.toString()+" blev billetautomaten forsoegt nulstillet af en der ikke var logget ind som montoer.");
                    event_liste.add(new Log_event("Blev billetautomaten forsoegt nulstillet", erMontoer())); // Tilføj "Log_event" objekt til event_listen
                    if(debug){
                        System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                    }
            }
	}

	public void setAntalBilletterSolgt(int antalBilletterSolgt) {
		if (montoertilstand) {
			this.antalBilletterSolgt = antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind foerst");
		}
	}

	public boolean erMontoer() {
		return montoertilstand;
                // nice meme
	}
        
        public void udskrivLog() {
            if (montoertilstand) {
                netopNu = new Date(); // Hent et nyt Date objekt
                System.out.println("============ Transaktioner pr. "+netopNu.toString()); // Udskrivning af log
		for (String element : Log_liste) {  // gennemloeb alle elementerne i loggen
			System.out.println(element);
		}      
                System.out.println("============ Loggen er nu blevet clearet");
                Log_liste.add(netopNu.toString()+" blev Loggen clearet.");// Timestamp på hvornår loggen sidst er blevet læst og derfor clearet
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                }                
            } else {
                    System.out.println("Afvist - log ind foerst");
            }
	}
        public void udskrivLog_event_liste() {
            if (montoertilstand) {
                netopNu = new Date(); // Hent et nyt Date objekt
                System.out.println("============ Transaktioner pr. "+netopNu.toString()); // Udskrivning af log
		for (Log_event element : event_liste) {  // gennemloeb alle elementerne i loggen
			System.out.println(element);
		}      
                //System.out.println("============ Loggen er nu blevet clearet");
                //Log_liste.add(netopNu.toString()+" blev Loggen clearet.");// Timestamp på hvornår loggen sidst er blevet læst og derfor clearet
                event_liste.add(new Log_event("Loggen blev udskrevet",erMontoer()));
                
                if(debug){
                    System.out.println(Log_liste.get(Log_liste.size()-1)); // Stoerrelsen af listen-1 er det nyeste element tilfoejet til listen.
                }                
            } else {
                    System.out.println("Afvist - log ind foerst");
                    event_liste.add(new Log_event("Logget blev forsøgt udskrevet",erMontoer()));
            }
	}
}