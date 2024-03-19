/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Efe
 */
public class orangeCat implements Cat{

    @Override
    public void run() {
        System.out.println("cat is running");
    }

    @Override
    public void meow() {
        System.out.println("meow");
    }
    
}
