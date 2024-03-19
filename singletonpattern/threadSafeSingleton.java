/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Efe
 */
public class threadSafeSingleton {
    private static threadSafeSingleton instance;
    public int x;
    
    private threadSafeSingleton(){}
    
    public static threadSafeSingleton getInstance() {
        synchronized (threadSafeSingleton.class) {
            if(instance == null)
                instance = new threadSafeSingleton();
        }
        
        return instance;
    }
}
