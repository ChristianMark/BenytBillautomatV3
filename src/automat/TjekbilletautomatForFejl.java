/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author chris
 */
public class TjekbilletautomatForFejl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Billetautomat automat = new Billetautomat();
        
        System.out.print("Der forsøges at sætte billetprisen uden at være logget ind: ");
        automat.setBilletpris(900); // burde blive ignoreret da vi ikke er logget ind

        int retur = automat.getBilletpris();
        if (retur != 10){
                System.out.println("FEJL, billetprisen kunne ændres!");			
        }
        
        System.out.print("Der forsøges at smide et negativt beløb i maskinen: ");
        automat.indsaetPenge(-100);
        int indkastede_penge = automat.getBalance();
        
        if(indkastede_penge < 0){
            System.out.println("FEJL, man kan smide negative penge i!");
        }
        
        // Køb billet uden at have penge nok
        System.out.println("Der forsøges nu købt en billet med "+automat.getBalance()+" kr. indkastet");
        automat.udskrivBillet();
        
        // Køb billet ved, at have penge nok
        automat.indsaetPenge(automat.getBilletpris());
        System.out.println("Der forsøges nu købt en billet med "+automat.getBalance()+" kr. indkastet");
        automat.udskrivBillet();
        
        //Forsøg, at få antal billetter solgt vist uden at være logget ind
        System.out.print("Forsøg, at få antal billetter solgt vist uden at være logget ind - ");
        int Billettersolgt = automat.getAntalBilletterSolgt();
        if(Billettersolgt != -1){
            System.out.println("FEJL, Antal billetter solgt kunne vises uden, at være logget ind!");	
        }
        
        //Forsøg, at få antallet af penge tjent vist uden at være logget ind
        System.out.print("Forsøg, at få antallet af penge tjent vist uden at være logget ind - ");
        int Total = automat.getTotal();
        if(Total != -1){
            System.out.println("FEJL, Antal billetter solgt kunne vises uden, at være logget ind!");	
        }   
        
        // Forsøg at få udskrevet loggen uden at være logget ind
        System.out.print("Forsøg at få udskrevet loggen uden at være logget ind - ");
        
        
        // Forsøg at nustille maskinen uden at være logget ind
        System.out.print("Forsøg at nustille maskinen uden at være logget ind - ");
        automat.nulstil();
               
        System.out.println("--------------------------\n\n\n");
        // Udskrivning af Log_event listen
        automat.montoerLogin("1234");
        automat.udskrivLog_event_liste();
        //Thread.sleep(10000);

        
    }
    
}
