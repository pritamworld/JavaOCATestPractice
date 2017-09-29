/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaocatestpractice.labdaexample;

import java.util.ArrayList;
import java.util.List;
import javaocatestpractice.advance.Elephant;

/**
 *
 * @author pritesh.patel
 */
public class TraditionalSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //print(animals, new CheckIfHopper()); // pass class that does check
        print(animals, b -> b.canHop());
        print(animals, b -> !b.canHop());
        
        Elephant e = new Elephant();
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
            {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
