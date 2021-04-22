/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author tjser
 */
public class Sculpture extends Painting {
    
        private double depth;

    Sculpture(){
        super();
        this.depth = 0.0;
    }
   public Sculpture(String authorx, String namex, double heightx, double widthx, double depthx){
       super(authorx, namex, heightx, widthx);
       this.depth = depthx;

       


   }
   public double getVolume(){
       return getArea() * depth;
   }

   public String getDimensions(){
    String x = String.valueOf(getHeight());
    String y  = String.valueOf(getWidth());
    String z = String.valueOf(depth);
    String volume = String.valueOf(getVolume());

    return x + " high by " + y + " wide by "+ z + " deep; volume of " + volume + " in cubic inches";
   }
    
}
