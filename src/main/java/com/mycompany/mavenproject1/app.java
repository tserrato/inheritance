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
public class app {
    public static void main(String[] args) {
        Painting one = new Painting("Picasso", "The Old Guitarist", 3, 2.75);
        Sculpture two = new Sculpture("Rodin", "The Thinker", 6.17,3.25,4.58);

        System.out.println("The Painting:");
        System.out.println(one.getName() + " by " + one.getAuthor() + "\n" + one.getDimensions());
        System.out.println("\n");
        System.out.println("The Sculpture:");
        System.out.println(two.getName() + " by " + two.getAuthor() + "\n" + two.getDimensions());
        System.out.println("\n");
        

    }
    
}
