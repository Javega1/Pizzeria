
package pizzeria;


public class Pizzeria {

    public static void main(String[] args) {

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
