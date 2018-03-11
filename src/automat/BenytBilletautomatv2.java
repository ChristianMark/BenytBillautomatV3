package automat;

/**
 *
 * @author Chris && Mads
 */
public class BenytBilletautomatv2 {
    	static java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered Scanner klassen
        
	public static void main(String[] arg)
	{
		Billetautomatv2 automat = new Billetautomatv2();
                
		System.out.println("BenytBilletautomat version 3");
		System.out.println();
		
		while (true) {
			System.out.println("-----------------------------------------------");
			System.out.println("Balancen er paa " + automat.getBalance() + " kroner");
			System.out.println();
			System.out.println("Tast 1 for at indbetale penge");
			System.out.println("Tast 2 for at købe billet(ter)");
			System.out.println("Tast 3 for at faa returpengene");
                        System.out.println("Tast 4 for at udskrive alle billetter i indkøbskurven");
                        System.out.println("Tast 6 for at slette billetter fra indkøbskurven");
			System.out.println();
			System.out.println("Tast 10 for at logge ind som montoer");
			if (automat.erMontoer()) {
				System.out.println("Tast 11 for at se status (montoer)");
				System.out.println("Tast 12 for at nulstille (montoer)");
				System.out.println("Tast 13 for at saette billetpris (montoer)");
                                System.out.println("Tast 14 for at faa udskrevet en log");
                                System.out.println("Tast 15 for at udskrive log med soegekriterier");
				System.out.println("Tast 16 for at logge ud af montoertilstand");
			}
                        int valg = læsINTtastatur();
                        
			if (valg==1) {
				System.out.print("Skriv beloeb: ");
				double beloeb = læsDOUBLEtastatur();
				automat.indsaetPenge(beloeb);
			}
			else if (valg==2) {
				//automat.udskrivBillet();
                                System.out.println("Tast 0 for at købe en Voksen Billet til: "+Billet.getVoksenPris());
                                System.out.println("Tast 1 for at købe en Ungdoms Billet til: "+Billet.getUngdomsPris());
                                System.out.println("Tast 2 for at købe en Børne Billet til: "+Billet.getBarnePris());
                                System.out.println("Tast 3 for at købe en Studenter Billet til: "+Billet.getStudenterPris());
                                System.out.println("Tast 4 for at købe en Cykel Billet til: "+Billet.getCykelPris());
                                
                                int valg_billet;
                                do {
                                valg_billet = læsINTtastatur();
                                } while (valg_billet < 0 || valg_billet >4);
                                
                                System.out.println("Tast antal zoner fra 2-8");
                                System.out.println("Prisen per zone er: "+Billet.getBilletPrisPerZone(valg_billet));
                                int valg_zone = læsINTtastatur();
                                automat.koebBilletter(valg_billet,valg_zone);
                                break;
                            }
                        case 3://udskriv returpenge
                            {
                                automat.returpenge();
                                break;
                            }
                        case 4: //endeligt køb
                            automat.endeligtKoeb();
                            break;
                        case 6://slet biletter fra indkøbslisten
                            {
			}
			else if (valg==3) {
				automat.returpenge();
			}
                        else if(valg==4){
                                automat.endeligtKoeb();
                        }
                        else if(valg==6){
                                System.out.println("Tast 0 for at slette en Voksen Billet");
                                System.out.println("Tast 1 for at slette en Ungdoms Billet");
                                System.out.println("Tast 2 for at slette en Børne Billet");
                                System.out.println("Tast 3 for at slette en Studenter Billet");
                                System.out.println("Tast 4 for at slette en Cykel Billet");       
                                int valg_billet = læsINTtastatur();
                                System.out.println("Tast antal zoner fra 2-8");
                                int valg_zone = læsINTtastatur();
                                System.out.println("Tast antal ønskede billetter slettede");
                                int valg_antal = læsINTtastatur();
                                automat.sletBilletter(valg_billet,valg_zone,valg_antal);
                                break;
                            }
                        case 10: //log ind som montør
                            System.out.print("Skriv kode: ");
                            String kode = tastatur.next();
                            automat.montoerLogin(kode);
                            break;
                            
                        case 11://get totalt antal billetter solgt
                            System.out.println("Antal billetter solgt: " + automat.getAntalBilletterSolgt());
                            System.out.println("Total indkomst: " + automat.getTotal()+" kr");
                            break;
                            
                        case 12://nulstin maskine
                            automat.nulstil();
                            break;
                            
                        case 13://ændre prisen på billetter
                            
                            System.out.println("Tast 0 for at ændre prisen på en Voksen Billet");
                            System.out.println("Tast 1 for at ændre prisen på en Ungdoms Billet");
                            System.out.println("Tast 2 for at ændre prisen på en Børne Billet");
                            System.out.println("Tast 3 for at ændre prisen på en Studenter Billet");
                            System.out.println("Tast 4 for at ændre prisen på en Cykel Billet");       
                            int valg_billet = tastatur.nextInt();
                            tastatur.nextLine();
                            System.out.print("Skriv den nye pris: ");
                            int beloeb = tastatur.nextInt();
                            Billet.setBilletPris(valg_billet, beloeb);
                            break;
                            
                        case 14://udskriv hele loggen
                            //automat.udskrivLog();
                            automat.udskrivLog_event_liste(); // Bruger den nye log
                            break;
                            
                        case 15: //søg i loggen
                            System.out.println("\nTast et tal fra listen:");
                            System.out.println("1: Opsaettelse af maskinen");
                            System.out.println("2: Penge indsættelse");
                            System.out.println("3: Udskrevne billetter");
                            System.out.println("4: Penge returneret");
                            System.out.println("5: Montoer logins");
                            System.out.println("6: Aerndring af billetpriser");
                            System.out.println("7: Aerndring i antal solgte billetter");
                            System.out.println("8: Log udskrifter");
                            System.out.println("9: Nulstilling af automaten");
                            int valg2 = tastatur.nextInt();
                            tastatur.nextLine();
                            System.out.println("\nTast et tal fra listen:");
                            // Man skal ikke kunne søge efter paremetre ved alle events.
                            if(valg2 != 1 && valg2 != 3 && valg2 != 8 && valg2 != 9){
                                System.out.println("0 for at soege på paremetre. ");
                            }
                            System.out.println("1 for at soege efter succesfulde handlinger.");
                            System.out.println("2 for at soege efter fejlede handlinger.\n3 for at søge efter dato. \n4 for alle handlinger.");
                            int valg3 = tastatur.nextInt();
                            tastatur.nextLine();
                            if(valg3 == 0 && (valg2 != 1 && valg2 != 3 && valg2 != 8 && valg2 != 9)){
                                System.out.println("\nIndtast paremetre du vil soege over.");
                                int valg4 = tastatur.nextInt();
                                tastatur.nextLine();
                                automat.find_trans_over(valg2, valg4);
                            }else{
                                switch(valg3){
                                    case 1: automat.udskriver(valg2, 1);
                                    break;
                                    case 2: automat.udskriver(valg2, 0);
                                    break;
                                    case 3: System.out.println("\nTast et tal fra listen:");
                                    System.out.println("0: for at søge indenfor den sidste time");
                                    System.out.println("1: for at søge indenfor den sidste dag");
                                    System.out.println("2: for at søge indenfor den sidste uge");
                                    System.out.println("3: for at søge indenfor de sidste 30 dage");
                                    int valg4 = tastatur.nextInt();
                                    tastatur.nextLine();
                                    System.out.println();
                                    automat.datoudskriver(valg4,valg2);
                                    break;
                                    case 4: automat.udskriver(valg2, 2);
                                    break;
                                    default: System.out.println("Du valgte et ugyldigt svar: "+valg3);
                                    break;                                    
                                }
                            }
                            break;
                        case 16:
                            automat.montoerLogin("");
                            break;
                        default:
                            System.out.println("Ugyldigt valg, proev igen");
                            break;
                    }
		}
	}

    public static int læsINTtastatur() {
        int læstint = 0;

        try{
            læstint= tastatur.nextInt();
        }catch (Exception e) {
            tastatur.nextLine(); // Læs linjeskift
            return -1; // Returner et ugyldt menu valg
        }
        
        tastatur.nextLine(); // Læs linjeskift
        return læstint;
    }
    
    private static double læsDOUBLEtastatur() {
        double læstdouble = 0;

        try{
            læstdouble= tastatur.nextDouble();
        }catch (Exception e) {
            tastatur.nextLine(); // Læs linjeskift
            return -1; // Returner et ugyldt menu valg
        }
        
        tastatur.nextLine(); // Læs linjeskift
        return læstdouble;
    }
}
