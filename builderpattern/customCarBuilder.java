/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Efe
 */
public class customCarBuilder {
    private int enginePower;
    private int seats;
    private int doors;
    private String color;
    private boolean hasTrunk;
    private String plate;
    private int rimSize;
    private String engineType;
    
    public static customCarBuilder startBuild() {
        return new customCarBuilder();
    }
    
    public car build() {
        return new car(enginePower, seats, doors, color, hasTrunk, plate, rimSize, engineType);
    }

    public customCarBuilder setEnginePower(int enginePower) {
        this.enginePower = enginePower;
        return this;
    }

    public customCarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public customCarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public customCarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public customCarBuilder setHasTrunk(boolean hasTrunk) {
        this.hasTrunk = hasTrunk;
        return this;
    }

    public customCarBuilder setPlate(String plate) {
        this.plate = plate;
        return this;
    }

    public customCarBuilder setRimSize(int rimSize) {
        this.rimSize = rimSize;
        return this;
    }

    public customCarBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
 
}
