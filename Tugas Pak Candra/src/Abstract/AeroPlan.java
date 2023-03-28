/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Galaxy
 */
public class AeroPlan extends Vehicle {

    @Override
    public void fuel() {
        System.out.println("Fuels");
    }
    
    @Override
    public void walk() {
        System.out.println("Aeroplan is Flying");
    }
    
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
    
}
