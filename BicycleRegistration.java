/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;

/**
 *
 * @author ASUS
 */
public class BicycleRegistration {
    public static void main (String[] args) {
        Bicycle bike1, bike2;
        String owner1, owner2;
        
        bike1 = new Bicycle();
        bike1.setOwnerName("Adam Smith");
        
        bike2 = new Bicycle();
        bike2.setOwnerName("Ben Jones");
        
        owner1 = bike1.getOwnerName();
        owner2 = bike2.getOwnerName();
        
        System.out.println(owner1 + "owns a bicycle.");
        System.out.println("also owns a bicycle." + owner2);
    }
}
