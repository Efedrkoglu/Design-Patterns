/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweightpattern;

import java.util.HashMap;

/**
 *
 * @author Efe
 */
public class actorFactory {
    
    private static HashMap<String, actor> hm = new HashMap<String, actor>();
    
    public static actor getActor(String role) {
        actor a = null;
        
        if(hm.containsKey(role))
            a = hm.get(role);
        else {
            if(role.equals("hero")) {
                System.out.println("new hero created");
                a = new hero();
            }
            else if(role.equals("villian")) {
                System.out.println("new villian created");
                a = new villian();
            }
            else {
                System.out.println("invalid role");
            }
            
            hm.put(role, a);
        }
        
        return a;
    }
}
