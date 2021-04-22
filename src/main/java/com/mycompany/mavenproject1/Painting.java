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
public class Painting {
    
    private String author;
    private String name;
    private double height;
    private double width;

    Painting(){
        this.author = "";
        this.name = "";
        this.height = 0.0;
        this.width = 0.0;
    }

    public Painting(String authorx, String namex, double heightx, double widthx){
        this.author = authorx;
        this.name = namex;
        this.height = heightx;
        this.width = widthx;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return height*width;
    }

    public String getDimensions(){
        String x = String.valueOf(height);
        String y  = String.valueOf(width);
        String area = String.valueOf(getArea());

        return x + " high by " + y + " wide; area of " + area + " in square inches";




    }
    
}
