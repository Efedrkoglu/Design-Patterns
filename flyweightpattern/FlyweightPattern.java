/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flyweightpattern;

import java.util.Random;

/**
 *
 * @author Efe
 */
public class FlyweightPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] weapons = {"sword", "bow", "axe"};
        String[] roles = {"hero", "villian"};
        Random r = new Random();
        
        for(int i = 0; i < 10; i++) {
            actor a = actorFactory.getActor(roles[r.nextInt(roles.length)]);
            a.setWeapon(weapons[r.nextInt(weapons.length)]);
            a.getInfo();
        }
        
    }
    
}
