/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Efe
 */
public class cheese extends pizzaDecorator{
    private pizza pizza;
    
    public cheese(pizza pizza) {
        this.pizza = pizza;
        super.cost = 5;
        super.name = "cheese";
    }
    
    @Override
    public int getCost() {
        return pizza.getCost() + super.cost;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with " + super.name;
    }
}
