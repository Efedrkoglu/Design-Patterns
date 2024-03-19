/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypepattern;

/**
 *
 * @author Efe
 */
public class square extends shape{
    private int width;
    
    public square() {
        
    }
    
    public square(int x, int y, int width) {
        super(x, y);
        this.width = width;
    }
    
    public square(square target) {
        super(target);
        if(target != null) {
            this.width = target.width;
        }
    }
    
    @Override
    public shape clone() {
        return new square(this);
    }
    
    @Override
    public void printShape() {
        super.printShape();
        System.out.println("width: " + this.width);
    }
}
