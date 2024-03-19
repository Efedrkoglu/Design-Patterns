/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Efe
 */
public class car {
    private int enginePower;
    private int seats;
    private int doors;
    private String color;
    private boolean hasTrunk;
    private String plate;
    private int rimSize;
    private String engineType;
    
    public car() {
        
    }
    
    public car(int enginePower, int seats, int doors, String color, boolean hasTrunk, String plate, int rimSize, String engineType) {
        this.enginePower = enginePower;
        this.seats = seats;
        this.doors = doors;
        this.color = color;
        this.hasTrunk = hasTrunk;
        this.plate = plate;
        this.rimSize = rimSize;
        this.engineType = engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasTrunk() {
        return hasTrunk;
    }

    public void setHasTrunk(boolean hasTrunk) {
        this.hasTrunk = hasTrunk;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getRimSize() {
        return rimSize;
    }

    public void setRimSize(int rimSize) {
        this.rimSize = rimSize;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    public void printCar() {
        System.out.println("-----------------------------");
        System.out.println("engine power: " + this.enginePower);
        System.out.println("seats: " + this.seats);
        System.out.println("doors: " + this.doors);
        System.out.println("color: " + this.color);
        System.out.println("has trunk: " + this.hasTrunk);
        System.out.println("plate: " + this.plate);
        System.out.println("rim size: " + this.rimSize);
        System.out.println("engine type: " + this.engineType);
        System.out.println("-----------------------------");
    }
}
