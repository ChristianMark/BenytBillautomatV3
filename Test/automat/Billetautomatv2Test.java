/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

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

    public void testGetBilletpris() {
        System.out.println("getBilletpris testes--------------");
        double[] priser = {12,10,7,10,15};
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


    public void testMontoerLogin() {
        System.out.println("montoerLogin testes--------------");
        String[] adgangskoder = {"12345",",.-´","æøå´","\n   ","1","12"};
        Billetautomatv2 instance = new Billetautomatv2();
        for (int i = 0; i < adgangskoder.length; i++) {
            instance.montoerLogin(adgangskoder[i]);
            assertEquals(instance.erMontoer(), false);
        }
        instance.montoerLogin("1234");
        instance.montoerLogin("");
        instance.udskrivLog_event_liste(); // Debug
        assertEquals(instance.erMontoer(), true);
    }


    public void testEndeligtKoeb() {
        System.out.println("endeligtKoeb testes----------");
        Billetautomatv2 instance = new Billetautomatv2();
        instance.montoerLogin("1234");
        
        //Første test - Slet billet der lige er købt
        instance.koebBilletter(0,2); // Køber voksen billet med 2 zoner
        instance.sletBilletter(0,2,1); // Sletter 100 billetter af den salgs jeg lige har købt 
        instance.endeligtKoeb();
        System.out.println("\ntest1 er slut----------");
        
        //Anden test - Køb billet og slet den efter købet
        instance.indsaetPenge(1000); // Indsætter penge
        instance.koebBilletter(0,2); // Køber voksen billet med 2 zoner
        instance.endeligtKoeb();
        instance.sletBilletter(0,2,100); // Sletter 100 billetter af den salgs jeg lige har købt 
        System.out.println("\ntest2 er slut----------");
        
        Billetautomatv2 instance3 = new Billetautomatv2();
        //Trejde test - Køb billet x og slet blillet y
        instance3.koebBilletter(0,2); // Køber voksen billet med 2 zoner
        instance3.koebBilletter(1,3); // Køber voksen billet med 3 zoner
        instance3.indsaetPenge(1000);
        instance3.sletBilletter(1,2,100); // Sletter 100 billetter af den salgs jeg lige har købt 
        instance3.endeligtKoeb(); // Begge billetter burde kunne ses da kriterierne ikke er opfyldte
        System.out.println("\ntest3 er slut----------");
        
        
        Billetautomatv2 instance4 = new Billetautomatv2();
        instance4.koebBilletter(4,3); // Køber voksen billet med 3 zoner
        instance4.sletBilletter(4,3,-100); // Sletter -100 billetter af den salgs jeg lige har købt 
        System.out.println("\ntest4 er slut----------");
        
        instance4.koebBilletter(134,100); // Køber voksen billet med 3 zoner
        instance4.sletBilletter(4,3,-100); // Sletter -100 billetter af den salgs jeg lige har købt 
         System.out.println("\ntest5 er slut----------");
        /*
        double expResult = priser[type];
        double result = instance.getBilletpris(type);
        assertEquals(expResult, result, 0.0);
        */
        System.out.println("\nendeligtKoeb er slut----------");
    }

    
}
