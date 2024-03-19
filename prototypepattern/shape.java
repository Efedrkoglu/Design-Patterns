/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypepattern;

/**
 *
 * @author Efe
 */
public abstract class shape {
    public int x;
    public int y;
    
    public shape() {
        
    }
    
    public shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public shape(shape target) {
        if(target != null) {
            this.x = target.x;
            this.y = target.y;
        }
    }
    
    public abstract shape clone();
    
    public void printShape() {
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
    }
}
