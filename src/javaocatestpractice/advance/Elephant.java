/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaocatestpractice.advance;

/**
 *
 * @author pritesh.patel
 */
public class Elephant extends Mammal{

    /**
     *
     */
    public Elephant() { // DOES NOT COMPILE 
        super(10);
    }
    
    public Elephant(int age) { // DOES NOT COMPILE 
        super(20);
    }
}
