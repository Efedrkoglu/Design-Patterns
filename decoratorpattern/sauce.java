/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Efe
 */
public class sauce extends pizzaDecorator{
    private pizza pizza;
    
    public sauce(pizza pizza) {
        this.pizza = pizza;
        super.cost = 5;
        super.name = "sauce";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + super.cost;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " with " + super.name;
    }
    
    
}
