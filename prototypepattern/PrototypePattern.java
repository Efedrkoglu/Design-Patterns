/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototypepattern;

/**
 *
 * @author Efe
 */
public class PrototypePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circle c1 = new circle(3, 1, 2);
        circle c2 = (circle)c1.clone();
        
        square s1 = new square(-3, 4, 4);
        square s2 = (square)s1.clone();
        
        c2.printShape();
        s2.printShape();
    }
    
}
