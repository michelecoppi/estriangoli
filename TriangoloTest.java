/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estriangoli;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michele2306
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }

     @Test
    public void testTipoTriangolo() {
        System.out.println("TipoTriangolo");
        int base = 2;
        int cateto1 = 3;
        int cateto2 = 5;
        Triangolo instance = new Triangolo();
        String expResult = "scaleno";
        String result = instance.TipoTriangolo(base, cateto1, cateto2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of TriangoloPerimetro method, of class Triangolo.
     */
    @Test
    public void testTriangoloPerimetro() {
        System.out.println("TriangoloPerimetro");
        int lato1 = 3;
        int lato2 = 4;
        int lato3 = 3;
        Triangolo instance = new Triangolo();
        float expResult = 10;
        float result = instance.TriangoloPerimetro(lato1, lato2, lato3);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of TriangoloArea method, of class Triangolo.
     */
    @Test
    public void testTriangoloArea() {
        System.out.println("TriangoloArea");
        int lato1 = 37;
        int lato2 = 13;
        int lato3 = 40;
        Triangolo instance = new Triangolo();
        double expResult = 240;
        double result = instance.TriangoloArea(lato1, lato2, lato3);
        assertEquals(expResult, result, 0.0);

    }
    
}
