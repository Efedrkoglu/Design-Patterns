/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Efe
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        eagerSingleton a = eagerSingleton.getInstance();
//        a.x = 5;
//        
//        eagerSingleton b = eagerSingleton.getInstance();
//        
//        System.out.println(b.x);
        lazySingleton a = lazySingleton.getInstance();
        a.x = 2;
        
        lazySingleton b = lazySingleton.getInstance();
        
        System.out.println(b.x);
        
    }
    
}
