/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstractfactorypattern;

/**
 *
 * @author Efe
 */
public interface ICarFactory {
    Car createCar(String model, String color, int year);
}
