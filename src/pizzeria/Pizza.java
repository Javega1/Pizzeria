package pizzeria;

public class Pizza {
    private String nombre, tamano, masa;

    public Pizza(String nombre, String tamano, String masa) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }

    public Pizza() {
    }

    public String getTamano() {
        return tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void preparar(){
        System.out.println("Se esta preparando la pizza sin argumentos");
    }
    
    public void preparar(int entrada){
        System.out.println("Se esta preparando la pizza con 1 argumento");
    }
    
    public void preparar(int entrada, String entrada2){
        System.out.println("Se esta preparando la pizza con 2 argumentos");
    }

    public void calentar(){
        System.out.println("Se esta calentando la pizza");
    }

    @Override
    public String toString() {
        return "Pizza{" + "nombre=" + nombre + ", tamano=" + tamano + ", masa=" + masa + '}';
    }
 
}


