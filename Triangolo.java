/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estriangoli;

/**
 *
 * @author michele2306
 */
public class Triangolo {
     public String TipoTriangolo(int base, int cateto1, int cateto2){
        String a;
    if(base==cateto1 && cateto1==cateto2){
    a="equilatero";
    return a;
    }
    if(base!=cateto1 && base!=cateto2 && cateto2!=cateto1){
    a="scaleno";
    return a;
    }
    if(base==cateto1 && base!=cateto2 || base==cateto2 && base!=cateto1 || cateto2==cateto1 && cateto2!=base){
    a="isoscele";
    return a;
    }
    a="rettangolo";
    return a;
    }
    
    public float TriangoloPerimetro(int lato1, int lato2, int lato3){
    return  lato1+lato2+lato3;
    }
    
    public double TriangoloArea(int lato1, int lato2, int lato3){
    double a= lato1+ lato2+ lato3;
    a=Math.sqrt((a/2)*(a/2-lato1)*(a/2-lato2)*(a/2-lato3));
    return a;
    }
}
