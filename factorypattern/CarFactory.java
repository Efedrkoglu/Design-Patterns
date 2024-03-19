/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author Efe
 */
public class CarFactory {
    
    public static Car createCar(String model, String color, int year) {
        Car car;
        
        if("Mercedes".equalsIgnoreCase(model)) {
            car = new Mercedes(model, color, year);
        }
        else if("Honda".equalsIgnoreCase(model)) {
            car = new Honda(model, color, year);
        }
        else {
            throw new RuntimeException("Gecersiz model");
        }
        
        return car;
    }
}
