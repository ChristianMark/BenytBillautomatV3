/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author chris
 */
public class Billetautomatv2Test extends TestCase {

    public Billetautomatv2Test(String testName) {
        super(testName);
    }

    /**
     * Tester om montøren kan ændre billetpriserne for de forskellige billettyper.
     */
    public void testGetBilletpris() {
        System.out.println("getBilletpris testes--------------");
        double[] priser = {12, 10, 7, 10, 15};
        int type;
        Billetautomatv2 instance = new Billetautomatv2();
        instance.montoerLogin("1234");
        for (int i = 0; i < 5; i++) {
            type = i;
            double expResult = priser[type];
            double result = instance.getBilletpris(type);
            assertEquals(expResult, result, 0.0);
        }

    }

    /**
     * Tester om montøren kan logge ind med forskellige tegn og hvordan programmet opfører sig, overfor ugyldigt input.
     */
    public void testMontoerLogin() {
        System.out.println("montoerLogin testes--------------");
        String[] adgangskoder = {"12345", ",.-´", "æøå´", "\n   ", "1", "12"};
        Billetautomatv2 instance = new Billetautomatv2();
        for (int i = 0; i < adgangskoder.length; i++) {
            instance.montoerLogin(adgangskoder[i]);
            assertEquals(instance.erMontoer(), false);
        }
        instance.montoerLogin("1234");
        instance.montoerLogin("");
        instance.udskrivLog_event_liste(); // Debug
        assertEquals(false, instance.erMontoer());
    }

    /**
     * Tester om man kan tilføje billetter til kuurven og slette dem igen. Derudover testes også for om man kan slette billetter der ikke er i kurven.
     */
    public void testEndeligtKoeb() {
        System.out.println("endeligtKoeb testes----------");
        Billetautomatv2 instance = new Billetautomatv2();
        instance.montoerLogin("1234");

        //Første test - Slet billet der lige er købt
        instance.koebBilletter(0, 2); // Køber voksen billet med 2 zoner
        instance.sletBilletter(0, 2, 1); // Sletter 100 billetter af den salgs jeg lige har købt 
        instance.endeligtKoeb();
        System.out.println("\ntest1 er slut----------");

        //Anden test - Køb billet og slet den efter købet
        instance.indsaetPenge(1000); // Indsætter penge
        instance.koebBilletter(0, 2); // Køber voksen billet med 2 zoner
        instance.endeligtKoeb();
        instance.sletBilletter(0, 2, 100); // Sletter 100 billetter af den salgs jeg lige har købt 
        System.out.println("\ntest2 er slut----------");

        Billetautomatv2 instance3 = new Billetautomatv2();
        //Trejde test - Køb billet x og slet blillet y
        instance3.koebBilletter(0, 2); // Køber voksen billet med 2 zoner
        instance3.koebBilletter(1, 3); // Køber voksen billet med 3 zoner
        instance3.indsaetPenge(1000);
        instance3.sletBilletter(1, 2, 100); // Sletter 100 billetter af den salgs jeg lige har købt 
        instance3.endeligtKoeb(); // Begge billetter burde kunne ses da kriterierne ikke er opfyldte
        System.out.println("\ntest3 er slut----------");

        Billetautomatv2 instance4 = new Billetautomatv2();
        instance4.koebBilletter(4, 3); // Køber voksen billet med 3 zoner
        instance4.sletBilletter(4, 3, -100); // Sletter -100 billetter af den salgs jeg lige har købt 
        System.out.println("\ntest4 er slut----------");

        instance4.koebBilletter(134, 100); // Køber voksen billet med 3 zoner
        instance4.sletBilletter(4, 3, -100); // Sletter -100 billetter af den salgs jeg lige har købt 
        System.out.println("\ntest5 er slut----------");
        /*
        double expResult = priser[type];
        double result = instance.getBilletpris(type);
        assertEquals(expResult, result, 0.0);
         */
        System.out.println("\nendeligtKoeb er slut----------");
    }

    /**
     * Tester om montøren kan tage penge ud af maskinen
     */
    public void testtoemAutomat() {
        System.out.println("tøm automat testes----------");
        Billetautomatv2 instance = new Billetautomatv2();
        instance.montoerLogin("1234");
        instance.koebBilletter(1, 3); // Køber voksen billet med 3 zoner
        instance.indsaetPenge(1000);
        instance.endeligtKoeb();

        assertEquals(10 + 5, instance.getTotal(), 0.001);
        // Ungdomspris+1 zone

    }
    
        public void testGUI() throws InterruptedException {
        System.out.println("test GUI testes----------");
        Billetautomatv2 instance = new Billetautomatv2();
        JTabbedPane faneblade = new JTabbedPane();
        
        BA_Jpannel BApanel = new BA_Jpannel();
        Indkøbskurv_Ba_Jpanel BA_kurv = new Indkøbskurv_Ba_Jpanel();
        BApanel.setLogik(instance); 
        BA_kurv.setLogik(instance);
        faneblade.add("HovedSkærm", BApanel);
        faneblade.add("Indkøbskurv", BA_kurv);
        
        JFrame vindue = new JFrame("Faneblade");
        vindue.add( faneblade );
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
        vindue.pack();                  // lad vinduet selv bestemme sin størrelse
        vindue.setVisible(true);  
        
        
        
        instance.koebBilletter(0, 2);
        instance.koebBilletter(1, 3);
        instance.koebBilletter(2, 4);
        instance.koebBilletter(3, 5);
        instance.koebBilletter(4, 6);
        instance.koebBilletter(0, 7);
        instance.koebBilletter(0, 8);
        instance.koebBilletter(0, 10);
        
        
        // Så man kan nå at teste GUI'et
        //Thread.sleep(2000000);
        Thread.sleep(10000);
    }

}
