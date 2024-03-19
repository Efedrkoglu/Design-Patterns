/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Efe
 */
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pizza pizza = new emptyPizza();
        
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
        
        pizza = new sauce(pizza);
        pizza = new cheese(pizza);
        pizza = new pepperoni(pizza);
        
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
    
}
