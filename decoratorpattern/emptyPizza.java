/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Efe
 */
public class emptyPizza implements pizza{
    private int cost;
    private String name;
    
    public emptyPizza() {
        this.cost = 15;
        this.name = "Pizza";
    }
    
    @Override
    public int getCost() {
        return this.cost;
    }
    
    @Override
    public String getDescription() {
        return this.name;
    }
}
