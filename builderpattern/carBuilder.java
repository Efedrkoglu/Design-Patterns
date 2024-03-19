/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Efe
 */
public class carBuilder {
    private car car;
    
    public carBuilder() {
        this.car = new car();
    }
    
    public car buildCar() {
        return new car(this.car.getEnginePower(), this.car.getSeats(),
                this.car.getDoors(), this.car.getColor(),
                this.car.isHasTrunk(), this.car.getPlate(),
                this.car.getRimSize(), this.car.getEngineType());
    }
    
    public void setEnginePower(int enginePower) {
        this.car.setEnginePower(enginePower);
    }
    
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }
    
    public void setDoors(int doors) {
        this.car.setDoors(doors);
    }
    
    public void setColor(String color) {
        this.car.setColor(color);
    }
    
    public void setHasTrunk(boolean hasTrunk) {
        this.car.setHasTrunk(hasTrunk);
    }
    
    public void setPlate(String plate) {
        this.car.setPlate(plate);
    }
    
    public void setRimSize(int rimSize) {
        this.car.setRimSize(rimSize);
    }
    
    public void setEngineType(String engineType) {
        this.car.setEngineType(engineType);
    }
}
