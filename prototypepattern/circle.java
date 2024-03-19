/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypepattern;

/**
 *
 * @author Efe
 */
public class circle extends shape{
    private int radius;
    
    public circle() {
        
    }
    
    public circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    
    public circle(circle target) {
        super(target);
        if(target != null) {
            this.radius = target.radius;
        }
    }
    
    @Override
    public shape clone() {
        return new circle(this);
    }
    
    @Override
    public void printShape() {
        super.printShape();
        System.out.println("radius: " + this.radius);
    }
}
