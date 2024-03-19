/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Efe
 */
public class lazySingleton {
    private static lazySingleton instance;
    public int x;
    
    private lazySingleton(){}
    
    public static lazySingleton getInstance() {
        if(instance == null) {
            instance = new lazySingleton();
        }
        
        return instance;
    }
}
