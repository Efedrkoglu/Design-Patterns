/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactorypattern;

/**
 *
 * @author Efe
 */
public class AbstractFactoryPattern {

    public static void carInfo(Car car) {
        if(car instanceof Mercedes)
            System.out.println("this car is a Mercedes");
        else if(car instanceof Honda)
            System.out.println("this car is a Honda");
        else if(car instanceof Ford)
            System.out.println("this car is a Ford");
        else 
            System.out.println("this car is something else");
    }
    
    public static void main(String[] args) {
        MercedesFactory mf = new MercedesFactory();
        HondaFactory hf = new HondaFactory();
        FordFactory ff = new FordFactory();
        
        
        Car car1 = mf.createCar("Mercedes", "Silver", 2020);
        Car car2 = hf.createCar("Honda", "Red", 2018);
        Car car3 = ff.createCar("Ford", "Blue", 2022);
        
        carInfo(car3);
        carInfo(car2);
        carInfo(car1);
    }
    
}
