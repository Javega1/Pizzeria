/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria;

/**
 *
 * @author CETECOM
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizza pizza1 = new Pizza();
        
        String captura = pizza1.toString();
        
        System.out.println(captura);
        
        String tamanoPizza = pizza1.getTamano();
        System.out.println(tamanoPizza);
        
        pizza1.setMasa("Galleta");
        
        captura = pizza1.toString();
        System.out.println(captura);
        
        tamanoPizza = pizza1.getTamano();
        System.out.println(tamanoPizza);
    }
    
}
