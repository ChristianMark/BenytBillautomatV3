package automat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author chris & mads
 */
public class Billetautomatv2 {
	private int billetpris;    // Prisen for én billet.
	private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
	private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt
	private boolean montoertilstand;
        private ArrayList<Log_event> event_liste;         // opret liste-variabel
        private Date netopNu; // dato variabel
        private boolean debug = false;
	private ArrayList<Billet> Billetter; 
        
           
	/**
	 * Opret en billetautomat der saelger billetter til 10 kr.
	 */
	public Billetautomatv2() {
		billetpris = 10;
		balance = 0;
		antalBilletterSolgt = 0;
                event_liste = new ArrayList<Log_event>(); // opret liste-array af "Log_event" objekter
                Billetter = new ArrayList<Billet>();
                
                netopNu = new Date();
                event_liste.add(new Log_event(1,erMontoer())); // Tilføj "Log_event" objekt til event_listen

                
                
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
                event_liste.add(new Log_event(2, beloeb, true, erMontoer())); // Tilføj "Log_event" objekt til event_listen
            }else{
                System.out.println("Det indsatte beloeb er ugyldigt.");
                // Timestamp på hvornår et ugyldigt beløb er forsøgt indkastet
                event_liste.add(new Log_event(2, beloeb, false, erMontoer())); // Tilføj "Log_event" objekt til event_listen
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
                        event_liste.add(new Log_event(3, false, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                        return;
		}
                netopNu = new Date(); // Hent et nyt Date objekt
                event_liste.add(new Log_event(3, true, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                
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
            netopNu = new Date(); // Hent et nyt Date objekt
            
            if(balance < 0){ // Hvis balancen er negativ
                returbeloeb = 0;
                event_liste.add(new Log_event(4,balance,false, erMontoer())); // Tilføj "Log_event" objekt til event_listen
            }else{ // Hvis balancen er positiv eller 0
                returbeloeb = balance;
                event_liste.add(new Log_event(4,returbeloeb,true, erMontoer())); // Tilføj "Log_event" objekt til event_listen
            }
            balance = 0;
            System.out.println("Du faar "+returbeloeb+" kr retur");
            return returbeloeb;
	}

	
	void montoerLogin(String adgangskode) {
            netopNu = new Date(); // Hent et nyt Date objekt
            if ("1234".equals(adgangskode)) {
                    event_liste.add(new Log_event(5, Integer.parseInt(adgangskode), true, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                    montoertilstand = true;
                    System.out.println("Montoertilstand aktiveret");
            } else {
                    if(montoertilstand == true){ // Hvis montoeren bare logger ud
                        System.out.println("Montoertilstand deaktiveret");
                        event_liste.add(new Log_event(5, Integer.parseInt(adgangskode), false, erMontoer())); // Tilføj "Log_event" objekt til event_listen                          
                    }else{
                        System.out.println("Montoertilstand deaktiveret");
                        event_liste.add(new Log_event(5, Integer.parseInt(adgangskode), false, erMontoer())); // Tilføj "Log_event" objekt til event_listen
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
                    event_liste.add(new Log_event(6, billetpris, true, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                }else{
                    System.out.println("Billetprisen kan ikke vaere negativ.");
                    event_liste.add(new Log_event(6, billetpris, false, erMontoer())); // Tilføj "Log_event" objekt til event_listen                    
                }
            }else {
                    System.out.println("Afvist - log ind foerst");
                    event_liste.add(new Log_event(6, billetpris, false, erMontoer())); // Tilføj "Log_event" objekt til event_listen
            }
		
	}

	public void nulstil() {
            netopNu = new Date(); // Hent et nyt Date objekt
            if (montoertilstand) {
                antalBilletterSolgt = 0;
                event_liste.add(new Log_event(9, true, erMontoer())); // Tilføj "Log_event" objekt til event_listen                       
            } else {
                    System.out.println("Afvist - log ind foerst");
                    event_liste.add(new Log_event(9, false, erMontoer())); // Tilføj "Log_event" objekt til event_listen
            }
	}

	public void setAntalBilletterSolgt(int antalBilletterSolgt) {
		if (montoertilstand) {
			this.antalBilletterSolgt = antalBilletterSolgt;
                        event_liste.add(new Log_event(7,antalBilletterSolgt,true, erMontoer())); // Tilføj "Log_event" objekt til event_listen                        
		} else {
			System.out.println("Afvist - log ind foerst");
                        event_liste.add(new Log_event(7,antalBilletterSolgt,false, erMontoer())); // Tilføj "Log_event" objekt til event_listen
                        
		}
	}

	public boolean erMontoer() {
		return montoertilstand;
                // nice meme
	}
        
        public void udskrivLog_event_liste() {
            if (montoertilstand) {
                netopNu = new Date(); // Hent et nyt Date objekt
                System.out.println("============ Transaktioner pr. "+netopNu.toString()+"============"); // Udskrivning af log
		for (Log_event element : event_liste) {  // gennemloeb alle elementerne i loggen
                       System.out.println(element); 
		}      
                event_liste.add(new Log_event(8, true, erMontoer()));
                               
            }else {
                    System.out.println("Afvist - log ind foerst");
                    event_liste.add(new Log_event(8,false,erMontoer()));
            }
	}
        
        public int udskriver(int ID, int success_parameter){
            int tal = 0; // Antal udskrifter
            if(ID <0 || ID > Log_event.hojestID){ // Tjek om gyldigt ID
                System.out.println("Fejl i udskriver med ugyldigt ID: "+ ID);
                return -1;
            }
            
            for (Log_event element : event_liste) {
                if (ID != 0 && element.getId_nr() == ID) {
                    switch (success_parameter) {
                        case 0: // False
                            if(!element.isSucess()){
                                System.out.println(element);
                                tal++;
                            }   break;
                        case 1: // True
                            if(element.isSucess()){
                                System.out.println(element);
                                tal++;
                            }   break;
                        case 2: // Udskriv alt
                            System.out.println(element);
                            tal++;
                            break;
                        default:
                            System.out.println("Fejl i udskriver med ID: "+ ID+ " og success_parameter: "+ success_parameter);
                            return -1;
                    }
                } else if (ID == 0) {
                    switch (success_parameter) {
                        case 0: // False
                            if(!element.isSucess()){
                                System.out.println(element);
                                tal++;
                            }  break;
                        case 1: // True
                            if(element.isSucess()){
                                System.out.println(element);
                                tal++;
                            }  break;
                        case 2: // Udskriv alt
                            System.out.println(element);
                            tal++;
                            break;
                        default:
                            System.out.println("Fejl i udskriver med ID: "+ ID+ " og success_parameter: "+ success_parameter);
                            return -1;
                    }//end switch
                } //end else if
            }//end for-loop
            if(tal == 0){
                System.out.println("Der blev ikke fundet nogle log-elementer der svarede til søge kriteriet.");
            }
            return tal;
        }
        
        public int find_trans_over(int ID, int belob){
            int tal = 0;
            if(ID <0 || ID > Log_event.hojestID){ // Tjek om gyldigt ID
                System.out.println("Fejl i udskriver med ugyldigt ID: "+ ID);
                return -1;
            }
            
            for (Log_event element : event_liste) {
                if (ID != 0 && element.getId_nr() == ID) {
                    if (element.getArgument() >= belob){
                        System.out.println(element);
                        tal++;
                    }
                } else if (ID == 0) {
                    if (element.getArgument() >= belob){
                        System.out.println(element);
                        tal++;
                    }
                } //end else if
            }//end for-loop
            if(tal == 0){
                System.out.println("Der blev ikke fundet nogle log-elementer der svarede til søge kriteriet.");
            }
            return tal;
        }
}
