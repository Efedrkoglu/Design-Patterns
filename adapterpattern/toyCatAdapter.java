/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Efe
 */
public class toyCatAdapter implements toyCat{
    private Cat cat;
    
    public toyCatAdapter(Cat cat) {
        this.cat = cat;
    }
    
    @Override
    public void makeNoise() {
        cat.meow();
    }
    
}
