/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypattern;

/**
 *
 * @author Efe
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("Mercedes", "Black", 2021);
        Car car2 = CarFactory.createCar("Honda", "White", 2022);
        
        if(car1 instanceof Honda)
            System.out.println("This car is a Honda");
        else 
            System.out.println("This car is not a Honda");
    }
    
}
