/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Efe
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat cat = new orangeCat();
        toyCat toyCat = new robotToyCat();
        
        
        cat.meow();
        toyCat.makeNoise();
        
        toyCatAdapter tca = new toyCatAdapter(cat);// makes cat behave like a toy cat
        
        tca.makeNoise(); // cat behaves like a toy cat
    }
    
}
