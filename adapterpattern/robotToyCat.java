/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Efe
 */
public class robotToyCat implements toyCat{

    @Override
    public void makeNoise() {
        System.out.println("mechanic meow");
    }
    
}
