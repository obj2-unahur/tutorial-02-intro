package practica;

public abstract class Animal {
    private String nombre;
    private int peso;
    private int cantidadDeOjos;

    public Animal(String nombre, int peso, int cantidadDeOjos) {
        this.nombre = nombre;
        this.peso = peso;
        this.cantidadDeOjos = cantidadDeOjos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int getCantidadDeOjos() {
        return cantidadDeOjos;
    }

    public boolean puedeNadar() {
        return true;
    }

    abstract public void comer();
    abstract public void moverse();
}
