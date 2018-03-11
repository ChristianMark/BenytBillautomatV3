/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import junit.framework.TestCase;

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

    public void testGetBilletprisPerZone() {
        System.out.println("getBilletprisPerZone testes--------------");
        int type = 0;
        Billetautomatv2 instance = new Billetautomatv2();
        double expResult = 0.0;
        double result = instance.getBilletprisPerZone(type);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testIndsaetPenge() {
        System.out.println("indsaetPenge");
        double beloeb = 0.0;
        Billetautomatv2 instance = new Billetautomatv2();
        instance.indsaetPenge(beloeb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testGetBalance() {
        System.out.println("getBalance");
        Billetautomatv2 instance = new Billetautomatv2();
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testReturpenge() {
        System.out.println("returpenge");
        Billetautomatv2 instance = new Billetautomatv2();
        double expResult = 0.0;
        double result = instance.returpenge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testMontoerLogin() {
        System.out.println("montoerLogin");
        String adgangskode = "1234";
        Billetautomatv2 instance = new Billetautomatv2();
        instance.montoerLogin(adgangskode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testGetTotal() {
        System.out.println("getTotal");
        Billetautomatv2 instance = new Billetautomatv2();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSetBilletpris() {
        System.out.println("setBilletpris");
        int type = 0;
        double billetpris = 0.0;
        Billetautomatv2 instance = new Billetautomatv2();
        instance.setBilletpris(type, billetpris);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSetBilletprisPerZone() {
        System.out.println("setBilletprisPerZone");
        int type = 0;
        double billetpris = 0.0;
        Billetautomatv2 instance = new Billetautomatv2();
        instance.setBilletprisPerZone(type, billetpris);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testNulstil() {
        System.out.println("nulstil");
        Billetautomatv2 instance = new Billetautomatv2();
        instance.nulstil();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testGetAntalBilletterSolgt() {
        System.out.println("getAntalBilletterSolgt");
        Billetautomatv2 instance = new Billetautomatv2();
        int expResult = 0;
        int result = instance.getAntalBilletterSolgt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSetAntalBilletterSolgt() {
        System.out.println("setAntalBilletterSolgt");
        int type = 0;
        int antalBilletterSolgt = 0;
        Billetautomatv2 instance = new Billetautomatv2();
        instance.setAntalBilletterSolgt(type, antalBilletterSolgt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testErMontoer() {
        System.out.println("erMontoer");
        Billetautomatv2 instance = new Billetautomatv2();
        boolean expResult = false;
        boolean result = instance.erMontoer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testUdskrivLog_event_liste() {
        System.out.println("udskrivLog_event_liste");
        Billetautomatv2 instance = new Billetautomatv2();
        instance.udskrivLog_event_liste();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testUdskriver() {
        System.out.println("udskriver");
        int ID = 0;
        int success_parameter = 0;
        Billetautomatv2 instance = new Billetautomatv2();
        int expResult = 0;
        int result = instance.udskriver(ID, success_parameter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testFind_trans_over() {
        System.out.println("find_trans_over");
        int ID = 0;
        double belob = 0.0;
        Billetautomatv2 instance = new Billetautomatv2();
        int expResult = 0;
        int result = instance.find_trans_over(ID, belob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testDatoudskriver() {
        System.out.println("datoudskriver");
        int valg4 = 0;
        int ID = 0;
        Billetautomatv2 instance = new Billetautomatv2();
        instance.datoudskriver(valg4, ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testKoebBilletter() {
        System.out.println("koebBilletter");
        int valg_billet = 0;
        int valg_zone = 0;
        Billetautomatv2 instance = new Billetautomatv2();
        instance.koebBilletter(valg_billet, valg_zone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSletBilletter() {
        System.out.println("sletBilletter");
        int valg_billet = 0;
        int valg_zone = 0;
        int valg_antal = 0;
        Billetautomatv2 instance = new Billetautomatv2();
        instance.sletBilletter(valg_billet, valg_zone, valg_antal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        Billetautomatv2 instance = new Billetautomatv2();
        double expResult = 0.0;
        double result = instance.getTotalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
