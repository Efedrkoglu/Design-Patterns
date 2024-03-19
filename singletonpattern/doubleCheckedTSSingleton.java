/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Efe
 */
public class doubleCheckedTSSingleton {
    private static doubleCheckedTSSingleton instance;
    public int x;
    
    private doubleCheckedTSSingleton(){}
    
    public static doubleCheckedTSSingleton getInstance() {
        if(instance == null) {
            synchronized (doubleCheckedTSSingleton.class) {
                if(instance == null)
                    instance = new doubleCheckedTSSingleton();
            }
        }
        
        return instance;
    }
}
