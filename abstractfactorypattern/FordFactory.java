/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactorypattern;

/**
 *
 * @author Efe
 */
public class FordFactory implements ICarFactory{

    @Override
    public Car createCar(String model, String color, int year) {
        return new Ford(model, color, year);
    }
    
}
