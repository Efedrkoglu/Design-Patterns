/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweightpattern;

/**
 *
 * @author efe44
 */
public abstract class actor {
    public String role;
    public String weapon;
    public String mission;
    
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    
    public void getInfo() {
        System.out.println("--------------------");
        System.out.println("role: " + this.role);
        System.out.println("weapon: " + this.weapon);
        System.out.println("mission: " + this.mission);
        System.out.println("--------------------");
    }
}
