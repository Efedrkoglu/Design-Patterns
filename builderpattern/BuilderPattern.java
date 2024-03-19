/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Efe
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carShowroom cs = new carShowroom();
        carBuilder cb = new carBuilder();  
        
        car car1 = cs.getSUV(cb);
        car car2 = cs.getSportCar(cb);
        car car3 = customCarBuilder.startBuild().setEnginePower(500).setDoors(3).setSeats(1).setColor("purple").build();
        car car4 = customCarBuilder.startBuild().setEnginePower(10).setDoors(2).setSeats(8).setPlate("3131").build();
        
        car1.printCar();
        car2.printCar();
        car3.printCar();
        car4.printCar();
    }
    
}
