/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class BilletautomatTest {
    
    public BilletautomatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBilletpris method, of class Billetautomat.
     */
    @Test
    public void testGetBilletpris() {
        System.out.println("getBilletpris testes--------------");
        Billetautomat instance = new Billetautomat();
        int expResult = 10;
        instance.montoerLogin("1234");
        int result = instance.getBilletpris();
        assertEquals(expResult, result);
    }

    /**
     * Test of indsaetPenge method, of class Billetautomat.
     */
    @Test
    public void testIndsaetPenge() {
        System.out.println("indsaetPenge testes--------------");
        int beloeb = 42;
        Billetautomat instance = new Billetautomat();
        instance.indsaetPenge(beloeb);
        
        assertEquals(instance.getBalance(), beloeb);
    }

     /**
     * Test of indsaetPenge method, of class Billetautomat.
     */
    @Test
    public void testIndsaetPenge_sommontoer() {
        System.out.println("indsaetPenge som montør testes--------------");
        int beloeb = 42;
        Billetautomat instance = new Billetautomat();
        instance.montoerLogin("1234");
        instance.indsaetPenge(beloeb);        
        assertEquals(instance.getBalance(), beloeb);
    }
    
    /**
     * Test of getBalance method, of class Billetautomat.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance testes--------------");
        Billetautomat instance = new Billetautomat();
        instance.montoerLogin("1234");
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
    }

    /**
     * Test of udskrivBillet method, of class Billetautomat.
     */
    @Test
    public void testUdskrivBillet() {
        System.out.println("udskriver en Billet: testes--------------");
        Billetautomat instance = new Billetautomat();
        instance.indsaetPenge(10);
        instance.udskrivBillet();
    }

    /**
     * Test of returpenge method, of class Billetautomat.
     */
    @Test
    public void testReturpenge() {
        System.out.println("returpenge testes--------------");
        Billetautomat instance = new Billetautomat();
        int expResult = 10;
        instance.indsaetPenge(expResult);
        int result = instance.returpenge();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of returpenge method, of class Billetautomat.
     */
    @Test
    public void testReturpenge_negativ() {
        System.out.println("returpenge negativ testes--------------");
        Billetautomat instance = new Billetautomat();
        int expResult = 0;
        instance.indsaetPenge(-10);
        int result = instance.returpenge();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of montoerLogin method, of class Billetautomat.
     */
    @Test
    public void testMontoerLogin() {
        System.out.println("montoerLogin testes--------------");
        String adgangskode = "1234";
        Billetautomat instance = new Billetautomat();
        instance.montoerLogin(adgangskode);
        assertEquals(instance.erMontoer(), true);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Billetautomat.
     */
    @Test
    public void testGetTotal_SomMontoer() {
        System.out.println("getTotal som montør testes--------------");
        Billetautomat instance = new Billetautomat();
        instance.montoerLogin("1234");
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getTotal method, of class Billetautomat.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal testes--------------");
        Billetautomat instance = new Billetautomat();
        int expResult = -1;
        int result = instance.getTotal();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of getAntalBilletterSolgt method, of class Billetautomat.
     */
    @Test
    public void testGetAntalBilletterSolgt() {
        System.out.println("getAntalBilletterSolgt testes--------------");
        Billetautomat instance = new Billetautomat();
        int expResult = -1;
        int result = instance.getAntalBilletterSolgt();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setBilletpris method, of class Billetautomat.
     */
    @Test
    public void testSetBilletpris_sommontoer() {
        System.out.println("setBilletpris som montør testes--------------");
        int billetpris = 100;
        Billetautomat instance = new Billetautomat();
        instance.montoerLogin("1234");
        instance.setBilletpris(billetpris);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getBilletpris(),100);
    }

    /**
     * Test of nulstil method, of class Billetautomat.
     */
    @Test
    public void testNulstil() {
        System.out.println("nulstil testes--------------");
        Billetautomat instance = new Billetautomat();
        int beloeb = 100;
        System.out.println("Indsætter penge 100");instance.indsaetPenge(beloeb);
        instance.udskrivBillet();
        instance.montoerLogin("1234");
        int test1 = instance.getBalance();
        assertEquals((beloeb-instance.getBilletpris()), test1); // balancen efter, at have købt en billet
        assertEquals(instance.getTotal(), instance.getBilletpris()); // En billet købt
        instance.nulstil();
        assertEquals(instance.getTotal(), 0); // Antal solgte billetter*billetprisen
        int test2 = instance.getAntalBilletterSolgt(); // Antal billetter solgte
        assertEquals(0, test2);
    }

    /**
     * Test of setAntalBilletterSolgt method, of class Billetautomat.
     */
    @Test
    public void testSetAntalBilletterSolgt() {
        System.out.println("setAntalBilletterSolgt testes--------------");
        int antalBilletterSolgt = 0;
        Billetautomat instance = new Billetautomat();
        instance.setAntalBilletterSolgt(antalBilletterSolgt);
        assertEquals(-1,instance.getAntalBilletterSolgt());
    }
     /**
     * Test of setAntalBilletterSolgt method, of class Billetautomat.
     */
    @Test
    public void testSetAntalBilletterSolgt_sommontoer() {
        System.out.println("setAntalBilletterSolgt som montør testes--------------");
        int antalBilletterSolgt = 42;
        Billetautomat instance = new Billetautomat();
        instance.montoerLogin("1234");
        assertEquals(instance.getAntalBilletterSolgt(), 0);
        instance.setAntalBilletterSolgt(antalBilletterSolgt);
        assertEquals(instance.getAntalBilletterSolgt(), 42);
    }

    /**
     * Test of udskrivLog method, of class Billetautomat.
     */
    @Test
    public void testUdskrivLog() {
        System.out.println("udskrivLog  testes--------------");
        Billetautomat instance = new Billetautomat();
        System.out.print("Udskriver billet:\n");instance.udskrivBillet();
        instance.indsaetPenge(1);
        System.out.print("Få balancen: "+instance.getBalance());
        System.out.print("\nFå billetprisen: "+instance.getBilletpris());
        System.out.print("\nFå total: ");instance.getTotal();
        instance.indsaetPenge(100);
        System.out.println("Få balancen: "+instance.getBalance());
    
        
        instance.montoerLogin("1234");
        System.out.print("Udskriver billet:\n");instance.udskrivBillet();
        System.out.print("Få balancen: "+instance.getBalance());
        System.out.print("\nFå billetprisen: "+instance.getBilletpris());
        System.out.println("\nFå total: "+instance.getTotal());
        System.out.println("Indsætter penge");
        instance.indsaetPenge(100);
        instance.udskrivLog_event_liste();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
