/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Efe
 */
public class carShowroom {
    
    public car getSportCar(carBuilder builder) {
        builder.setEnginePower(420);
        builder.setDoors(2);
        builder.setSeats(2);
        builder.setColor("Red");
        builder.setHasTrunk(true);
        builder.setPlate("1234");
        builder.setRimSize(17);
        builder.setEngineType("V6");
        return builder.buildCar();
    }
    
    public car getSUV(carBuilder builder) {
        builder.setEnginePower(200);
        builder.setSeats(5);
        builder.setDoors(4);
        builder.setColor("Black");
        builder.setHasTrunk(true);
        builder.setPlate("4321");
        builder.setRimSize(15);
        builder.setEngineType("V8");
        return builder.buildCar();
    }
    
    public car getHatchback(carBuilder builder) {
        builder.setEnginePower(180);
        builder.setSeats(5);
        builder.setDoors(4);
        builder.setColor("Blue");
        builder.setHasTrunk(true);
        builder.setPlate("5511");
        builder.setRimSize(14);
        builder.setEngineType("I4");
        return builder.buildCar();
    }
}
