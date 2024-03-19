/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Efe
 */
public class eagerSingleton {
    private static eagerSingleton instance = new eagerSingleton();
    public int x;
    
    private eagerSingleton(){}
    
    public static eagerSingleton getInstance() {
        return instance;
    }
}
