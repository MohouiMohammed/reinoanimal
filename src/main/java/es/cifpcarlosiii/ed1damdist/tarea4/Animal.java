package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa un animal genérico del reino animal.
 * Es la clase base de la jerarquía.
 */
public class Animal {

    /**
     * Nombre del animal.
     */
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Simula que el animal come.
     */
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    /**
     * Simula que el animal duerme.
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Simula la reproducción del animal.
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     * Relación entre animales.
     * @param a animal con el que se relaciona
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}